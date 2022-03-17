package day0316;
// 학생 한명의 정보를 메뉴를 통해서 관리하는 프로그램을 작성하시오.

// 단, day0316.Student 클래스 객체를 사용해서 관리하시오

// 9시 15분까지
import java.util.Scanner;
import util.ScannerUtil;

public class Ex02GradeBook {
    // 전역 상수
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    // 전역 변수
    public static Scanner scanner;
    public static Student s;

    /*
     * public static void init() { scanner = new Scanner(System.in); Student s = new
     * Student(-1, "아직 입력된 정보가 없습니다.", -1, -1, -1); }
     * 
     * public static void showMenu() { init(); while(true) { String message =
     * "1. 입력 2. 출력 3. 종료"; int userChoice = ScannerUtil.nextInt(scanner, message,
     * 1, 3); if(userChoice == 1) { insert(); } else if(userChoice == 2) {
     * printAll(); } else if(userChoice == 3) { System.out.println("사용해주셔서 감사합니다.");
     * break; }
     * 
     * } }
     * 
     * public static void insert() { Student s = new Student();
     * 
     * String message = "학생의 번호를 입력해주세요"; s.id = ScannerUtil.nextInt(scanner,
     * message);
     * 
     * message = "학생의 이름을 입력해주세요"; s.name = ScannerUtil.nextLine(scanner, message);
     * 
     * message = "학생의 국어 점수를 입력해주세요"; s.korean = ScannerUtil.nextInt(scanner,
     * message, SCORE_MIN, SCORE_MAX);
     * 
     * message = "학생의 영어 점수를 입력해주세요"; s.english = ScannerUtil.nextInt(scanner,
     * message, SCORE_MIN, SCORE_MAX);
     * 
     * message = "학생의 수학 점수를 입력해주세요"; s.math = ScannerUtil.nextInt(scanner, message,
     * SCORE_MIN, SCORE_MAX); }
     * 
     * public static void main(String[] args) { showMenu(); }
     */

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        s = new Student();

        showMenu();
    }

    public static void showMenu() {
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                print();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insert() {
        String message;

        message = "학생의 번호를 입력해주세요.";
        s.id = ScannerUtil.nextInt(scanner, message);

        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(scanner, message);

        message = "학생의 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

    }

    public static void print() {
        if (s.korean == -1) {
            System.out.println("아직 입력되지 않은 상태입니다.");
        } else {
            s.printInfo();
        }
    }

}
