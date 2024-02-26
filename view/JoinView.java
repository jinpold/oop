package view;

import builder.PersonBuilder;
import model.PersonDto;
import service.AuthService;
import service.KaupService;
import service.UtilService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {
        System.out.println("id, 비밀번호, 확인비밀번호, " +
                "이름, 주민번호, 전화번호, 주소, 직업");
        AuthService auth = AuthServiceImpl.getInstance();
        PersonDto personDto = new PersonBuilder()
                .id(sc.next())
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

        System.out.println(personDto.toString()); // 생성자 + toString 불러오기 (get/set)


    }
}
