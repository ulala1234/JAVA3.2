package day0304;
// 자바에서는 입력을 처리할 때 여러가지 방법을 통해서 처리해줄 수 있다.
// 하지만 우리는 그 중에서 가장 사용법이 간단한 Scanner 클래스를 사용한
// 입력 방법을 배워볼 것이다.
// 단, 우리가 클래스에서 특별한 과정 없이 쓸 수 있는 "외부 클래스"는
// 기본형 데이터타입을 클래스화 시켜놓은 포장 클래스(Wrapper Class)만
// 사용 가능하기 때문에
// 기본형 데이터타입과 상관 없는 Scanner 클래스를
// 우리 클래스에서 사용하기 위해서는
// 특별히 어디서 해당 클래스를 "수입"해와야 하는지
// 코드로 적어주어야 한다!

// 수입하는 방법은 다음과 같다.
// import 수입할 클래스
// 단, import 코드는 public class ~~~~ 이전에 나와야 하고
// 필요에 따라서는 여러 개의 클래스를 임포트 해야할 수도 있다.

// Scanner 클래스를 import해라
import java.util.Scanner;

public class Ex01Scanner {
    public static void main(String[] args) {
        // Scanner 클래스 변수를 선언하고 초기화해보자
        Scanner scanner = new Scanner(System.in);
        // 위 코드에서 new Scanner(System.in)은
        // Scanner 클래스 변수를 초기화할 때 쓰이는 코드인데
        // () 안에 System.in은 해당 스캐너 클래스 변수가
        // 어디서 데이터를 읽어올지 지정하는 부분이다.
        // System.in은 키보드 입력을 지칭한다!
        
        // 1. 스캐너 클래스 변수를 사용항
        //    정수 입력을 받는 방법
        System.out.println("1. 정수 입력");
        System.out.println("정수를 입력해주세요.");
        System.out.print("> ");
        // 스캐너 클래스 변수의 nextInt()를 사용하면
        // 우리가 정수 입력을 받을 수 있다.
        int number = scanner.nextInt();
        
        System.out.printf("사용자가 입력한 정수: [%d]\n", number);
        
        System.out.println("-----------------------\n");
        
        System.out.println("2. 실수 입력");
        // 실수를 입력 받을 때에는
        // nextDouble()을 사용하면 된다.
        System.out.println("실수를 입력해주세요."); 
        System.out.print("> ");
        
        double d = scanner.nextDouble();
        
        System.out.printf("사용자가 입력한 실수: [%.2f]\n", d);
        
        System.out.println("-----------------------\n");
        
        System.out.println("3. 스트링 입력");
        // 스트링 입력을 받을 때에는
        // nextLine()을 사용하면 된다.
        // 단, nextInt(), nextDouble()과 같은
        // 숫자를 입력받는 메소드 실행 후에는
        // 반드시 nextLine()을 한번 더 적어야 한다.
        // 즉 스캐너 버그 방지용 nextLine() 한번, 
        // 실제 값을 입력 받는 nextLine() 한번
        // 두 번을 적어야 한다.
        System.out.println("사용자 이름을 입력해주세요."); 
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.printf("사용자의 이름: [%s]\n", name);
        
        System.out.println("-----------------------\n");
        
    }
}
