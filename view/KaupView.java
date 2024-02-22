package view;

import builder.PersonBuilder;
import model.PersonDto;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        double h = util.createRandomDouble(150, 50);
        double w = util.createRandomDouble(30, 70);
        PersonDto person = new PersonBuilder()
                .height(h)
                .weight(w)
                .build();

        System.out.printf("키: %.1f mm, 몸무게 : %.1f ",person.getHeight(), person.getWeight());
        KaupService service = KaupServiceImpl.getInstance();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();
        System.out.println("======== BMI 계산기 ========");
        System.out.printf("BMI : %.1f", bmi);
        System.out.println();
        System.out.println("체질량 : " + bodyMass);
        System.out.println("======== BMI 계산기 ========");
    }
}
