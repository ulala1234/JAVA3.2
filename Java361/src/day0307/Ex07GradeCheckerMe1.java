package day0307;
// 사용자로부터 점수를 입력받아서
// A, B, C, D, F를 출력하는 프로그램.
// 단 사용자가 잘못된 점수를 입력하면
// 올바른 점수를 입력할 때까지 다시 입력을 받으세요.

// 7시 15분까지

import java.util.Scanner;
public class Ex07GradeCheckerMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력하세요.");
        System.out.print("> ");
        int grade = scanner.nextInt();
        
        while(grade < 0 || grade > 100) {
            System.out.println("올바른 점수를 입력해주세요. 0~100 사이");
            System.out.print("> ");
            grade = scanner.nextInt();
        }
        
        if (grade >= 90) {
            System.out.println("A");            
        } else if (grade >= 80) {
            System.out.println("B");      
        } else if (grade >=70) {
            System.out.println("C");           
        } else if (grade >= 60) {
            System.out.println("D");      
        } else {
            System.out.println("F");      
        }           

    }
}
