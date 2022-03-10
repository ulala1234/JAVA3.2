package day0304;
//사용자로부터 이름, 나이, 키, 몸무게를 차례대로 입력받아서
//다음과 같은 형식으로 출력되게 프로그램을 작성하시오

//결과))))
//이름: ### 나이: 0##세
//키: #.##M 몸무게: 0##.##kg
//BMI: ##.## 비만도: ###

//BMI 계산 공식은
//몸무게(kg 단위) / 키(m 단위) / 키(m 단위) 입니다.

//BMI에 따른 비만도는
//~18.5 미만: 저체중
//18.5 이상 23미만: 정상체중
//23이상 25미만: 과체중
//25이상: 비만
//입니다.

//9시 25분까지
import java.util.Scanner;
public class Ex08BmiCheckerMe2 {
    public static void main(String[] args) {
        
        // 추가: 상수 입력
        final double BMISTANDARD1 = 18.5;
        final double BMISTANDARD2 = 23;
        final double BMISTANDARD3 = 25;
                
        // 1. 입력 받기
        // - Scanner 변수 선언과 초기화
        Scanner scanner = new Scanner(System.in);
        
        // - 이름, 나이, 키 몸무게 입력받기
        // -- 이름 입력하세요 뜨게하고 - String 변수 = 스캐너 변수.메소드
        System.out.println("이름을 입력하세요.");
        System.out.print("> ");
        
        String name = scanner.nextLine();
        
        // -- 나이 입력하세요 뜨게하고 - Int 변수 = 스캐너 변수.메소드
        System.out.println("나이를 입력하세요.");
        System.out.print("> ");
        
        int age = scanner.nextInt();
        
        // -- 키 입력하세요 뜨게하고 - double 변수 = 스캐너 변수.메소드
        System.out.println("키를 입력하세요.");
        System.out.print("> ");
        
        double height = scanner.nextDouble();
        
        // -- 몸무게 입력하세요 뜨게하고 - double 변수 = 스캐너 변수.메소드
        System.out.println("몸무게를 입력하세요.");
        System.out.print("> ");
        
        double weight = scanner.nextDouble();
        
        
        // 2. 출력 하기
        // - 이름: ### 나이: 0##세
        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        
        // - 키: #.##M 몸무게: 0##.##kg
        System.out.printf("키: %.2fM 몸무게: %06.2fkg\n", height, weight);
        
        // - BMI: ##.## 비만도: ###
        // -- 먼저 BMI 변수를 써서 값 구하자        
        double bmi = weight / height / height;
        
        // -- 출력할때 비만도는 if문을 써야하기 때문에 일단 비워둔다. 어차피 printf는 바로 옆 출력
        System.out.printf("BMI: %.2f 비만도: ", bmi);
        
        // -- if(bmi 비교) {코드}
        if(bmi < BMISTANDARD1) {
            System.out.println("저체중");
        } else if(bmi < BMISTANDARD2) {
            System.out.println("정상체중");
        } else if(bmi < BMISTANDARD3) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
        
        // 추가로, 매직넘버를 없애주기 위해 bmi에 상수를 부여해준다.
    }
    
}
