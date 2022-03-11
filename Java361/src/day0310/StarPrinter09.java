package day0310;

import java.util.Scanner;

public class StarPrinter09 {
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

            if (i < userNumber) {
                // 위
                // 공백
                int spaceWidth = userNumber - i;
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 별
                int starWidth = 2 * i - 1;
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }

            } else {
                // 아래
                int lowerI = i - userNumber + 1;

                // 공백의 개수
                int spaceWidth = lowerI - 1;

                // 공백을 담당하는 j for 문
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }

                // 별의 개수
                int starWidth = -2 * lowerI + 2 * userNumber + 1;

                // 별을 담당하는 j for 문
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }
            System.out.println(stars);
        }

        System.out.println("------------------------------");

        for (int i = iMin; i <= iMax; i++) {
            String stars = "";

            // 공백의 개수를 저장할 변수 선언
            int spaceWidth;

            // 별의 개수를 저장할 변수 선언
            int starWidth;

            if (i < userNumber) {
                // 윗부분

                // 공백의 개수
                spaceWidth = userNumber - i;

                // 별의 개수
                starWidth = 2 * i - 1;

            } else {
                // 아래부분

                // 아래부분의 기준이 될 i
                int lowerI = 2 * userNumber - i;

                // 공백의 개수
                spaceWidth = userNumber - lowerI;

                // 별의 개수
                starWidth = 2 * lowerI - 1;

            }
            // 공백을 담당하는 j for문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";              
            }
            System.out.println(stars);
        }

            }
            
            
        }

    

