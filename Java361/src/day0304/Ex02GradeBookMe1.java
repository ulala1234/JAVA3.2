package day0304;
//사용자로부터 번호, 이름, 영어 점수, 수학 점수, 국어 점수를
//차례대로 입력 받아서
//다음과 같은 양식으로 출력되는 프로그램을 작성하시오

//결과)
//번호: 0##번 이름: ###
//국어: 0##점 영어: 0##점 수학: 0##점
//총점: 0##점 평균: 0##.##점
//5시 10분까지
import java.util.Scanner;
public class Ex02GradeBookMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("번호: ");
        int number = scanner.nextInt();
        
        System.out.printf("%03d번 ", number);
        
        System.out.println("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.printf("%s", name);
        
        System.out.println("영어: ");
        int number1 = scanner.nextInt();
        
        System.out.printf("%03d점 ", number1);
        
        System.out.println("수학: ");
        int number2 = scanner.nextInt();
        
        System.out.printf("%03d점 ", number2);
        
        System.out.println("국어: ");
        int number3 = scanner.nextInt();
        
        System.out.printf("%03d점 ", number3);
        
        System.out.println("총점: ");
        int sumnumber = number1 + number2 + number3;
        
        System.out.printf("%03d점 ", sumnumber);
        
        double d = (number1 + number2 + number3)/3;
        
        System.out.printf("평균: [%06.2f]\n", d);

}
}
