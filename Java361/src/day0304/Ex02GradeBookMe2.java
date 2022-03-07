package day0304;
//사용자로부터 번호, 이름, 영어 점수, 수학 점수, 국어 점수를

//차례대로 입력 받아서
//다음과 같은 양식으로 출력되는 프로그램을 작성하시오

//결과)
//번호: 0##번 이름: ###
//국어: 0##점 영어: 0##점 수학: 0##점
//총점: 0##점 평균: 0##.##점
//5시 10분까지

// Scanner 클래스 수입
import java.util.Scanner;
public class Ex02GradeBookMe2 {
    public static void main(String[] args) {
        // 과목수 상수
// 상수는 여기선 scanner 후에, 다른데선 scanner 전에 넣던데 상관 없는듯 코드블락에만 들어가면
        final int SUBJECT = 3;
        
        // Scanner 변수 선언과 초기화
        Scanner scanner = new Scanner(System.in);
        
        // 1. 번호, 이름, 영어 점수, 수학 점수, 국어 점수 입력받기
        // 1-1. 번호를 입력하시오. -> 번호 입력받기
        System.out.println("번호를 입력하시오.");
        System.out.print("> ");
        int number = scanner.nextInt();        
                
        // 1-2. 이름을 입력하시오. -> 이름 입력받기(버그 조심)
        System.out.println("이름을 입력하시오.");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        // 1-3. 영어 점수를 입력하시오. -> 영어 점수 입력받기
        System.out.println("영어 점수를 입력하시오.");
        System.out.print("> ");
        int english = scanner.nextInt();
        
        // 1-4. 수학 점수를 입력하시오. -> 수학 점수 입력받기
        System.out.println("수학 점수를 입력하시오.");
        System.out.print("> ");
        int math = scanner.nextInt();
        
        // 1-5. 국어 점수를 입력하시오. -> 국어 점수 입력받기
        System.out.println("국어 점수를 입력하시오.");
        System.out.print("> ");
        int korean = scanner.nextInt();
        
        // 2. 출력
        // 2-1. 번호: 0##번 이름: ###
        System.out.printf("번호: %03d번 이름: %s\n", number, name);
        
        // 2-2. 국어: 0##점 영어: 0##점 수학: 0##점
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        
        // 2-3. 총점: 0##점 평균: 0##.##점
        //      총점을 구하는 변수를 선언하고 초기화한다.
        //      평균을 구하는 변수를 선언하고 초기화한다.
        //      과목 수를 상수를 선언하고 초기화하여 변경한다.
        int sum = korean + english + math;
// 아 더블 안넣었네
        double average = sum / (double) SUBJECT;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        
    }
}
