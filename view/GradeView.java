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
    public static void main(Scanner sc) {
        System.out.println("이름 입력하세요");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        PersonDto student = new PersonBuilder()
                .name(sc.next())
                .build();

        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);

        System.out.printf("============ 성적표 =============\n" +
                " Name : %s \n" +
                " korean : %s \n" +
                " English : %s \n" +
                " Math : %s \n " +
                "Total : %d \n" +
                "Average : %.1f",
                student.getName(),
                subjects.getEnglish(),
                subjects.getMath(),
                subjects.getKorean(),
                totalScore,average);

    }
}