package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {

    String addUsers();
    String count();
    String join(Scanner sc);
    Map<String, UserDto> getUserMap();
    String login(UserDto user);
    String findUserById(UserDto username);
    String updatePassword(UserDto user);
    String deleteUser(UserDto user);
    List<UserDto> findUsersByName(String name);
    List<UserDto> findUsersByJob(String job);

    List<UserDto> getUserlist();

}

