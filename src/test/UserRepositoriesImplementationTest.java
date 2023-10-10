package test;

import data.models.User;
import data.repositories.UserRepositories;
import data.repositories.UserRepositoriesImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoriesImplementationTest {
  UserRepositories userRepositories = new UserRepositoriesImplementation();
    @Test
    public void saveOneUser_CountIsOneTest(){
     User user = new User();
     userRepositories.save(user);
     assertEquals(1,userRepositories.count());
    }
    @Test
    public void saveTwoUser_CountIsTwoTest(){
        User user = new User();
        User user1 = new User();
        userRepositories.save(user);
        userRepositories.save(user1);
        assertEquals(2,userRepositories.count());
    }
    @Test
    public void saveTwoUser_DeleteOneTest(){
        User user = new User();
        User user1 = new User();
        userRepositories.save(user);
        userRepositories.save(user1);
        userRepositories.delete(1);
        assertEquals(1,userRepositories.count());
    }
    @Test
    public void saveTwoUser_DeleteAll_Test(){
        User user = new User();
        User user1 = new User();
        userRepositories.save(user);
        userRepositories.save(user1);
        userRepositories.deleteAll();
        assertEquals(0,userRepositories.count());
    }

}