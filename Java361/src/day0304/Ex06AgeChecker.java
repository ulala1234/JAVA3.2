package day0304;
// 사용자로부터 나이를 입력받아서
// 5세미만: 영아
// 5~13세: 어린이
// 13~18세: 청소년
// 그외: 성인
// 이 출력되는 프로그램을 작성하시오
// 8시 25분까지
import java.util.Scanner;
public class Ex06AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 나이를 입력 받는다.
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        // 2. if - else if 구조를 사용하여 결과를 결정한다.
        
        // 2-1. 5세미만일 경우
        if(age < 5) {
            System.out.println("영아입니다.");
        } else if(age <= 13) {        
        // 2-2. 13세이하일 경우
            System.out.println("어린이입니다.");
        } else if(age <= 18) {   
            // 2-3. 18세이하일 경우
            System.out.println("청소년입니다.");
        }
            // 그외: 성인
            else{System.out.println("성인입니다.");
        }
        
    }  
    }
        
