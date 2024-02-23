package view;

import builder.PersonBuilder;
import builder.SubjectBuilder;
import model.PersonDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        System.out.println("점수 입력");
        System.out.println("이름: ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("평균 점수를 구하시오");


        PersonDto student = new PersonBuilder()
                .name(sc.next())
                .build();

        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();
        SubjectDto subjectDto = new SubjectBuilder()
                .korean(sc.nextInt()) // = sub.korean()
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build();
        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);

        System.out.printf("============ 성적표 =============\n" +
                " Name : %s \n" +
                " korean : %s \n" +
                " English : %s \n" +
                " Math : %s \n " +
                "Total : %s \n" +
                "Average : %s",
                String.valueOf(subjects.getKorean()),
                String.valueOf(subjects.getEnglish()),
                String.valueOf(subjects.getMath()),
                String.valueOf(totalScore),
                String.valueOf(average));



        System.out.println(subjectDto.toString());
                       // 생성자.toString 불러오기 (get/set)
    }
}
