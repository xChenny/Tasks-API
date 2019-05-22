package stevens.cs554.lab1.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class Comment {
    private String id;
    private String name;
    private String comment;

    public Comment(String name, String comment) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.comment = comment;
    }
}
