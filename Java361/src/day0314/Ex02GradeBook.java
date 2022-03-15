package day0314;
// ScannerUtil을 사용하여
// 입력을 처리하고
// 출력을 메소드로 분리한 성적 출력 프로그램.
// 5시 50분까지

//import java.util.Scanner;
import java.util.Scanner;
import util.ScannerUtil;

// import util.ScannerUtil;
public class Ex02GradeBook {
    public static void main(String[] args) {
        // 상수
        // 1. 가능한 최소 점수
        final int SCORE_MIN = 0;
        // 2. 가능한 최대 점수
        final int SCORE_MAX = 100;
        
        // 변수
        // 1. 입력을 처리할 Scanner 클래스 변수        
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        // 2. 번호, 이름, 국어, 영어, 수학 점수를 각각 저장할 변수
        int id = 0;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        // 3. 입력 여부를 저장할 boolean 변수
        boolean inputSwitch = false;

        
        //boolean inputSwitch = false;
        
        //while(true) {
           // System.out.println("1. 입력 2. 출력 3. 종료");
           // System.out.print("> ");
           // int userChoice1 = scanner.nextInt();
            
           // if(userChoice1 == 1) {
              //  int id = ScannerUtil.nextInt(scanner, "번호를 입력해주세요.");

           // }
    // }

        
        // 무한루프를 사용한 메뉴 시작
        while(true) {
            String message = " 1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                // 입력 코드 구현
                
                // 입력시 각 메시지를 저장할 String 변수 선언
                String inputMessage;
                
                // 번호 입력
                inputMessage = "학생의 번호를 입력해주세요.";
                id = ScannerUtil.nextInt(scanner, inputMessage);
                
                // 이름 입력
                inputMessage = "학생의 이름을 입력해주세요.";
                name = ScannerUtil.nextLine(scanner, inputMessage);
                
                // 국어 점수 입력
                inputMessage = "학생의 국어 점수를 입력해주세요.";
                korean = ScannerUtil.nextInt(scanner,  inputMessage, SCORE_MIN, SCORE_MAX);
                
                // 영어 점수 입력
                inputMessage = "학생의 영어 점수를 입력해주세요.";
                english = ScannerUtil.nextInt(scanner,  inputMessage, SCORE_MIN, SCORE_MAX);
                
                // 수학 점수 입력
                inputMessage = "학생의 수학 점수를 입력해주세요.";
                math = ScannerUtil.nextInt(scanner,  inputMessage, SCORE_MIN, SCORE_MAX);
                
                // 저장 여부를 저장한 inputSwitch의 값을 true로 변경
                inputSwitch = true;

            } else if(userChoice == 2) {
                // 출력 코드 구현
                if(inputSwitch) {
                    // 입력이 한번이라도 됐으므로 출력 메소드 실행
                    printInfo(id, name, korean, english, math);
                    
                } else {
                    // 입력이 한번도 안됐으므로 메시지만 출력
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");                    
                }
                
            } else if(userChoice == 3) {
                // 메시지 출력 후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
}
    public static void printInfo(int id, String name, int korean1, int english1, int math1) {
        // 상수
        // 과목의 개수
        final int SUBJECT_SIZE = 3;
        
        // 번호 이름 출력
        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        
        // 국어 영어 수학 점수 출력
        System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", korean1, english1, math1);
        
        // 총점 평균 출력
        int sum = korean1 + english1 + math1;
        double average = (double) sum / SUBJECT_SIZE;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
    }
}
