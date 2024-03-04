package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {

    public static void main(Scanner sc) {

        // 인터페이스 연결순서
        // 1)메인 -> 뷰 → 2)컨트롤러 → 3)서비스임플 → 4)레파지토리
        UserController userController = new UserController(); // 유저 뷰 <-> 컨트롤러 연결
        String msg = userController.addUsers(); // 5명의 회원목록을 만든다.
        System.out.println("addUsers의 결과: " + msg);


        while (true) {
            System.out.println("[관리자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-회원가입");
                    System.out.println(userController.join(sc));
                    break;
                case "2":
                    System.out.println("2-로그인");
                    System.out.println(userController.login(sc));
                    //PersonDto user <-> 컨트롤러에서 스캐너로 받아서 뷰로 전달
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    System.out.println(userController.findUserById(sc));
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    System.out.println(userController.updatePassword(sc));
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    System.out.println(userController.deleteUser(sc));
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    // ("주의" 람다식 활용하면 출력 시 sout을 사용하지 말 것.)
                    userController.getUserMap();
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    userController.findUsersByName(sc).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    userController.findUsersByName(sc).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "9":
                    System.out.println("9-회원수");
                    String numberOfUsers = userController.count();
                    System.out.println("회원수" + userController.count());
                    break;
            }
        }
    }
}

