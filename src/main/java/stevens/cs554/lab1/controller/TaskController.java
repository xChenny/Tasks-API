package stevens.cs554.lab1.controller;

import org.springframework.web.bind.annotation.*;
import stevens.cs554.lab1.domain.Comment;
import stevens.cs554.lab1.domain.Task;
import stevens.cs554.lab1.services.TaskService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(TaskController.BASE_URL)
public class TaskController {
    public static final String BASE_URL = "api/tasks";

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    List<Task> getAllTask() {
        return taskService.findAllTasks();
    }


    @GetMapping("/{id}")
    Task getTaskById(@PathVariable String id) {
        return taskService.findTaskById(id);
    }

    @PostMapping
    Task saveTask(@RequestBody Task newTask) {
        return taskService.saveTask(newTask);
    }

    @PutMapping("/{id}")
    Task putTask(@PathVariable String id, @RequestBody Task newTask) {
        return taskService.putTask(id, newTask);
    }

    @PatchMapping("/{id}")
    Task patchTask(@PathVariable String id, @RequestBody Map<String, Object> diff) {
        return taskService.patchTask(id, diff);
    }

    @PostMapping("/{id}/comments")
    Task saveComment(@PathVariable String id, @RequestBody Comment newComment) {
        return taskService.saveComment(id, newComment);
    }

    @DeleteMapping("/{id}/{cid}")
    Task deleteComment(@PathVariable String id, @PathVariable String cid) {
        return taskService.deleteComment(id, cid);
    }
}
