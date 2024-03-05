package service;

import model.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {

    String addUsers();
    String count();
    String join(Scanner sc);
    Map<String, ?> getUserMap();
    String login(User user);
    String findUserById(User username);
    String updatePassword(User user);
    String deleteUser(User user);
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

    List<?> getUserlist();

}

