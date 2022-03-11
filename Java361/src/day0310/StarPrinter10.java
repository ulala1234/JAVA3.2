package day0310;

import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 9번");
        System.out.println("***********************************************");

        // 출력할 줄 수를 입력 받는다.
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int iMin = 1;
        int iMax = 2 * userNumber - 1;

        for (int i = iMin; i <= iMax; i++) {
            String stars = "";

            int spaceWidth;
            int starWidth;

            if (i < userNumber) {
                // 위
                // 공백
                spaceWidth = userNumber - i;

                // 별
                starWidth = 2 * i - 1;

            } else {
                // 아래
                int lowerI = i - userNumber + 1;

                // 공백의 개수
                spaceWidth = lowerI - 1;

                // 공백을 담당하는 j for 문

                // 별의 개수
                starWidth = -2 * lowerI + 2 * userNumber + 1;

                // 별을 담당하는 j for 문

            }

            // 공백
            for (int j = 1; j <= starWidth; j++) {
                stars += " ";
            }

            // 별
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
                System.out.println(stars);
            }
        }

        System.out.println("---------------------------");

        for (int i = iMin; i <= iMax; i++) {
            // i번쨰 줄에 출력될 내용을 저장할 String 변수
            String stars = "";

            // 가로의 폭
            int maxWidth = 2 * userNumber - 1;

            if (i == iMin || i == iMax) {
                // 맨 첫번쨰 줄과 맨 마지막 줄

                // 별을 담당하는 j for문
                for (int j = 1; j <= maxWidth; j++) {
                    stars += "*";
                }
            } else {
                // 공백의 개수를 저장할 변수
                int spaceWidth = 0;

                // 별의 개수를 저장할 변수
                int starWidth = 0;
                
                if(i < userNumber) {
                    // 윗부분
                    
                    // 윗부분의 기준이 될 upperI
                    int upperI = i - 1;
                    
                    // upperI번째 줄의 한쪽 별의 개수
                    starWidth = userNumber - upperI;
                    
                    
                } else {
                    // 아랫부분
                    
                    // 아래부분의 기준이 될 lowerI
                    int lowerI = i - userNumber + 1;
                    
                    // lowerI번째 줄의 한쪽 별의 개수
                    starWidth = lowerI;
                    
                    
                }
                
                // 가운데 공백의 개수
                spaceWidth = maxWidth - 2 * starWidth;
                

                // 왼쪽 별을 담당하는 j for문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }

                // 가운데 공백을 담당하는 j for문
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }

                // 오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }
        System.out.println(stars);
        }
    }
}
