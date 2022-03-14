package day0311;
// 로또 번호 추첨기 ver5.0
// 사용자가 한번에 한게임만 하는 것이 아니라
// 사용자가 지정한 횟수의 게임을 할 수 있게 코드를 작성하시오.

// 단, 각 게임을 사용자가 매번 수동 입력을 하는 것이 아니라
// 1. 자동 2. 수동 중에 하나 선택헤서
// 자동을 선택하면 해당 게임은 숫자가 자동으로 배정이 되고
// 수동을 선택하면 해당 게임은 사용자가 직접 숫자를 배정하게 만드시오.

// 또한 결과창에서는 사용자가 각 게임 옆에 맞은 개수를 같이 출력해주시오.
// 7시 30분까지

import java.util.Scanner;
import java.util.Random;

public class Ex04Lotto05 {
    public static void main(String[] args) {
        // 상수
        // (쌤꺼) 로또의 가능한 최소 숫자
        final int LOTTO_MIN = 1;
        // 로또의 가능한 최대 숫자
        final int LOTTO_MAX = 45;
        // 한 게임당 배정할 수 있는 숫자의 최대 개수
        final int LOTTO_LENGTH = 6;
        final int LENGTH_MAX = 6;
        
        // 클래스 변수
        //(쌤꺼)
        // 입력을 위한 Scanner 클래스 변수
        Scanner scanner = new Scanner(System.in);
        // 랜덤 숫자를 위한 Random 클래스 변수
        Random random = new Random();
        
        
        
        // 배열 변수        
        int[] computerLotto = new int[LOTTO_LENGTH];
        //(쌤꺼) 컴퓨터의 숫자를 저장할 int 1차원 배열
        int[] computerNumbers = new int[LENGTH_MAX];
        
        int[] userLotto = new int[LOTTO_LENGTH];
        // 사용자의 숫자를 저장할 int 2차원 배열의 선언
        int [][] userNumbers;
        
        
        // 사용자가 지정한 횟수의 게임 for인가
        System.out.println("몇 번의 게임을 하시겠습니까?");
        System.out.print("> ");
        int userChoice = scanner.nextInt();
        
        //for(int i = 0; i < userChoice; i++) {
            
        //}
        
        
        System.out.println("----------------------------------");
        
        // 사용자한테 총 몇게임을 할지 입력을 받는다.
        System.out.println("몇 게임을 할지 입력해주세요.");
        System.out.print("> ");
        int gameNumber = scanner.nextInt();
        
        // 사용자가 입력한 게임 숫자로 2차원 배열 userNumbers를 초기화한다.
        userNumbers = new int[gameNumber][LENGTH_MAX];
        
        // computerNumbers에 랜덤 숫자 저장
        for(int i = 0; i < computerNumbers.length;) {
            int temp = random.nextInt(LOTTO_MAX) + LOTTO_MIN;
            boolean validSwitch = true;
            for(int j = 0; j < i; j++) {
                if(temp == computerNumbers[j]) {
                    validSwitch = false;
                }
            }
            
            if(validSwitch) {
                computerNumbers[i] = temp;
                i++;
            }
        }
        
        // computerNumbers를 오름차순 정렬
        for(int i = 0; i < computerNumbers.length -1; i++) {
            if(computerNumbers[i] > computerNumbers[i+1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i+1];
                computerNumbers[i+1] = temp;
                i = -1;
            }
        }
        
        // 사용자로부터 각 게임을 자동으로 할지 수동으로 할지 입력 받아서
        // 각각에 맞는 코드를 작성해준다.
        for(int i = 0; i < userNumbers.length; i++) {
            System.out.println("\n==============================");
            System.out.println((i+1)+"번째 게임");
            System.out.println("==============================\n");
            // 사용자로부터 자동, 수동을 입력 받는다.
            System.out.println("1. 자동 2. 수동");
            System.out.print("> ");
            int userChoice1 = scanner.nextInt();
            
            // 임시 숫자가 유효한 숫자인지를 저장할 boolean 변수 선언
            boolean validSwitch;
            int temp;
            
            if(userChoice1 == 1) {
                // i번째 배열에 자동으로 숫자 배정
                
                for(int j = 0; j < userNumbers[i].length;) {
                    validSwitch = true;
                    temp = random.nextInt(LOTTO_MAX) + LOTTO_MIN;
                    for(int k = 0; k < j; k++) {
                        if(temp == userNumbers[i][k]) {
                            validSwitch = false;
                        }
                    }
                    
                    if(validSwitch) {
                        userNumbers[i][j] = temp;
                        j++;
                    }
                }
                
            } else {
                // i번째 배열에 사용자가 입력한 숫자를 배정
                for(int j = 0; j < userNumbers[i].length;) {
                    // 사용자로부터 숫자를 입력 받는다.
                    System.out.printf("%d번째 숫자를 입력해주세요\n", j+1);
                    System.out.print("> ");
                    temp = scanner.nextInt();
                    
                    validSwitch = temp >= LOTTO_MIN && temp <= LOTTO_MAX;
                    
                    for(int k = 0; k < j; k++) {
                        if(temp == userNumbers[i][k]) {
                            validSwitch = false;
                        }
                    }
                    
                    if(validSwitch) {
                        userNumbers[i][j] = temp;
                        j++;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                }
                
                
            }
        }
        
        // userNumbers 2차원 배열의 각 배열을 오름차순 정렬한다.
        for(int i = 0; i < userNumbers.length; i++) {
            for(int j = 0; j < userNumbers[i].length - 1; j++) {
                if(userNumbers[i][j] > userNumbers[i][j+1]) {
                    int temp = userNumbers[i][j];
                    userNumbers[i][j] = userNumbers[i][j+1];
                    userNumbers[i][j+1] = temp;
                    j = -1;
                }
            }
        }
        
        // 결과 출력
        
        // 각 게임의 맞은 개수를 저장할 int[] count
        int[] count = new int[gameNumber];
        
        // coumpterNumbers와 userNubmers의 각 배열의 같은 숫자를 센다.
        for(int i = 0; i < userNumbers.length; i++) {
            for(int j = 0; j < userNumbers[i].length; j++) {
                for(int k = 0; k < computerNumbers.length; k++) {
                    if(userNumbers[i][j] == computerNumbers[k]) {
                        count[i]++;
                    }
                }
            }
        }
        
        // computerNumbers 출력
        System.out.println("\n==============================");
        System.out.println("당첨번호");
        System.out.println("==============================\n");
        System.out.print("[");
        for(int i = 0; i < computerNumbers.length; i++) {
            System.out.printf("%2d", computerNumbers[i]);
            if(i != computerNumbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        
        // 사용자의 각 게임 숫자와 해당 게임의 맞은 개수 출력
        System.out.println("\n==============================");
        System.out.println("사용자 결과");
        System.out.println("==============================\n");
        System.out.print("[");
        for(int i = 0; i < userNumbers.length; i++) {
            for(int j = 0; j < userNumbers[i].length; j++) {
                System.out.printf("%2d", userNumbers[i][j]);
                if(j != userNumbers[i].length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print("] - 총 맞은 개수: " + count[i] + "개");                                
            }
        }
        
    }

    }
}
