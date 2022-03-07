package day0307;
// 검증(Validation)
// 검증이란 사용자가 입력한 값이
// 유효한 값인지를 확인하여
// 유효할 경우에만 코드를 진행시키는 것이다.
// 값을 검증하는 방법은 다양하게 있지만
// 우리는 그 중 대표적인 두가지 방법을 배워볼 것이다.

import java.util.Scanner;
public class Ex03Validation {
    public static void main(String[] args) {        
   
        Scanner scanner = new Scanner(System.in);                      

        System.out.println("점수를 입력해주세요.");
        System.out.print("> ");
        int score = scanner.nextInt();
        
        System.out.println("-------------------------------------");
        System.out.println("값 검증이 안된 경우");
        System.out.println("-------------------------------------");

        if (score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        System.out.println("-------------------------------------\n");        
        
        // 값 검증하기 1번
        // 해당 결과값이 나오는 조건식을 정확하게 적기
        // 이 방법은 올바른 값의 범위가 연속적이지 않고
        // 범위가 제각각일 때 사용하는 방법이다.
        
        System.out.println("-------------------------------------");
        System.out.println("1. 정확한 조건식");
        System.out.println("-------------------------------------");

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        } else if(score >= 80 && score <= 89) {
            System.out.println("B");
        } else if(score >= 70 && score <= 79) {
            System.out.println("C");
        } else if(score >= 60 && score <= 69) {
            System.out.println("D");
        } else if(score >= 0 && score <= 59) {
            System.out.println("F");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        
        System.out.println("-------------------------------------\n");  
        
        // 값 검증하기 2번
        // 먼저 사용자가 입력한 값이 올바른 값인지 확인하고
        // 올바른 값일 때에만 추가적으로 코드를 진행시킨다.
        // 이 방법은 올바른 값의 범위가 연속적일때 사용된다.
        
        System.out.println("-------------------------------------");  
        System.out.println("2. 중첩 if문 사용하기");  
        System.out.println("-------------------------------------");  

        if(score >= 0 && score <= 100) {
            // 올바른 점수를 입력한 경우

            if (score >= 90) {
                System.out.println("A");
            } else if(score >= 80) {
                System.out.println("B");
            } else if(score >= 70) {
                System.out.println("C");
            } else if(score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }                            
            
        } else {
            // 올바른 점수가 아닐 경우
            System.out.println("해당 점수는 유효한 범위의 점수가 아닙니다.");
        }
        
        System.out.println("-------------------------------------\n");  

    }
}
