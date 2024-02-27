package controller;

import model.PersonDto;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;

public class UserController {

    UserService service;

    public UserController() {
        this.service = UserServiceImpl.getInstance();
    }

    public String join(PersonDto user) {
        return service.join(user);
    }

    public String login(PersonDto user) {
        return service.login(user);
    }

    public PersonDto findUser(String username) {
        return service.findUser(username);
    }


    public String updatePassword(PersonDto user) {
        return service.updatePassword(user);

    }

    public String deleteUser(String username) {
        return service.deleteUser(username);
    }


    public List<PersonDto> getUserList() {
        return service.getUserList();
    }


    public List<PersonDto> findUsersByName(String name) {
        return service.findUsersByName(name);
    }

    public List<PersonDto> findUsersByJob(String job) {
        return service.findUsersByJob(job);
    }

    public String countUsers() {
        return service.countUsers();
    }

}













