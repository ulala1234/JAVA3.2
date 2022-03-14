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
public class Ex02RandomNumberMe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                

// 현재 기록은 while문 밖에다 저장 안하네 왜? - 이게 밑에 내가 저장한 score만 있으면 실행되네 이건 필요없는 변수야   
        // 현재 기록 변수 선언하고 저장하기
        int currentScore = 0;
        
        // 최고 기록 점수 변수 선언하고 저장하기
        int bestScore = 0;        
        
// boolean 스위치도 밖에다 저장 안하네 왜? - 해도 되는 거 같지만 bestScore가 0이면 출력할 때 기록 없다고 해도 돼        
        // 플레이 기록 있을 시만 출력되게 변수 선언하고 저장하기
        boolean playSwitch = false;
        
        // 1. 플레이, 최고기록 보기, 종료로 나누기(while)
        while(true) {
            // 1-1. 플레이할래? 최고기록 볼래? 종료할래? 입력 받기
            System.out.println("플레이를 하시려면 1번\n최고기록을 보시려면 2번\n종료를 하시려면 3번을 눌러주세요.");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            // 2. 플레이를 누르면 random 번호 만들어내게 하고 scanner 입력도 하게 한다.(맞출 때까지)
            //    random 번호와 scanner 입력과 비교도 해주기
            //    입력할 때마다 점수 오르게 하기
            //    숫자 맞추면 사용자의 기록 출력(+ 새로운 최고기록이면 추가 출력)
            if(userChoice == 1) {
                // score변수 선언하고 저장하기
                int score = 0;
                
                // 랜덤번호 만들기
                int computerNumber = random.nextInt(100) + 1;

// 쌤꺼 원래
// 1. 바로 맞출수도 있으니 처음에 이렇게 먼저 해주고
// System.out.println("1~100");
// System.out.print("> ");
// int userNumber = scanner.nextInt();

// if(userNumber > computerNumber) {
// 출력 DOWN
// } else if(userNumber < computerNumber) {
// 출력 UP
// }
// score++;

// 2. 만약 아닐경우 계속 반복
// while(userNumber != computerNumber) {
// System.out.println("1~100");
// System.out.print("> ");
// int userNumber = scanner.nextInt();

// if(userNumber > computerNumber) {
// 출력 DOWN
// } else if(userNumber < computerNumber) {
// 출력 UP
// }
// score++;
// }
// 이랬던 걸 합쳐주기 위해 userNumber를 while문 밖에 빼주고 저장하는 값 써준 다음 합친 것임
                // 사용자 숫자 입력하게 하기
                System.out.println("1~100 사이의 숫자를 입력해주세요.");
                System.out.print("> ");
                int userNumber = scanner.nextInt();
                
                // 잘못 눌렀을 시 다시 입력하게
                while(!(userNumber >=1 && userNumber <= 100)) {
                    System.out.println("잘못 누르셨습니다.");
                    System.out.println("1~100 사이의 숫자를 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                }
                
                // - computer = user면 맞춘거, 아니면 틀린거 -> 맞출때까지 UP, DOWN 표현
                while(computerNumber != userNumber) {
                    if(computerNumber > userNumber) {
                        System.out.println("UP !!!");
                    } else {
                        System.out.println("!!! DOWN");
                    }
                    
                    System.out.println("1~100 사이의 숫자를 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                    
                    // - 입력할 때마다 score 올리기
                    score++;
                }
                
                // - 처음부터 맞출 수 있으니 score 올리기
                score++;                                
                
                // while문 빠져나오면 숫자 맞춘거니까 축하메시지 + 이번 기록 출력
                System.out.println("!!! 숫자를 맞추셨습니다. 축하합니다 !!!");
                System.out.printf("이번 플레이 기록: [%d]\n", score);
                
                // 만약 최고기록일 시 알려주기(처음 플레이 했을 경우, 현재 점수가 전의 최고점수보다 낮을 경우)
// 현재 최고기록이 없거나 score가 최고기록 이겼을 때 새로운 최고기록 탄생, bestSocre = score                
                    if(currentScore == 0) {
                    System.out.println("!!! 새로운 최고 기록 입니다 !!!");
                    currentScore = score;
                    bestScore = score;
                } else if(currentScore != 0 && currentScore < bestScore) {
                    System.out.println("!!! 새로운 최고 기록 입니다 !!!");
                    bestScore = currentScore;
                }
                
                playSwitch = true;
            
            // 3. 최고기록 보기를 누르면 최고 점수 출력(+ 플레이 기록 있을 시만)    
            } else if(userChoice == 2) {
                
                if(playSwitch) {
                    System.out.printf("현재 최고 기록: [%d]\n", bestScore);
                } else {
                    System.out.println("아직 플레이 기록이 존재하지 않습니다.");
                }
                
            // 4. 종료                    
            } else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }                               
        
    }

}
