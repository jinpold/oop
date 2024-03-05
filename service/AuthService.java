package service;

import model.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(Scanner sc);

    String login();

    String addUsers();

    User findUser(String username);

    Map<String, User> getUserMap();

    String count();

    // 아래는 추가로 확인해야함.
    String join(User user);
    String login(User user);
    User findUserById(String username);
    String updatePassword(User user);
    String deleteUser(String username);
    List<?> getUserList();
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);
    String countUsers();

}
