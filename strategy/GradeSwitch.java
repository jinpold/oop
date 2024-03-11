package strategy;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();

        char a;
        switch (score/10) {
            case 9 : a = 'A'; break;
            case 8 : a = 'B'; break;
            case 7 : a = 'C'; break;
            case 6 : a = 'D'; break;
            default: a = 'F'; break;
        }
        System.out.println(a);
    }
}
