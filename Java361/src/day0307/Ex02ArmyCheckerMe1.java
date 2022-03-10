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
public class Ex02ArmyCheckerMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 성별, 나이, 신체등급을 입력 받는다. (성별 int 값으로)
        
        System.out.println("성별을 입력해주세요.");
        System.out.print("> ");      
        int gender = scanner.nextInt();
        
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();
        
        System.out.println("신체등급을 입력해주세요.");
        System.out.print("> ");
        int pysical = scanner.nextInt();
        
        System.out.println("성별을 입력해주세요.");
        System.out.print("> ");
        
        
        if(gender == 2) {
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        } else {
            if(age < 19) {
                System.out.println("아직 미성년자에게는 신체등급이 존재하지 않습니다.");
            } else if(pysical >= 1 && pysical <= 3) {
                System.out.println("현역");
            } else if(pysical == 4) {
                System.out.println("공익");
            } else {
                System.out.println("면제");
                }
            }
 
       } // 입력 받을 값들이 if문 안으로 들어가야 추가적인 입력이 필요 없음
    }
                
             



