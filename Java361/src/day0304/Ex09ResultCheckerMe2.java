package day0304;
//사용자로부터 국어 영어 수학 점수를 입력 받아서
//검정고시 결과를 출력해주는 프로그램을 작성하시오
//검정고시의 경우 만약 평균이 70미만이거나 혹은
//한 과목이라도 60점 미만일 경우 탈락이 됩니다.

//예시: 50 50 50 -> 탈락
//   80 80 80 -> 합격
//   100 100 20 -> 탈락

import java.util.Scanner;

public class Ex09ResultCheckerMe2 {
    public static void main(String[] args) {
        
        // 추가로, 상수 지정해주기
        final int SUBJECTSUM = 210;
        final int SUBJECTONE = 60;
        // 1. 입력 받기
        // - Scanner 변수 선언해주고 초기화
        Scanner scanner = new Scanner(System.in);
        
        // - 국어, 영어, 수학 점수 입력 받기
        // -- 국어 점수를 입력하세요 - int 변수 = scanner 변수.메소드
        System.out.println("국어 점수를 입력하세요.");
        System.out.print("> ");
        
        int korean = scanner.nextInt();
        
        // -- 영어 점수를 입력하세요 - int 변수 = scanner 변수.메소드
        System.out.println("영어 점수를 입력하세요.");
        System.out.print("> ");
        
        int english = scanner.nextInt();
        
        // -- 수학 점수를 입력하세요 - int 변수 = scanner 변수.메소드
        System.out.println("수학 점수를 입력하세요.");
        System.out.print("> ");
        
        int math = scanner.nextInt();
        
        
        // 2. 결과 출력
        // - if (평균 < 70 || 각과목 < 60) {탈락} else {합격} - 3과목/ 3 = 70은 3과목이 210이란 얘기다.
        // -- 간단히 적기 위해 세 과목 합친 변수를 선언하고 초기화 하자
        int sum = korean + english + math;
        
        if(sum < SUBJECTSUM || korean < SUBJECTONE || english < SUBJECTONE || math < SUBJECTONE) {
            System.out.println("탈락");            
        } else {
            System.out.println("합격");            
        }
        
        // 추가로, 매직넘버를 없애기 위해 상수를 선언하고 초기화하자.
    }

}
