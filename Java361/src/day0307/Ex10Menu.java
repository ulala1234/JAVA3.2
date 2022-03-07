package day0307;
// 무한반복문을 사용하여
// 메뉴를 무한하게 출력하는 프로그램을 만들어보자

import java.util.Scanner;
public class Ex10Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 입력 코드 구현
                
            } else if(userChoice == 2) {
                // 출력 코드 구현
                
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                // break 키워드는 해당 반복문 혹은 switch 조건문을 종료시킨다.
                break;
            }
        }
        
    
    }

}
