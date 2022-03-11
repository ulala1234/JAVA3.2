package day0310;

import java.util.Scanner;

public class StarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 6번");
        System.out.println("***********************************************");

        // 출력할 줄 수를 입력 받는다.
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        // i for문은 세로로 총 몇줄이 출력될지를 결정한다.
        // 그렇다면 i for문은 총 몇번 반복이 되어야 할까?
        // userNumber번 만큼 반복되어야 한다.

        // i의 최소값
        int iMin = 1;
        // i의 최대값
        int iMax = userNumber;

        for (int i = iMin; i <= iMax; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";

            // 공백의 개수
            int spaceWidth = i - 1;

            // 공백을 담당하는 j for문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            // 별의 개수
            int starWidth = 2 * (userNumber - spaceWidth) -1 ;

            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            System.out.println(stars);

        }
        
        System.out.println("---------------------------------------\n");
        
        for (int i = iMin; i <= iMax; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
        
        // 공백의 개수
        int spaceWidth1 = i - 1;
        
        // 공백을 담당하는 j for 문
        for(int j = 1; j <= spaceWidth1; j++) {
            stars += " ";
        }
        
        // 별의 개수
        // 첫번째 줄의 별의 개수
        // 9 = (-2 * 1) + x
        // 9 = -2 + x
        // 9 + 2 = -2 + 2 + x
        // 11 = x
        // x = 2 * userNumber + a
        // 11 = 2 * 5 + a
        // 11 = 10 + a
        // a = 1
        
        // 11 = (-2 * 1) + x
        // 11 = x - 2
        // 13 = x
        int starWidth1 = -2 * i + 2 * userNumber + 1;
        
        // 별을 담당하는 j for 문
        for (int j = 1; j <= starWidth1; j++) {
            stars += "*";
        }
        
        System.out.println(stars);
    }
}
}