package day0304;
// 사용자로부터 국어 영어 수학 점수를 입력 받아서
// 검정고시 결과를 출력해주는 프로그램을 작성하시오
// 검정고시의 경우 만약 평균이 70미만이거나 혹은
// 한 과목이라도 60점 미만일 경우 탈락이 됩니다.

// 예시: 50 50 50 -> 탈락
//      80 80 80 -> 합격
//      100 100 20 -> 탈락
import java.util.Scanner;
public class Ex09ResultChecker {
    public static void main(String[] args) {
       
        // 프로그램에서 사용할 상수들
        // 1. 통과 기준의 총점
        final int SUM_MINIMUM = 210;
        // 2. 통과 기준의 개별 점수
        final int SCORE_MINIMUM = 60;
        
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
        
        System.out.println("----------------------------------");
        
        
        
                
        // 국어 점수 입력
        System.out.println("국어 점수를 입력해주세요.");
        System.out.print("> ");
        int korean1 = scanner.nextInt();
        
        // 영어 점수 입력
        System.out.println("영어 점수를 입력해주세요.");
        System.out.print("> ");
        int english1 = scanner.nextInt();
        
        // 수학 점수 입력
        System.out.println("수학 점수를 입력해주세요.");
        System.out.print("> ");
        int math1 = scanner.nextInt();
        
        // 탈락 조건 1.
        // 평균이 70 미만일 경우 -> 총점이 210 미만일 경우
        // 탈락 조건 2.
        // 국어 점수가 60점 미만일 경우
        // 탈락 조건 3. 
        // 영어 점수가 60점 미만일 경우
        // 탈락 조건 4.
        // 수학 점수가 60점 미만일 경우
        
        // 총점을 계산하여 변수에 저장
        int sum = korean1 + english1 + math1;
        
        if(sum < SUM_MINIMUM || korean1 < SCORE_MINIMUM || english1 < SCORE_MINIMUM || math1 < SCORE_MINIMUM) {
            System.out.println("탈락입니다.");            
        } else {
            System.out.println("합격입니다.");
        }
        
    }

}
