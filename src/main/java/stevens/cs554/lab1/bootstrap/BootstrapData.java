package stevens.cs554.lab1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stevens.cs554.lab1.domain.Task;
import stevens.cs554.lab1.repositories.TaskRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private TaskRepository taskRepository;

    public BootstrapData(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (taskRepository.count() == 0) {
            Task t1 = Task.builder()
                    .title("First Data")
                    .description("A test task")
                    .hoursEstimated(4)
                    .completed(false)
                    .build();
            taskRepository.save(t1);


            Task t2 = Task.builder()
                    .title("Second Data")
                    .description("boi")
                    .hoursEstimated(5)
                    .completed(true)
                    .build();
            taskRepository.save(t2);


            System.out.println("Created first tasks " + taskRepository.count());
        } else {
            System.out.println("There's already stuff in the repository.");
        }
    }
}
