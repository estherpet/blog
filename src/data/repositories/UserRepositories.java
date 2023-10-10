package data.repositories;

import data.models.User;

import java.util.List;

public interface UserRepositories {
    User save (User user);
    User findById(int id);
    List<User> findAll();
    void  delete(int id);
    void deleteAll();
    User findByUsername(String username);
    long count();
}
