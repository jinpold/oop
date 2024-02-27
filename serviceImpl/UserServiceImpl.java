package serviceImpl;
import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    Map<String, PersonDto> users; // 추가

    private UserServiceImpl() {
        this.users = new HashMap<>(); //추가
    }

    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String join(PersonDto user) {
        return null;
    }

    @Override
    public String login(PersonDto user) {
        return null;
    }

    @Override
    public PersonDto findUser(String username) {
        return null;
    }

    @Override
    public String updatePassword(PersonDto user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<PersonDto> getUserList() {
        return null;
    }

    @Override
    public List<PersonDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<PersonDto> findUsersById(String id) {
        return null;
    }

    @Override
    public List<PersonDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return null;
    }



}