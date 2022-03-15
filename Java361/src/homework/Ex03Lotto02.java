package homework;
// ArrayUtil을 사용하여
// 동적할당이 적용된 컴퓨터 로또 번호 추첨기를 만드시오.
// 심화) 다양한 메소드를 만들어서 사용자가 여러 게임을 하는 경우도 대비하시오.

import java.util.Scanner;
import java.util.Random;
import util.ArrayUtil;
public class Ex03Lotto02 {
    public static void main (String[] args) {
        
        final int LOTTO_MIN = 1;
        final int LOTTO_MAX = 45;
        final int LENGTH_MAX = 6;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 사용자의 숫자를 저장할 int 배열
        int[] userNumbers = new int[LENGTH_MAX];
        // 컴퓨터의 숫자를 저장할 int 배열
        int[] computerNumbers = new int[LENGTH_MAX];

        // 컴퓨터 배열에 로또 번호 저장
        for (int i = 0; i < computerNumbers.length;) {
            int temp = random.nextInt(LOTTO_MAX) + LOTTO_MIN;

            boolean numberSwitch = true;

            for (int j = 0; j < i; j++) {
                if (temp == computerNumbers[j]) {
                    numberSwitch = false;
                }
            }

            if (numberSwitch) {
                computerNumbers[i] = temp;
                i++;
            }
        }

        // 컴퓨터 숫자 정렬
        for (int i = 0; i < computerNumbers.length - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }
        
        // 사용자로부터 입력을 받아 배열에 저장하는 i for문
        for(int i = 0; i < userNumbers.length;) {
            System.out.printf("%d번째 숫자를 입력해주세요.\n", i + 1);
            System.out.print("> ");
            int temp = scanner.nextInt();
            
            boolean validSwitch = temp >= LOTTO_MIN && temp <= LOTTO_MAX;
            
            for(int j = 0; j < i; j++) {
                if(temp == userNumbers[j]) {
                    validSwitch = false;
                }
            }
            
            if (validSwitch) {
                userNumbers[i] = temp;
                i++;
        }

    }
        
        // 사용자 배열 오름차순 정렬
        for(int i = 0; i < userNumbers.length - 1; i++) {
            if (userNumbers[i] > userNumbers[i + 1]) {
                int temp = userNumbers[i];
                userNumbers[i] = userNumbers[i + 1];
                userNumbers[i + 1] = temp;
                i = -1;            
        }
        }
        
        // 사용자의 배열과 컴퓨터의 배열을 비교해서
        // 똑같은 숫자의 개수를 int 변수에 저장한다.
        int count = 0;
        for(int i = 0; i < userNumbers.length; i++) {
            for(int j = 0; j <computerNumbers.length; j++) {
                if(userNumbers[i] == computerNumbers[j]) {
                    count++;
                }
            }
        }
            
                 
        // 결과 출력
        System.out.print("컴퓨터의 숫자: [");
        for(int i = 0; i < computerNumbers.length; i++) {
            System.out.printf("%2d", computerNumbers[i]);
            if(i < computerNumbers.length - 1) {
                System.out.print(", ");               
            } else {
                System.out.println("]");
            }
        }
        
        System.out.print("사용자의 숫자: [");
        for(int i = 0; i < userNumbers.length; i++) {
            System.out.printf("%2d", userNumbers[i]);
            if(i < userNumbers.length - 1) {
                System.out.print(", ");               
            } else {
                System.out.println("]");
            }
        }
        
        System.out.println("총 맞은 개수: " + count);
    }

}
