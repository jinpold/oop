package serviceImpl;
import builder.UserBuilder;
import model.UserDto;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    // Map<String, PersonDto> users = new HashMap<>();
    // -> 필드이므로 메모리 점유
    // -> 아래와 같이 생성자 만들고 담기

    Map<String, UserDto> users;
    //서비스임플에서 맵 ~ ; 은 객체가 아니다. 요소로 격하된다.

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
        Map<String, UserDto> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new UserBuilder()
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
        UserDto person = new UserBuilder()
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

    public Map<String, UserDto> getUserMap() {
        users.forEach((k, v) -> System.out.println("{" + k + "," + v + "}"));
        // 맵은 k,v 람다식 활용한다 ( "주의" 람다식 활용하면 출력 시 sout을 사용하지 말것)
        return users; // 맵을 컨트롤러로 보낸다.
    }

    @Override

    // users -> 맵의 키값 (현재 회원정보 6개 담김)
    public String login(UserDto user) {
        UserDto userInMap = users.get(user.getUsername()); // 6개에 담긴 아이디와 로그인 한 아이디의 일치여부 확인
        // userInMap이 user의 요소인 엔트리(객체)가 된다 <- 좌측의 맵 users에서 꺼낸 객체
        String msg = "";
        if (userInMap == null) { // 6개중에 아아디가 없어서 로그인 실패 => null 적용
            msg = "아이디 틀림";
        } else {
            if (userInMap.getPassword().equals(user.getPassword())) { // 아이디가 같다면 비밀번호 일치여부 확인
                // 즉, 엔트리 비번 == 파라미터 비번을 비교한다.
                msg = "로그인 성공";

            } else {
                msg = "로그인 실패(비밀번호 틀림)";
            }
        }
        return msg;
    }

    @Override
    public String findUserById(UserDto usr) {
        UserDto userInMap = users.get(usr.getUsername()); // 6개에 담긴 아이디와 로그인 한 아이디의 일치여부 확인
        // 함수식 userInMap = 엔트리 -> 맵에 들어있는 DTO 하나 => userInmap (객체가 1개 담김)
        // 1) usr.getUsername은 필드 DTO값이다 (리턴이 되는 값 => 회원 가입 시 입력한 정보)
        // 2) user.getUsername() 필드 DTO값이 담기는 순간은 객체이고 -> 좌측에 userInMap= <- 으로 넘어가서 담기면 엔트리가 된다.
        //  ex) users.get(user.getUsername()).getPassword()
        // .get을 1번하면 엔트리 .get()  /  상기내용처럼 .get.get() -> 2번하면 필드 (Dto 값)

        String msg = "";
        if (userInMap == null) { // null과 같으면 -> 6개중에 아아디가 없어서 아아디 찾기 실패
            msg = "아이디가 존재 하지 않습니다.";
        } else {
            System.out.println(userInMap); // 아이디가 맞지 않으면 로그인 실패
        }
        return msg;
    }

    @Override
    public String updatePassword(UserDto user) {
        //users.get(user.getUsername()).getPassword() -> 활용해서 다시 로직 짜보기
        UserDto dpw = users.get(user.getUsername());
        String msg = "";
        if (dpw != null) {
            dpw.setPassword((user.getPassword()));
        }
        msg = "변경완료";
        return msg;
    }

    @Override
    public String deleteUser(UserDto user) {
        UserDto userInMap = users.get(user.getUsername());
        String msg = ""; // 비밀번호도 입력
        if (userInMap != null) {
            if (userInMap.getPassword().equals(user.getPassword())) {
                msg = "ID, PW 일치 -> 탈퇴처리완료";
                users.remove(user.getUsername());
            }
        } else {msg = "아이디 불일치";}
        return msg;
    }
//        @Override // String 타입으로 진행 -> 로그인 한 아이디만 삭제됨
    //  좀더 고민해보고 새로운 로직 만들어봐야함.
//        public String deleteUser (String username) {
//            UserDto user = users.remove(username);
//            String msg = "";
//            msg = "탈퇴완료";
//            return msg;
//        }

    @Override
    public List<UserDto> findUsersByName(String name) {
        List<UserDto> usersList = new ArrayList<>(users.values());


        for( String list : users.keySet())
            System.out.println(list+" ");

        users.forEach((k, v) -> System.out.println("{" + k + "," + v + "}"));

        return null;
    }
    @Override
    public List<UserDto> findUsersByJob(String job) {
        return null;
    }
    @Override
    public List<UserDto> getUserlist() {
        return new ArrayList<>(users.values());
    }
}