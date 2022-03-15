package day0314;

// 한번에 여러 학생을 관리하는 프로그램.
// 단, 최대 관리 가능한 학생은 5명이다.
// 단, 한번에 한명씩만 입력이 가능한데
// 만약 다섯 번째 학생을 입력한 후에
// 또 입력을 선택할 시에는 더이상 입력할 수 없다 라는 메시지만 출력이 되어야 한다.
// 또한 출력 시에는 현재 입력된 학생까지만 출력이 된다.
import java.util.Scanner;
import util.ScannerUtil;

public class Ex04GradeBook {
    // 전역 상수
    // 1. 관리할 학생의 최대 숫자
    public static final int STUDENT_SIZE = 5;
    // 2. 과목의 숫자
    public static final int SUBJECT_SIZE = 3;
    // 3. 가능한 최소 점수
    public static final int SCORE_MIN = 0;
    // 4. 가능한 최대 점수
    public static final int SCORE_MAX = 100;

    // 전역 변수
    // 1. 입력을 처리할 Scanner 클래스 변수
    public static Scanner scanner;
    // 2. 학생 번호를 저장할 배열
    public static int[] idArray;
    // 3. 학생 이름을 저장할 배열
    public static String[] nameArray;
    // 4. 학생의 국어 점수를 저장할 배열
    public static int[] koreanArray;
    // 5. 학생의 영어 점수를 저장할 배열
    public static int[] englishArray;
    // 6. 학생의 수학 점수를 저장할 배열
    public static int[] mathArray;
    // 7. 각 배열의 현재 입력할 공통 인덱스
    public static int currentIndex;

    // 7시 40분까지

    // public static void main(String[] args) {
    // idArray = new int[STUDENT_SIZE];
    // nameArray = new String[STUDENT_SIZE];
    // koreanArray = new int[STUDENT_SIZE];
    // englishArray = new int[STUDENT_SIZE];
    // mathArray = new int[STUDENT_SIZE];
    // scanner = new Scanner(System.in);

    // while(true) {
    // String message = "1. 입력 2. 출력 3. 종료";
    // int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

    // if(userChoice == 1) {
    // insertInfo();

    // } else if(userChoice == 2) {
    // printInfo();

    // } else if(userChoice == 3) {
    // System.out.println("사용해주셔서 감사합니다.");
    // break;
    // }
    // }

    // }

    // 정보를 입력할 때 사용할 insertInfo()
    // public static void insertInfo() {
    // String message;

    // message = "학생의 번호를 입력해주세요.";
    // idArray = ScannerUtil.nextInt(scanner, message);

    // message = "학생의 이름을 입력해주세요.";
    // nameArray = ScannerUtil.nextLine(scanner, message);

    // message = "학생의 국어 점수를 입력해주세요.";
    // koreanArray = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

    // message = "학생의 영어 점수를 입력해주세요.";
    // englishArray = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

    // message = "학생의 수학 점수를 입력해주세요.";
    // mathArray = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

    // inputSwitch = true;

    // 정보를 출력할 떄 사용할 printInfo()
//public static void printInfo() {
    // if(inputSwitch) {
    // System.out.printf("번호: %03d번 이름: %s\n", id, name);

    // 국어 영어 수학 점수 출력
    // System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", korean, english, math);

    // 총점 평균 출력
    // int sum = korean + english + math;
    // double average = (double) sum / SUBJECT_SIZE;
    // System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

    // } else {
    // System.out.println("아직 입력된 정보가 존재하지않습니다.");
    // }
    public static void main(String[] args) {
        // 변수의 초기화
        scanner = new Scanner(System.in);
        idArray = new int[STUDENT_SIZE];
        nameArray = new String[STUDENT_SIZE];
        koreanArray = new int[STUDENT_SIZE];
        englishArray = new int[STUDENT_SIZE];
        mathArray = new int[STUDENT_SIZE];
        currentIndex = 0;

        // 메뉴 메소드 호출
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                // 입력 메소드 실행
                insertInfo();

            } else if (userChoice == 2) {
                // 출력 메소드 실행
                printInfo();

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }

    public static void insertInfo() {
        if (currentIndex < STUDENT_SIZE) {
            // 아직 다섯명을 입력하지 않았을 경우

            System.out.println("===============================");
            System.out.printf("%d번 학생 입력하기\n", currentIndex + 1);
            System.out.println("===============================");
            // 번호 입력
            String message = "학생의 번호를 입력해주세요.";
            idArray[currentIndex] = ScannerUtil.nextInt(scanner, message);

            // 이름 입력
            message = "학생의 이름을 입력해주세요.";
            nameArray[currentIndex] = ScannerUtil.nextLine(scanner, message);

            // 국어 점수 입력
            message = "학생의 국어 점수를 입력해주세요.";
            koreanArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 영어 점수 입력
            message = "학생의 영어 점수를 입력해주세요.";
            englishArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 수학 점수 입력
            message = "학생의 수학 점수를 입력해주세요.";
            mathArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 다음 입력할 인덱스를 1 증가
            currentIndex++;

        } else {
            // 이미 다섯명을 입력했을 경우
            System.out.println("이미 5명 모두 정보가 입력되어 있습니다.");
        }
    }

    public static void printInfo() {
        if (currentIndex > 0) {
            // 한명이라도 입력이 되어있는 상태

            // for문을 사용하여 각 배열의 i번째 학생의 정보를 출력해준다.
            for (int i = 0; i < currentIndex; i++) {
                System.out.println("===============================");
                System.out.printf("%d번째 학생의 정보\n", i + 1);
                System.out.println("===============================");
                System.out.printf("번호: %03d번 이름: %s\n", idArray[i], nameArray[i]);

                // 국어 영어 수학 점수 출력
                System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", koreanArray[i], englishArray[i], mathArray[i]);

                // 총점 평균 출력
                int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                double average = (double) sum / SUBJECT_SIZE;
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
                System.out.println("===============================");
            }

        } else {
            // 아직 한명도 입력이 되어있지 않은 상태
            System.out.println("아직 입력된 정보가 존재하지 않습니다.");
        }
    }
}
