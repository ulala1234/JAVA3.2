package day0310;

import java.util.Scanner;

public class StarPrinter07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 7번");
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
        int iMax = userNumber * 2 - 1;

        for (int i = iMin; i <= iMax; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
            
            // 공백의 개수
            int spaceWidth = userNumber - i;
            
            // 공백을 담당하는 j for문
            for(int j = 1; j <= spaceWidth; j++) {
                stars += " ";
                }
            
            int jMin = 1;

            int jMax = i;

            for (int j = jMin; j <= jMax; j++) {
                System.out.print("*");

                }
            
            System.out.println(stars);
        }

        System.out.println("----------------------------");
        
        // 윗부분을 담당하는 i for문
        for (int i = 1; i <= userNumber - 1; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
            
            // 별의 개수
            int starWidth = i;
            
            // 별을 담당하는 j for문
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
        
            System.out.println(stars);
        }
        
        // 아래부분을 담당하는 i for문
        for(int i = 1; i <= userNumber; i++) {
            String stars = "";
            
            // 별의 개수
            int starWidth = userNumber - i + 1;
            
            // 별을 담당하는 j for 문
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        }
            

        }
    



