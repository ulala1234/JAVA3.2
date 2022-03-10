package day0308;

// 별찍기 1번
import java.util.Scanner;

public class StarPrinter01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 1번");
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
            // j for문을 사용하여
            // i번째 줄에 별을 print로 찍어낸다.

            // 이 문제에서 별은 각 줄마다 i개만큼 들어간다.
            // 즉 j for문은 총 i번 반복되어야 한다.

            // j의 최소값
            int jMin = 1;

            // j의 최대값
            int jMax = i;

            for (int j = jMin; j <= jMax; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
//        System.out.println("***********************************************");
//        System.out.println("\t\t별찍기 2번");
 //       System.out.println("***********************************************");

 //       System.out.println("출력할 줄 수를 입력해주세요.");
 //       System.out.print("> ");
  //      userNumber = scanner.nextInt();
        
  //      iMin = 1;
   //     iMax = userNumber;
       
     //   for (int i = iMin; i <= iMax; i++) {
   //         int jMin = 1;
   //         int jMax = i;
   //         for (int j = jMin; j <= jMax; j--) {
    //            System.out.print("*");
     //       }

    //        System.out.println();
            
   //     }
        System.out.println("-----------------------------------------\n");
                   
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
        
 //       for(int i = iMin; i <= iMax; i++) {
 //           int jMin = 1;
  //          int jMax = i;
            
    //        String space = "";
    //        for(int j = jMin; j <= jMax; j++) {
     //           System.out.print(space + "*");
                
                
     //       }
     //       space += " ";
     //       System.out.println();

      //  }
        
        System.out.println("-----------------------------------------\n");
        
        for(int i = iMin; i <= iMax; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
            
            // 공백의 개수를 저장하는 int 변수
            int spaceWidth = userNumber - i;
            // 공백을 담당하는 j for문
            for(int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            
            // 별의 개수를 저장하는 int 변수
            int starWidth = i;
            // 별을 담당하는 j for문
            for(int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        }
        
    }


