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
    }
}
