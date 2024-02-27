package service;

import model.PersonDto;

import java.util.List;

public interface UserService {

    String join(PersonDto user);
    String login(PersonDto user);
    PersonDto findUser(String username);
    String updatePassword(PersonDto user);
    String deleteUser(String username);
    List<PersonDto> getUserList();
    List<PersonDto> findUsersByName(String name);
    List<PersonDto> findUsersById(String id);
    List<PersonDto> findUsersByJob(String job);
    String countUsers();
}

