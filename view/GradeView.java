package view;

import builder.SubjectBuilder;
import model.SubjectDto;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");


        SubjectDto subjectDto = new SubjectBuilder()
                .korean(sc.nextInt()) // = sub.korean()
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build();

        System.out.println(subjectDto.toString()); // 생성자.toString 불러오기 (get/set)

    }
}
