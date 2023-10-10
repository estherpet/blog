package services;

import data.models.User;
import data.repositories.UserRepositories;
import data.repositories.UserRepositoriesImplementation;

public class UserServicesImplementation implements UserServices {
    private final UserRepositories userRepositories = new UserRepositoriesImplementation();
    @Override
    public void register(String username, String password) {
        validate(username);
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        userRepositories.save(user);
    }
    public void validate(String username){
        if (userExist(username))throw new IllegalArgumentException("user already exist");
    }

    private boolean userExist(String username) {
        User user = userRepositories.findByUsername(username);
        if (user == null)return false;
        return true;
    }

    @Override
    public void login(String userName, String password) {

    }

    @Override
    public void changePassword(String userName, String oldName, String newName) {

    }

    @Override
    public int numberOfUsers() {
        return (int) userRepositories.count();
    }
}
