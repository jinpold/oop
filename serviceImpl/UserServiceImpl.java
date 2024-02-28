package serviceImpl;
import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    // Map<String, PersonDto> users = new new HashMap<>();
    // -> 필드이므로 메모리 점유
    // -> 아래와 같이 생성자 만들고 담기

    Map<String, PersonDto> users;

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String addUsers() {
        //System.out.println("====== addUsers 서비스 로직 수행 시작 ======");
        UtilService util = UtilServiceImpl.getInstance();
        Map<String, PersonDto> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new PersonBuilder()
                    .userName(username)
                    .password("1")
                    .checkPassword("1")
                    .name(util.createRandomWriter())
                    .build());
        }
        users = map;
        //System.out.println("====== addUsers 서비스 로직 수행 끝 ======");
        return users.size() + "개 더미추가";
    }

    @Override
    public String count() {
        return users.size() + " ";
        // users.size() + ""; 뒤에 null값을 넣으면 스트링타입으로 인식
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호확인, 이름, 주민번호, 전화번호, " +
                "주소, 직업을 입력하세요");
        PersonDto person = new PersonBuilder()
                .userName(sc.next())
                .password(sc.next())
                .checkPassword(sc.next())
                .name(sc.next())
                .personNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        String result = ("ID : " + person.getUsername() +
                "\n비밀번호 : " + person.getPassword() +
                "\n비밀번호확인 : " + person.getCheckPassword() +
                "\n이름 : " + person.getName() +
                "\n주민번호 : " + person.getPersonNumber() +
                "\n전화번호 : " + person.getPhoneNumber() +
                "\n주소 : " + person.getAddress() +
                "\n직업 : " + person.getJob());
        users.put(person.getUsername(), person); // map put 검색해서 추가하기
        return result;
    }

    public Map<String, PersonDto> getUserMap() {
        users.forEach((k, v) -> System.out.println("{" + k + "," + v + "}"));
        // 맵은 k,v 람다식 활용한다 ( "주의" 람다식 활용하면 출력 시 sout을 사용하지 말것)
        return users; // 맵을 컨트롤러로 보낸다.
    }

    @Override

    // users -> 맵의 키값 (현재 회원정보 6개 담김)
    public String login(PersonDto user) {
        PersonDto userInMap = users.get(user.getUsername()); // 6개에 담긴 아이디와 로그인 한 아이디의 일치여부 확인
        String msg = "";
        if (userInMap == null) { // 6개중에 아아디가 없어서 로그인 실패 => null 적용
            msg = "아이디 틀림";
        } else {
            if (userInMap.getPassword().equals(user.getPassword())) { // 아이디가 같다면 비밀번호 일치여부 확인
                msg = "로그인 성공";

            } else {
                msg = "로그인 실패(비밀번호 틀림)";
            }
        }
        return msg;
    }

    @Override
    public String findUserById(PersonDto username) {
        PersonDto userInMap = users.get(username.getUsername()); // 6개에 담긴 아이디와 로그인 한 아이디의 일치여부 확인
        String msg = "";
        if (userInMap == null) { // null과 같으면 -> 6개중에 아아디가 없어서 아아디 찾기 실패
            msg = "아이디가 존재 하지 않습니다.";
        } else {
            System.out.println(userInMap); // 아이디가 맞지 않으면 로그인 실패
        }
        return msg;
    }


    @Override
    public String updatePassword(PersonDto user) {
        PersonDto dtoPw = users.get(user.getUsername());
        String msg = "";
        if (dtoPw != null) {
            dtoPw.setPassword((user.getPassword()));
            }
            msg = "변경완료";
            return msg;
        }





        @Override
        public String deleteUser (String username){
            return null;
        }

        @Override
        public List<PersonDto> findUsersByName (String name){
            return null;
        }

        @Override
        public List<PersonDto> findUsersByJob (String job){
            return null;
        }

    }
