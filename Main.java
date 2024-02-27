import view.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //파사드 패턴 - 진입로를 하나로 들어가는 것
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n 0-종료 1-회원관리 2-성적표 3- 게시판 4-카우프 5-사용자관리(맵)");
            // 이 프로젝트에는 현재 4개의 기능이 구현이 되어 있다.
            System.out.println("목록중에 원하시는걸 선택하세요");
            switch (sc.next()) {
                case "0": return; // 종료는 리턴!!
                case "1": AuthView.main(sc);  break;
                case "2": GradeView.main(sc); break;
                case "3": BoardView.main(sc); break;
                case "4": KaupView.main(sc);  break;
                case "5": UserView.main(sc);  break;
            }
        }
    }
}