package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

enum Grade { //전략 패턴   속성 final  기능 static  둘다 상수 => 전략패턴
    A(i -> i >= 9 && i == 10),
    B(i -> i >= 8 && i < 9),
    C(i -> i >= 7 && i < 8),
    D(i -> i >= 6 && i < 7),
    E(i -> i >= 5 && i < 6),
    F(i -> i <= 4);

    private final Predicate<Integer> predicate;

    Grade(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    static String getGrade(int score) {
        return Arrays.stream(values())
                .filter(o -> o.predicate.test(score/10))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."))
                // 위의 findFist는 arr[0]번에 던진다는 의미
                .toString();
    }
}
public class GradeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score를 입력하세요");
        System.out.println(Grade.getGrade(sc.nextInt()));
    }
}



