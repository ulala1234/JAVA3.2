package day0307;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 순으로 입력 받아서
// 다음과 같이 출력되는 프로그램을 작성하시오.

// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

// 단, 입력과 출력을 분리해서
// 사용자가 입력을 누를때에만 입력이 되고
// 출력을 누르면 출력이 되게 코드를 작성하시고
// 사용자가 종료를 선택하기 전까지는
// 해당 기능이 무한하게 반복되게 코드를 작성해보세요.

// 힌트) 변수의 선언위치

// 심화과정: 만약 사용자가 입력한적 없이
// 출력을 선택하면
// "아직 입력된 정보가 없습니다."만 출력되게
// 코드를 작성하시오

// 쉬는시간 포함 30분까지

import java.util.Scanner;
public class Ex12GradeBookMe2 {
    public static void main(String[] args) {
// 상수는 클래스 변수 쓰기 전, 변수는 클래스 변수 쓰고 나서 주로 쓰나봐
        
        // 매직넘버 없애기(과목수)
        final int SUBJECT_NUMBER = 3;
        
        // 입력스위치 변수(입력 안되면 출력 안되게)
        boolean inputSwitch = false;
        
        // if 안에 변수를 선언하면 else if에선 변수를 사용 못해
        // 바깥으로 변수 빼줘서 선언하고 값 저장되도록 해줘야돼
        int id = 0;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        // 1. 입력누르면 입력되게, 출력 누르면 출력되게, 종료 누르면 종료 되게 무한히 반복(while)
        while(true) {
            // 1-1. 셋 중 하나 선택해주세요. int 변수 = sc.
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            // 2. 입력 누를시 입력되게
            if(userChoice == 1) {
                // 2-1. 번호 입력
                System.out.println("번호를 입력해주세요.");
                System.out.print("> ");
                id = scanner.nextInt();
                
                // 2-2. 이름 입력
                System.out.println("이름을 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                // 2-3. 국어 점수 입력
                System.out.println("국어 점수를 입력해주세요.");
                System.out.print("> ");
                korean = scanner.nextInt();
                
                // - 잘못된 범위의 점수 입력시 다시 입력 받기
                while(!(korean >= 0 && korean <= 100)) {
                    System.out.println("잘못된 범위입니다.");
                    System.out.println("국어 점수를 입력해주세요.");
                    System.out.print("> ");
                    korean = scanner.nextInt();
                }
                
                // 2-4. 영어 점수 입력
                System.out.println("영어 점수를 입력해주세요.");
                System.out.print("> ");
                english = scanner.nextInt();
                
                // - 잘못된 범위의 점수 입력시 다시 입력 받기
                while(!(english >= 0 && english <= 100)) {
                    System.out.println("잘못된 범위입니다.");
                    System.out.println("영어 점수를 입력해주세요.");
                    System.out.print("> ");
                    english = scanner.nextInt();
                }
                
                // 2-5. 수학 점수 입력
                System.out.println("수학 점수를 입력해주세요.");
                System.out.print("> ");
                math = scanner.nextInt();
                
                // - 잘못된 범위의 점수 입력시 다시 입력 받기
                while(!(math >= 0 && math <= 100)) {
                    System.out.println("잘못된 범위입니다.");
                    System.out.println("수학 점수를 입력해주세요.");
                    System.out.print("> ");
                    math = scanner.nextInt();
                }
            
            inputSwitch = true;
            // 3. 출력 누를시 출력되게(만약 입력 안하고 출력 누르면 정보 없다고 뜨게)
            } else if(userChoice == 2) {
// inputSwitch만 쓰는거랑 inputSwitch == true 쓰는거랑 차이 없는듯?
// (어차피 입력 끝나면 true 되고 아님 false니까) + 물어봐야 하나?
                if(inputSwitch) {
                    // 3-1. 번호: 0##번 이름: ###
                    System.out.printf("번호: %03d번 이름: %s\n", id, name);
                    
                    // 3-2. 국어: 0##점 영어: 0##점 수학: 0##점
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
                  
                    // 3-3. 총점: 0##점 평균: 0##.##점
                    int sum = korean + english + math;
                    double average = sum / (double)SUBJECT_NUMBER;
                    System.out.printf("총점 : %03d점 평균: %06.2f점\n", sum, average);
                    
                } else {
                    System.out.println("아직 입력된 정보가  없습니다.");
                }
            
            // 4. 종료 누를시 종료되게    
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
       
    }

}
