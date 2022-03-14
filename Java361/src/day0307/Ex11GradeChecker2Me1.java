package day0307;
// 사용자로부터 점수를 입력받아서
// A, B, C, D, F를 출력하는 프로그램.
// 단, 사용자가 -1을 입력하면
// 사용해주셔서 감사합니다. 라고 출력이 되고
// 만약 그 외에 잘못된 점수를 입력하면
// 다시 입력하게 만드세요.

// 8시 35분까지

import java.util.Scanner;
public class Ex11GradeChecker2Me1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     // 1. -1 입력받으면 종료되게
// 점수를 입력 받거나~ 가 조건이라 처음부터 점수 입력하도록 만들어야 하는데
// 아무 숫자를 먼저 넣어야 점수 입력 되게 했음         
        while(true) {
            System.out.println("-1: 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if(userChoice == -1) {
                System.out.println("사용해주셔서 갑사합니다.");
                break;
            } else if(userChoice != -1) {
                // 2. 점수 입력받기
                System.out.println("점수를 입력하세요.");
                System.out.print("> ");
                int grade = scanner.nextInt();
            }
                    
        }
                       
        
    }
    }

