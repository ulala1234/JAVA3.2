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
public class Ex08BmiCheckerMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
// scanner.nextLine(); -> 숫자 먼저 입력 안받아서 버그방지 필요 없음

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
// System.out.printf("키: %.2f\nM 몸무게: %0.2f\nkg", height, weight); -> 지금 보니 잘못 입력 실행 안돼

// double bmi = weight / height / height; 까지만 입력하고 시간 지남
    }
    }

