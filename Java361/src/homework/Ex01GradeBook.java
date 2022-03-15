package homework;
// 입력, 출력, 종료 기능을 가지고 있는

// 학생 성적 출력 프로그램을 만드시되,
// 점수를 사용자가 입력하면 올바른 점수를 리턴해주는 메서드를 만들어서
// 국어, 영어, 수학 점수를 입력 받을때 해당 메서드를 사용하시고
// 출력도 별개의 메서드로 분리해서 프로그램을 작성하시오.

import java.util.Scanner;

public class Ex01GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            boolean inputSwitch = false;

            if (userChoice == 1) {
                int korean = -1;
                int english = -1;
                int math = -1;

                while (!(korean >= 0 && korean <= 100)) {
                    System.out.println("국어 점수를 입력해주세요.");
                    System.out.print("> ");
                    korean = scanner.nextInt();
                }

                while (!(english >= 0 && english <= 100)) {
                    System.out.println("영어 점수를 입력해주세요.");
                    System.out.print("> ");
                    english = scanner.nextInt();
                }

                while (!(math >= 0 && math <= 100)) {
                    System.out.println("수학 점수를 입력해주세요.");
                    System.out.print("> ");
                    math = scanner.nextInt();

                }
                
                inputSwitch = true;

            } else if(userChoice == 2) {
                if(inputSwitch) {
                    
                } else {
                    System.out.println("아직 입력한 값이 없습니다.");
                }
                
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
        
        System.out.println("---------------------------");
        
        // 입력에서 사용할 Scanner 클래스 변수
        
        // 각 정보를 저장할 변수
        int korean1 = 0;
        int english1 = 0;
        int math1 = 0;
        String name = "";
        int id = 0;
        
        // 입력 여부를 저장할 boolean 변수
        boolean inputSwitch = false;
        
        // 무한루프를 사용한 메뉴 출력
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice1 = scanner.nextInt();
            
            if(userChoice1 == 1) {
                // 입력 코드 구현
                
                // 번호 입력
                System.out.println("번호를 입력해주세요.");
                System.out.print("> ");
                id = scanner.nextInt();
                
                // 이름 입력
                System.out.println("이름을 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                // 국어 점수 입력
                korean1 = setScore(scanner, "국어");
                
                // 영어 점수 입력
                english1 = setScore(scanner, "영어");
                
                // 수학 점수 입력
                math1 = setScore(scanner, "수학");
                
                // inputSwitch 에 true 저장
                inputSwitch = true;
                
            } else if(userChoice1 == 2) {
                // 출력 코드 구현
                if(inputSwitch) {
                    printInfo(id, name, korean1, english1, math1);                   
                } else {
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");
                }
                
            } else if(userChoice1 == 3) {
                // 메시지 출력후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    public static int setScore(Scanner scanner, String subject) {
        // 상수
        // 1. 가능한 최소 점수
        final int SCORE_MIN = 0;
        // 2. 가능한 최대 점수
        final int SCORE_MAX = 100;
        
        int score = 0;
        
        System.out.println(subject + " 점수를 입력해주세요.");
        System.out.print("> ");
        score = scanner.nextInt();
        
        while(!(score >= SCORE_MIN && score <= SCORE_MAX)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(subject + " 점수를 입력해주세요.");
            System.out.print("> ");
            score = scanner.nextInt();
        }
        
        return score;
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
