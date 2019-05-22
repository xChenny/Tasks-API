package stevens.cs554.lab1.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "task")
@Data
@Builder
public class Task {
    @Id
    private String id;
    private String title;
    private String description;
    private int hoursEstimated;
    private boolean completed;
    //    @Singular allows use to instantiate List or collections
//    in the builder, but not in the Task itself
//    ie: Task.builder()
//            .comment(new Comment("hey", "andy"))
//            .comment(new Comment("yo", "andy"))
    @Singular
    private List<Comment> comments;
}
