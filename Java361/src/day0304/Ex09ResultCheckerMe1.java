package day0304;
// 사용자로부터 국어 영어 수학 점수를 입력 받아서
// 검정고시 결과를 출력해주는 프로그램을 작성하시오
// 검정고시의 경우 만약 평균이 70미만이거나 혹은
// 한 과목이라도 60점 미만일 경우 탈락이 됩니다.

// 예시: 50 50 50 -> 탈락
//      80 80 80 -> 합격
//      100 100 20 -> 탈락
import java.util.Scanner;
public class Ex09ResultCheckerMe1 {
    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        // 1. 국어, 영어, 수학 점수를 입력받는다.
        System.out.println("국어 점수를 입력하시오.");
        System.out.print("> ");
        int korean = scanner.nextInt();
        
        System.out.println("영어 점수를 입력하시오.");
        System.out.print("> ");
        int english = scanner.nextInt();
        
        System.out.println("수학 점수를 입력하시오.");
        System.out.print("> ");
        int math = scanner.nextInt();
        
        // 시간 내 이거밖에 못했네..
    }

}
