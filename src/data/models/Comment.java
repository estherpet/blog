package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private  String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(LocalDateTime dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    private int userId;
    private LocalDateTime dateOfComment = LocalDateTime.now();
}
