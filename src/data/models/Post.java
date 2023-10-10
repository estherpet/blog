package data.models;

import java.time.LocalDateTime;

public class Post {
    private  int id;
    private String title;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private  int createdId;
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getCreatedId() {
        return createdId;
    }

    public void setCreatedId(int createdId) {
        this.createdId = createdId;
    }



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private  String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
