package day0307;
// 사용자로부터 성별, 나이, 신체등급 순으로 입력 받아서
// 현역, 공익, 면제 중 하나를 출력하는 프로그램.
// 단, 성별의 경우 int 값으로 입력을 받아서
// 1이면 남자 2면 여자로 판단합니다.
// 만약 여자일 경우, 추가적인 입력 없이
// "여성에게는 국방의 의무가 부여되지 않습니다." 만 출력이 됩니다.
// 또한, 남자이지만 19세 미만의 미성년자일 경우
// "아직 미성년자에게는 신체등급이 존재하지 않습니다." 가 출력이 됩니다.
// 남자 성인일 경우
// 1~3: 현역
// 4: 공익
// 그외: 면제 가 됩니다.

// 4시 20분까지
import java.util.Scanner;
public class Ex02ArmyChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        // 1. 성별을 입력 받는다.
        System.out.println("성별을 입력해주세요. (1은 남자 2는 여자)");
        System.out.print("> ");
        int gender = scanner.nextInt();
        
        // 2. 남성인지 여성인지에 따라 코드를 결정해준다.
        if(gender == 1) {
            // 사용자가 남성이므로
            // 나이를 입력 받는다.
            
            System.out.println("나이를 입력해주세요.");
            System.out.print("> ");
            int age = scanner.nextInt();
            
            // 나이에 따른 코드를 결정해준다.
            if(age >= 19) {
                // 남자 성인이므로, 신체 등급을 입력 받는다.
                System.out.println("신체 등급을 입력해주세요.");
                System.out.print("> ");
                int grade = scanner.nextInt();
                
                // 신체 등급에 따른 결과를 출력해준다.
                if(grade <= 3) {
                    System.out.println("현역입니다.");                   
                } else if(grade == 4) {
                    System.out.println("공익입니다.");
                } else {
                    System.out.println("면제입니다.");
                }
            
            } else {
                // 남자 미성년자이므로 메세지만 출력해준다.
                System.out.println("미성년자에게는 아직 신체등급이 존재하지 않습니다.");
            }
                       
        } else {
            // 사용자가 여성이므로
            // 메시지만 출력해준다.
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
    }
                
             
    }


