package day0304;
//사용자로부터 나이를 입력받아서
//5세미만: 영아
//5~13세: 어린이
//13~18세: 청소년
//그외: 성인
//이 출력되는 프로그램을 작성하시오
//8시 25분까지
import java.util.Scanner;
public class Ex06AgeCheckerMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age;
        age = scanner.nextInt();
        if (age < 5) {
            System.out.println("5세미만: 영아");
        } else if (age > 5 && age <= 13) {
            System.out.println("5~13세: 어린이");
        } else if (age > 13 && age <= 18) {
            System.out.println("13~18세: 청소년");
        }
          else {
                System.out.println("그외: 성인");
          }
    }
}
