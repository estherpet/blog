package services;

public interface UserServices {
    void register(String userName,String password);
    void login(String userName,String password);
    void changePassword(String userName,String oldName,String newName);

    int numberOfUsers();
}
