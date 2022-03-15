package day0314;
// 전역변수(Global Variable)
// 전역변수란, 모든 메소드가 공통적으로 접근 가능하게
// 클래스의 최상단에 만들어주는 변수이다.

// 전역변수의 장점: 모든 메소드가 접근 가능하다.
// 전역변수의 단점: 모든 메소드가 접근 가능하다.

// 만약 우리의 코드가 매우 길고, 매우 많은 메소드가 존재한다면
// 전역변수의 값이 올바른지 추적할 때 매우 불편해진다.

// 하지만 아직은 우리 프로그램이 그런 단계가 아니므로
// 전역변수를 지금 단계에서는 자유롭게 사용해보자

// 단, 한번 값이 세팅되면, 더이상 변경할 수 없는
// 전역 상수는 오히려 사용이 언제든 권장된다!

import java.util.Scanner;
import util.ScannerUtil;

public class Ex03GloabalVar {
    // 전역 변수
    // 학생의 번호
    public static int id;
    // 학생의 이름
    public static String name;
    // 학생의 국어 점수
    public static int korean;
    // 학생의 영어 점수
    public static int english;
    // 학생의 수학 점수
    public static int math;
    // 정보 입력 여부
    public static boolean inputSwitch = false;
    // 입력을 처리할 Scanner 변수
    public static Scanner scanner;
    
    // 전역 상수
    // 과목의 숫자
    public static final int SUBJECT_SIZE = 3;
    // 가능한 최소 점수
    public static final int SCORE_MIN = 0;
    // 가능한 최대 점수
    public static final int SCORE_MAX = 100;
    
    // 프로그램의 시작점이 될 main()
    public static void main(String[] args) {
        // 각 전역 변수의 초기화
        id = 0;
        name = "";
        korean = 0;
        english = 0;
        math = 0;
        scanner = new Scanner(System.in);
        
        // 무한 루프를 사용한 메뉴 시작
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                // 입력 메소드 실행
                insertInfo();
            } else if(userChoice == 2) {
                // 출력 메소드 실행
                printInfo();
                
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
                
    }
    
    // 정보를 입력할 때 사용할 insertInfo()
    public static void insertInfo() {
        String message;
        
        message = "학생의 번호를 입력해주세요.";
        id = ScannerUtil.nextInt(scanner, message);
        
        message = "학생의 이름을 입력해주세요.";
        name = ScannerUtil.nextLine(scanner, message);

        message = "학생의 국어 점수를 입력해주세요.";
        korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 영어 점수를 입력해주세요.";
        english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 수학 점수를 입력해주세요.";
        math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        inputSwitch = true;



    }
    
    // 정보를 출력할 떄 사용할 printInfo()
    public static void printInfo() {
        if(inputSwitch) {
            System.out.printf("번호: %03d번 이름: %s\n", id, name);
            
            // 국어 영어 수학 점수 출력
            System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", korean, english, math);
            
            // 총점 평균 출력
            int sum = korean + english + math;
            double average = (double) sum / SUBJECT_SIZE;
            System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
            
        } else {
            System.out.println("아직 입력된 정보가 존재하지않습니다.");
        }
            
        }
    }

