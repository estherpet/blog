package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoriesImplementation implements UserRepositories {
List <User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        if (user.getId()==0) {
          return   saveNew(user);
   }
       return update(user);
    }
private User update (User user) {
        users.set(user.getId(), user);
        return user;
}

    private User saveNew (User user) {
        users.add(user);
        user.setId(generateID());
      return   user;
    }


    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {
        users.remove(id);

    }
public int generateID(){
        return users.size();
}
    @Override
    public void deleteAll() {
        users.clear();
    }

    @Override
    public User findByUsername(String username) {
        for (User user:users){
            if (username.equalsIgnoreCase(user.getUserName())) {return user;
        }}
        return null;
    }

    @Override
    public long count() {
        return users.size();
    }
}
