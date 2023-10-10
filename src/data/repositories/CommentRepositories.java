package data.repositories;

import data.models.Comment;

public interface CommentRepositories {
    Comment save(Comment comment);
    Comment findById(int id);
    void delete(int id);
    void  deleteAll();
    long count();
}
