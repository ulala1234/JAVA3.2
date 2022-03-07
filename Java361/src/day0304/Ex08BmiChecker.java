package day0304;
// 사용자로부터 이름, 나이, 키, 몸무게를 차례대로 입력받아서
// 다음과 같은 형식으로 출력되게 프로그램을 작성하시오

// 결과))))
// 이름: ### 나이: 0##세
// 키: #.##M 몸무게: 0##.##kg
// BMI: ##.## 비만도: ###

// BMI 계산 공식은
// 몸무게(kg 단위) / 키(m 단위) / 키(m 단위) 입니다.

// BMI에 따른 비만도는
// ~18.5 미만: 저체중
// 18.5 이상 23미만: 정상체중
// 23이상 25미만: 과체중
// 25이상: 비만
// 입니다.

// 9시 25분까지
import java.util.Scanner;
public class Ex08BmiChecker {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // 이름 입력
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");
        String name = scanner.nextLine();
        
        // 나이 입력
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        // 키 입력
        System.out.println("키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();
        
        // 몸무게 입력
        System.out.println("몸무게를 입력해주세요.");
        System.out.print("> ");
        double weight = scanner.nextDouble();
        
        // 출력
        // 이름: ### 나이: 0##세 출력
        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        // 키: #.##M 몸무게: 0##.##kg 출력
        System.out.printf("키: %.2fM 몸무게: %06.2fkg\n", height, weight);
        // BMI: ##.## 비만도: ### 출력
        double bmi= weight / height / height;
        System.out.printf("BMI: %.2f 비만도: ", bmi);
        
        // 비만도 결과값 출력
        if (bmi <18.5) {
            System.out.println("저체중");
        } else if(bmi <23) {
            System.out.println("정상 체중");           
        } else if(bmi <25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
