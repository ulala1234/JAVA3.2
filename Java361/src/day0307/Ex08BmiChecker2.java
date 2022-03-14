package day0307;
//사용자로부터 이름, 나이, 키, 몸무게 순으로 입력 받아서
//BMI를 계산하고 비만도 결과값을 출력하는 프로그램을 작성하세요.

//BMI 공식은 몸무게(kg) / 키 (m) / 키(m) 입니다.
//기네스북에 따르자면, 세계에서 가장 키가 컸던 사람은 2.72M였습니다.
//기네스북에 따르자면, 세계에서 가장 무거웠던 사람은 635kg였습니다.

//BMI에 따른 비만도
//18.5미만: 저체중
//18.5이상 23미만: 정상체중
//23이상 25미만: 과체중
//25이상: 비만

// 만약 사용자가 잘못된 키 혹은 몸무게를 입력하면
// 올바른 값이 들어올때까지 다시 입력을 받으세요.
// 7시 40분까지

import java.util.Scanner;
public class Ex08BmiChecker2 {
    public static void main(String[] args) {
        // 상수
        final double HEIGHT_MINIMUM = 0;
        final double HEIGHT_MAXIMUM = 2.72;  
        final double WEIGHT_MINIMUM = 0;
        final double WEIGHT_MAXIMUM = 635;
        final double BMI_STANDARD1 = 18.5;
        final double BMI_STANDARD2 = 23;
        final double BMI_STANDARD3 = 25;
                        
        Scanner scanner = new Scanner(System.in);
        
        // 1. 이름을 입력 받는다.
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");               
        String name = scanner.nextLine();
        
        // 2. 나이를 입력 받는다.
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        // 3. 키를 입력 받는다.
        System.out.println("키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();
        
        // 4. 키가 올바른 값인지 검증하여
        //    올바르지 않으면 다시 입력받는다.
        while(height <= HEIGHT_MINIMUM || height > HEIGHT_MAXIMUM) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("키를 입력해주세요.");
            System.out.print("> ");
            height = scanner.nextDouble();
        }
                
        // 5. 몸무게를 입력 받는다.
        System.out.println("몸무게를 입력해주세요.");
        System.out.print("> ");
        double weight = scanner.nextDouble();
                
        // 6. 몸무게를 검증하여 
        //    올바르지 않으면 다시 입력 받는다.
        while(!(weight > WEIGHT_MINIMUM && weight <= WEIGHT_MAXIMUM)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("몸무게를 입력해주세요.");
            System.out.print("> ");
            weight = scanner.nextDouble();
        }
        
        // 7. 결과를 출력한다.
        // 이름: ### 나이: 0##세 출력
        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        // 키: #.##M 몸무게: 0##.##kg 출력
        System.out.printf("키: %.2fM 몸무게: %06.2fkg\n", height, weight);
        // BMI: ##.## 비만도: ### 출력
        double bmi= weight / height / height;
        System.out.printf("BMI: %.2f 비만도: ", bmi);
        
        // 비만도 결과값 출력
        if (bmi < BMI_STANDARD1) {
            System.out.println("저체중");
        } else if(bmi < BMI_STANDARD2) {
            System.out.println("정상 체중");           
        } else if(bmi < BMI_STANDARD3) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
        
    }
}
