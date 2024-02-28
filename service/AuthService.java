package service;

import model.PersonDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(Scanner sc);

    String login();

    String addUsers();

    PersonDto findUser(String username);

    Map<String, PersonDto> getUserMap();

    String count();

    // 아래는 추가로 확인해야함.
    String join(PersonDto user);
    String login(PersonDto user);
    PersonDto findUserById(String username);
    String updatePassword(PersonDto user);
    String deleteUser(String username);
    List<PersonDto> getUserList();
    List<PersonDto> findUsersByName(String name);
    List<PersonDto> findUsersByJob(String job);
    String countUsers();

}
