package day0307;
//사용자로부터 점수를 입력받아서
//A, B, C, D, F를 출력하는 프로그램.
//단, 사용자가 -1을 입력하면
//사용해주셔서 감사합니다. 라고 출력이 되고
//만약 그 외에 잘못된 점수를 입력하면
//다시 입력하게 만드세요.

//8시 35분까지

import java.util.Scanner;

public class Ex11GradeChecker2Me2 {
    public static void main(String[] args) {
        // 상수
        final int GRADE_A = 90;
        final int GRADE_B = 80;
        final int GRADE_C = 70;
        final int GRADE_D = 60;
        
        // 1. 점수 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 1-1. 입력하거나 -1 누르면 종료되게
        while(true) {
            // - 입력할래? 종료할래? - 이거 받을 scanner 변수
            System.out.println("점수를 입력하시거나 -1을 입력해주세요.");
            System.out.print("> ");
            int score = scanner.nextInt();
            
            // 1-2. 입력 받을 때 잘못된 점수면 다시 입력 받게
            while(!(score >= -1 && score <= 100)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("점수를 입력하시거나 -1을 입력해주세요.");
                System.out.print("> ");
                score = scanner.nextInt();
            }
            
            // - 만약 -1 눌렀으면 종료시키기
            if(score == -1) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            
            // - 만약 그 외 눌렀으면 출력하기
            } else {
                // 2. 그에 따른 등급 출력하기(if 사용)
                if(score >= GRADE_A) {
                    System.out.println("A");
                } else if(score >= GRADE_B) {
                    System.out.println("B");
                } else if(score >= GRADE_C) {
                    System.out.println("C");
                } else if(score >= GRADE_D) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
                
            }
        }
        
        
        
    }

}
