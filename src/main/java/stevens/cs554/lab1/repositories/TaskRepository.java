package stevens.cs554.lab1.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import stevens.cs554.lab1.domain.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
}
