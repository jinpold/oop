package strategy;
import java.util.Scanner;
enum Operator2 {
    MONDAY {
        @Override
        public String get() {
            return "월요일";
        }
    },
    TUESDAY {
        @Override
        public String get() {
            return "화요일";
        }
    },
    WEDNESDAY {
        @Override
        public String get() {
            return "수요일";
        }
    },
    THURSDAY {
        @Override
        public String get() {
            return "목요일";
        }
    },
    FRIDAY {
        @Override
        public String get() {
            return "금요일";
        }
    },
    SATURDAY {
        @Override
        public String get() {
            return "토요일";
        }
    },
    SUNDAY {
        @Override
        public String get() {
            return "일요일";
        }
    };
    public abstract String get();
}

public class WeekExample {
    public static String week(Operator2 week){
        return week.get();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 입력하세요.");
        System.out.println(WeekExample.week(Operator2.valueOf(sc.next())));
    }
}

