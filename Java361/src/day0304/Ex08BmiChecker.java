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

String name;
scanner.nextLine();

System.out.println("이름을 입력해주세요.");
System.out.print("> ");

name = scanner.nextLine();

int age;

System.out.println("나이를 입력해주세요.");
System.out.print("> ");

age = scanner.nextInt();

double height;

System.out.println("키를 입력해주세요.");
System.out.print("> ");

height = scanner.nextDouble();

System.out.println("몸무게를 입력해주세요.");
System.out.print("> ");

double weight = scanner.nextDouble();


System.out.printf("이름: %s\n 나이: %03d\n세", name, age);
System.out.printf("키: %.2f\nM 몸무게: %0.2f\nkg", height, weight);

double bmi = weight / height / height;
        
        

        
        System.out.println("-----------------------------");
        
        // 이름 입력
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");
        String name1 = scanner.nextLine();
        
        // 나이 입력
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age1 = scanner.nextInt();
        
        // 키 입력
        System.out.println("키를 입력해주세요.");
        System.out.print("> ");
        double height1 = scanner.nextDouble();
        
        // 몸무게 입력
        System.out.println("몸무게를 입력해주세요.");
        System.out.print("> ");
        double weight1 = scanner.nextDouble();
        
        // 출력
        // 이름: ### 나이: 0##세 출력
        System.out.printf("이름: %s 나이: %03d세\n", name1, age1);
        // 키: #.##M 몸무게: 0##.##kg
        System.out.printf("키: %.2fM 몸무게: %06.2fkg\n", height1, weight1);
        // BMI: ##.## 비만도: ###
        double bmi1= weight1 / height1 / height1;
        System.out.printf("BMI: %.2f 비만도: ", bmi1);
        
        // 비만도 결과값 출력
        if (bmi1 <18.5) {
            System.out.println("저체중");
        } else if(bmi1 <23) {
            System.out.println("정상 체중");           
        } else if(bmi1 <25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
