package controller;

import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {

    //뷰에서 연결된 컨트롤러는
    //UserService user = new UserServiceImpl();
    // 서비스 서비스  = new 서비스임플을 연결해준다.
    // 공간을 점유하므로 아래와 같이 바꿔준다.
    // alt + intsert -> 생성자 생성 후 아래와 같이 바꿔준다.
    // 서비스 임플과 컨트롤러 연결완료.
    // 필드안에 있으면 그대로 쓰고 콜해서 쓸거면 생성자 안에 넣어라!!! 메무리 누수를 막는다 !!

    UserService userService;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        return userService.addUsers();
    }

    public String count(){
        return "회원수 : " + userService.count()+ " 명";
    }

    public String join(Scanner sc){
        return " 회원가입 : " + userService.join(sc);
    }

    public Map<String, PersonDto> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();

    }

    public String login(Scanner sc){
        System.out.println("id와 pw를 입력하세요");
        return userService.login(new PersonBuilder()
                .userName(sc.next())
                .password(sc.next())
                .build());
    }
    public String findUserById(Scanner sc) {
        System.out.println("검색할 ID 입력 : ");
        return userService.findUserById(new PersonBuilder()
                .userName(sc.next())
                .build());
    }

    public String updatePassword(Scanner sc) {
        System.out.println("아이디와 변경할 비밀번호 입력 : ");
        return userService.updatePassword(new PersonBuilder()
                .userName(sc.next())
                .password(sc.next())
                .build());
    }
    public String deleteUser(Scanner sc) {
        System.out.println("삭제할 ID 입력 : ");
        return userService.deleteUser(sc.next());
    }

    public List<PersonDto> findUsersByName(Scanner sc) {
        System.out.println("이름으로 검색");
        return userService.findUsersByName(sc.next());
    }

    public List<PersonDto> findUsersByJob(Scanner sc) {
        System.out.println("직업으로 검색");
        return userService.findUsersByJob(sc.next());
    }
}













