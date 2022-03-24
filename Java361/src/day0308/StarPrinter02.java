package day0308;

import java.util.Scanner;

// 별찍기 2번

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 2번");
        System.out.println("***********************************************");
        
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        // i의 최소값
        int iMin = 1;
        // i의 최대값
        int iMax = userNumber;
        
        for(int i = iMin; i <= iMax; i++) {
            // j의 최소값
            int jMin = i;
            
            // j의 최대값
            int jMax = userNumber;
            
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
            
            for(int j = jMin; j <= jMax; j++) {
                // j for문이 반복하면서
                // String 변수 stars의 현재 내용에
                // *을 이어붙여서 다시 stars에 저장해라
                stars += "*";                
            }
            
            System.out.println(stars);
        } 
    }

}
