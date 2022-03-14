package day0308;
// 랜덤 게임
// 이 프로그램은
// 플레이, 최고기록 보기, 종료의 기능으로 나누어져 있다.

// 만약 사용자가 플레이를 누르면
// 1부터 100까지의 난수를 컴퓨터가 만들어내고
// 사용자는 그 숫자를 맞추는 것이 목표가 된다.
// 만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 작으면
// 화면에 "UP" 이라고 뜨고
// 반대의 상황에서는 "DOWN" 이라고 뜬다.
// 사용자가 한번 입력할 때 마다 사용자의 점수는 1점씩 오르는데
// 이 게임에서는 더 낮은 점수를 받는 것이 목표가 된다.
// 만약 사용자가 컴퓨터의 숫자를 맞추면 축하메시지와 함께
// 사용자의 이번 기록을 출력한다.
// 만약 사용자가 새로운 최고 기록이면 사용자에게
// 새로운 최고 기록이 되었다는 것을 알려준다.

// 최고 기록 보기의 경우
// 현재 최고 점수를 보여주되, 만약 플레이 기록이 존재하지 않으면
// "아직 플레이 기록이 존재하지 않습니다" 라는 메시지만 화면에 출력이 된다.

// 쉬는 시간 포함 4시 50분까지

import java.util.Scanner;
import java.util.Random;
public class Ex02RandomNumberMe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 1. 큰 틀: while(true)로 플레이, 최고기록 보기, 종료 메뉴 만들어주기
        //    - scanner 변수로 사용자 입력하게 만들기
        //    - if (1 선택시) {플레이} else if (2 선택시) {최고기록} else if {종료}
        // 2. 플레이 시
        //    random 클래스 사용해서 난수 만들어내기
        //    사용자는 이 난수를 맞추는 Scanner 변수 사용해주기
        //    - 1~100까지의 숫자를 입력해주세요 출력하고 나서
        //    - while 바깥에 사용자 맞추는 scanner 변수 선언하고 초기화하기
        //    만약 입력한 수 = 난수 면 축하메시지와 기록 출력, <면 up, >면 down 이라고 출력
        //    최고기록이 된건 어떻게 알려주지?
        //    사용자가 입력했는지 안했는지 알려주는 boolean 변수 지정하여 입력했을시
        //    변수 지정한 점수를 ++로 올린다.
        // 3. 최고기록 보기
        //    만약 boolean 변수가 true 면 최고점수 보여주기(어떻게?)
        //    그 외네는 "아직 플레이 기록이 존재하지 않습니다."
        // 4. 종료
                        
        while(true) {
            System.out.println("1. 플레이 2. 최고기록 보기 3. 종료");
            System.out.print("> ");
            int choice = scanner.nextInt();
            
            if(choice == 1) {
                // 입력 코드 구현
                random.nextInt(100+1);
                
                System.out.println("1~100의 숫자를 입력해주세요.");
                System.out.print("> ");
                // int choice = scanner.
                
            } else if(choice == 2) {
                // 출력 코드 구현
            } else if(choice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
        
    }

}
