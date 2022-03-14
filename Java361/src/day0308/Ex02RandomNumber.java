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
public class Ex02RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 최고기록을 저장할 int 변수
        int bestScore = 0;
                
        while(true) {
            System.out.println("1. 플레이하기 2. 기록 보기 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 플레이 코드 구현
                
                // 1. 컴퓨터의 숫자 결정
                int computerNumber = random.nextInt(100) + 1;
                
                // 2. 현재 점수를 저장할 int 변수를 만들고 0로 초기화한다.
                int currentScore = 0;
                
                // 3. 사용자가 입력한 숫자를 저장할 int 변수를 선언하고
                //    0으로 초기화 해준다.
                int userNumber = 0;
                
                // 4. 사용자의 숫자가 컴퓨터의 숫자와 다른 동안
                //    사용자로부터 숫자를 하나 입력 받고
                //    해당 숫자가 컴퓨터 숫자보다 크면 UP 작으면 DOWN 이라고 출력한 후에
                //    현재 점수를 1 증가시킨다.                             
                while(userNumber != computerNumber) {
                    System.out.println("1부터 100 사이의 숫자를 하나 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt(); 
                    
                    if(userNumber > computerNumber) {
                        System.out.println("!!! DOWN !!!");
                    } else if(userNumber < computerNumber) {
                        System.out.println("!!! UP !!!");
                    }                        
                    
                    currentScore++;
                    
                }
                // 5. 사용자가 입력한 숫자가 컴퓨터의 숫자와 일치한다면
                //    현재 점수와 최고 점수를 비교한다.
                //    만약 최고 점수가 현재 점수보다 크면
                //    현재 점수의 현재 값이 새로운 최고 점수가 된다.
                System.out.printf("사용자의 이번 플레이 기록: [%d]\n", currentScore);
                
                if (bestScore > 0) {
                System.out.printf("현재 최고 기록: [%d]\n", bestScore);
                }
                
                if(bestScore == 0 || bestScore > currentScore) {
                    bestScore = currentScore;
                    System.out.println("짝짝짝 새로운 최고 기록입니다!!! 짝짝짝");
                }
                
            } else if(userChoice == 2) {
                // 최고 기록 보기 코드 구현
            
                // bestScore의 값이 0이라는 것은
                // 아직 플레이어가 단 한번도 플레이 한 적 없다는 의미이므로
                // besetScore의 값에 따라서 출력 여부를 결정한다.
                
                if(bestScore == 0) {
                    // 아직 플레이어가 한번도 플레이 하지 않았을 경우
                    System.out.println("아직 플레이한 기록이 존재하지 않습니다.");
                } else {
                    // 플레이어가 플레이한 기록이 있을 경우
                    System.out.printf("현재까지의 최고 기록: [%d]\n", bestScore);
                }
                
            } else if(userChoice == 3) {
                System.out.println("플레이 해주셔서 감사합니다.");
                break;
            }
        }
    
    }

}
