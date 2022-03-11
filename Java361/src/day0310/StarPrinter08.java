package day0310;
import java.util.Scanner;
public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 8번");
        System.out.println("***********************************************");

        // 출력할 줄 수를 입력 받는다.
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= userNumber - 1; i++) {
            String stars = "";
            
            // 위 공백
            int spaceWidth = userNumber - i;
            for(int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            
            // 위 별
            int starWidth = i;
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
        
            System.out.println(stars);
        }
        
        for(int i = 1; i <= userNumber; i++) {
            String stars = "";
            
            // 아래 공백
            int spaceWidth = i - 1;
            for(int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            
            // 아래 별
            int starWidth = userNumber - spaceWidth;
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
        
            System.out.println(stars);
        }
        
        System.out.println("----------------------------------------");
        
        
        // i 의 최소값
        int iMin = 1;
        
        // i의 최대값
        int iMax = 2 * userNumber - 1;
        
       for(int i = iMin; i <= iMax; i++) {
           // i번쨰 줄에 출력될 내용을 저장할 String 변수
           String stars = "";
           
           if(i < userNumber) {
               // 윗부분
               
               // 공백의 개수
               int spaceWidth = userNumber - i;
               
               // 공백을 담당하는 j for 문
               for(int j = 1; j <= spaceWidth; j++) {
                   stars += " ";
               }
               
               // 별의 개수
               int starWidth = i;
               
               // 별을 담당하는 j for문 
               for(int j = 1; j <= starWidth; j++) {
                   stars += "*";
               }
               
           } else {
               // 아래부분
               
               // 아래부분에서 기준이 될 i
               int lowerI = i - userNumber + 1;
               
               // 공백의 개수
               int spaceWidth = lowerI - 1;
               
               // 공백을 담당하는 j for 문
               for(int j = 1; j <= spaceWidth; j++) {
                   stars += " ";
               }
               
               // 별의 개수
               int starWidth = userNumber - lowerI + 1;
               
               // 별을 담당하는 j for문
               for(int j = 1; j <= starWidth; j++) {
                   stars +="*";
               }
           }
           
           System.out.println(stars);
       }
            
}
}
