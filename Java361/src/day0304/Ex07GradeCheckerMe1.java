package day0304;

//사용자로부터 점수를 입력받아서
//90점이상: A
//80점대: B
//70점대: C
//60점대: D
//그외: F
//가 출력되는 프로그램을 작성해보세요.
//8시 50분까지
import java.util.Scanner;

public class Ex07GradeCheckerMe1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력해주세요.");
        System.out.print("> ");

        int grade;
        grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

        }
    }
}