package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(Scanner sc);

    String login();

    String addUsers();

    UserDto findUser(String username);

    Map<String, UserDto> getUserMap();

    String count();

    // 아래는 추가로 확인해야함.
    String join(UserDto user);
    String login(UserDto user);
    UserDto findUserById(String username);
    String updatePassword(UserDto user);
    String deleteUser(String username);
    List<UserDto> getUserList();
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);
    String countUsers();

}
