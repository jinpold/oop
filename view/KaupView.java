package view;

import model.User;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;
// 카우푸지수 구하는 프로그램을 만들어주세요.
// 카우푸지수 = 체중(kg) / 신장(m) * 신장(m)
// 키 150~200 / 몸무게 30~99
// static String test; -> 필드가 아니라 상수

public class KaupView {
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        User person = User.builder()
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomDouble(30, 70))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance(); //<- 이전 값 new KaupServiceImpl
        String bmi = kaup.createBmi(person);
        String bodyMass = kaup.createBodyMass(bmi);
        System.out.printf("======== BMI 계산기 ========\n" +
                        "Bmi : %s\n" +
                        "체질량 : %s\n" +
                        "=============================",
                        bmi, bodyMass);


        //System.out.printf("키: %.1f mm, 몸무게 : %.1f ",person.getHeight(), person.getWeight());
    }
}
