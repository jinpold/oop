package controller;

import model.PersonDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }
    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login(Scanner sc) {
        return auth.login();
    }

//    public PersonDto findUserById(Scanner sc) {
//        System.out.println("검색할 ID 입력");
//        auth.findUserusername;
//    }

    public String addUsers() {
        auth.addUsers();
        return "";
    }


    public PersonDto findUser(String username) {
        auth.findUser(username);
        return null;
    }

    public Map<String, PersonDto> getUserMap() {
        return auth.getUserMap();
    }
    public String count(){
        System.out.println("회원수: " +auth.count()+" 명" );
         return auth.count();
    }

}
