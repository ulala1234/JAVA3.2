package day0304;
// 사용자로부터 점수를 입력받아서
// 90점이상: A
// 80점대: B
// 70점대: C
// 60점대: D
// 그외: F
// 가 출력되는 프로그램을 작성해보세요.
// 8시 50분까지

import java.util.Scanner;
public class Ex07GradeChecker {
    public static void main(String[] args) {        
   
        Scanner scanner = new Scanner(System.in);
                
        // 1. 점수를 입력 받는다.
        System.out.println("점수를 입력해주세요.");
        System.out.print("> ");
        int score = scanner.nextInt();
        
        // 2. 점수에 따라서 결과를 출력한다.
        if (score >= 90) {
            // 2-1. 입력한 점수가 90 이상이므로 A를 출력한다.
            System.out.println("A");
        } else if(score >= 80) {
            // 2-2. 입력한 점수가 80대이므로 B를 출력한다.
            System.out.println("B");
        } else if(score >= 70) {
            // 2-3. 입력한 점수가 70대이므로 C를 출력한다.
            System.out.println("C");
        } else if(score >= 60) {
            // 2-4. 입력한 점수가 60대이므로 D를 출력한다.
            System.out.println("D");
        } else {
            // 2-5. 그 외는 F를 출력한다.
            System.out.println("F");
        }
        
    }
}
