package strategy;

import java.util.Scanner;

enum Operator {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    }
    ;

    public abstract int apply(int a, int b);

}

public class Calculator {
    public int calculate(int a, int b, Operator operator) {
        return operator.apply(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수, 정수, 연산자 ");
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(
                sc.nextInt(),
                sc.nextInt(),
                Operator.valueOf(sc.next().toUpperCase())));
    }
}