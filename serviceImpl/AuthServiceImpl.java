package serviceImpl;

import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.KaupService;
import service.UtilService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    // 싱글톤 패턴 시작

    private static AuthService instance = new AuthServiceImpl();

    Map<String, PersonDto> users;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance() {
        return instance;
    }

    // 싱글톤 패턴 끝

    @Override
    public String join(Scanner sc) {
        System.out.println("id, 비밀번호, 확인비밀번호, " +
                "이름, 주민번호, 전화번호, 주소, 직업");
        AuthService auth = AuthServiceImpl.getInstance();
        PersonDto personDto = new PersonBuilder()
                .userName(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .personNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .height(0)
                .weight(0)
                .build();
        return null;
    }

    @Override
    public String login() {
        return "";
    }

    @Override
    public PersonDto findUser(String name) {
        PersonDto user = new PersonBuilder().build();

        return user;
    }

    @Override
    public String addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        Map<String, PersonDto> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new PersonBuilder()
                    .userName(username)
                    .password("1")
                    .checkPassword("1")
                    .name(util.createRandomUsername())
                    .build());
        }
        users = map;
        return "더미값 추가";

    }

    @Override
    public Map<String, PersonDto> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }

    public String count(){
        return users.size()+"";
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
    public PersonDto findUserById(String username) {
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
    public List<PersonDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return null;
    }
}
