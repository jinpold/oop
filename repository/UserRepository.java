package repository;

import service.UserService;
import serviceImpl.UserServiceImpl;

public class UserRepository {

    UserService userService;

    public UserRepository() {
        this.userService = UserServiceImpl.getInstance();
    }
}
