package service;

import model.PersonDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {

    String addUsers();
    String count();
    String join(Scanner sc);
    Map<String, PersonDto> getUserMap();
    String login(PersonDto user);
    String findUserById(PersonDto username);
    String updatePassword(PersonDto user);
    String deleteUser(String username);
    List<PersonDto> findUsersByName(String name);
    List<PersonDto> findUsersByJob(String job);


}

