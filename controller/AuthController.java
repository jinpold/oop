package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }
    public String join(Scanner sc) {
        return auth.login();
    }

    public String login(Scanner sc) {
        return auth.login();
    }

//    public PersonDto findUserById(Scanner sc) {
//        System.out.println("검색할 ID 입력");
//        auth.findUserusername;
//    }

    public String addUsers() {
        System.out.println("======= addUsers 서비스 호출 전 =====");
        String addedUsers = auth.addUsers();
        System.out.println("======= addUsers 서비스 호출 끝 =====");

        return addedUsers;
    }


    public UserDto findUser(String username) {
        UserDto user = auth.findUser(username);
        return user;
    }

    public Map<String, UserDto> getUserMap() {
        return auth.getUserMap();
    }
    public String count(){
        System.out.println("회원수: " +auth.count()+" 명" );
         return auth.count();
    }

}
