package stevens.cs554.lab1.services;

import org.springframework.stereotype.Service;
import stevens.cs554.lab1.domain.Comment;
import stevens.cs554.lab1.domain.Task;
import stevens.cs554.lab1.repositories.TaskRepository;

import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findTaskById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task newTask) {
        return taskRepository.save(newTask);
    }

    @Override
    public Task putTask(String id, Task newTask) {
        newTask.setId(id);
        return taskRepository.save(newTask);
    }

    @Override
    public Task saveComment(String id, Comment newComment) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task == null) {
            System.out.println("Task with id = " + id + " does not exist!");
            return null;
        }
        List<Comment> comments = task.getComments();
        comments.add(newComment);
        task.setComments(comments);
        return taskRepository.save(task);
    }

    @Override
    public Task deleteComment(String id, String cid) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task == null) {
            System.out.println("Task with id = " + id + " does not exist!");
            return null;
        }
        List<Comment> comments = task.getComments();
        for (int i = 0; i < comments.size(); i++) {
            Comment c = comments.get(i);
            if (c.getId().equals(cid)) {
                comments.remove(i);
                break;
            }
        }
        return taskRepository.save(task);
    }

    @Override
    public Task patchTask(String id, Map<String, Object> diff) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task == null) {
            System.out.println("Task with id = " + id + " does not exist!");
            return null;
        }
        for (String key : diff.keySet()) {
            if (key.equals("title")) {
                task.setTitle(diff.get(key).toString());
            } else if (key.equals("description")) {
                task.setDescription(diff.get(key).toString());
            } else if (key.equals("hoursEstimated")) {
                task.setHoursEstimated(Integer.parseInt(diff.get(key).toString()));
            } else if (key.equals("completed")) {
                task.setCompleted(Boolean.valueOf(diff.get(key).toString()));
            }
        }

        return taskRepository.save(task);
    }
}
