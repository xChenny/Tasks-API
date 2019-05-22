package stevens.cs554.lab1.services;

import stevens.cs554.lab1.domain.Comment;
import stevens.cs554.lab1.domain.Task;

import java.util.List;
import java.util.Map;

public interface TaskService {
    Task findTaskById(String id);

    List<Task> findAllTasks();

    Task saveTask(Task newTask);

    Task putTask(String id, Task newTask);

    Task saveComment(String id, Comment newComment);

    Task deleteComment(String id, String cid);

    Task patchTask(String id, Map<String, Object> diff);
}
