package data.repositories;

import data.models.Post;

import java.util.List;

public interface PostRepositories {
    Post save (Post post);
    Post findById(int id);
    List <Post> findAll();
    void  delete(int id);
    void  deleteAll();
    long count();
}
