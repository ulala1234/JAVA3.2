package util;
// Scanner 클래스의 메소드를 사용할 때
// 편리해질 메소드를 정의해둔 ScannerUtil 클래스

import java.util.Scanner;
public class ScannerUtil {
    // 1. 사용자가 출력하고자 하는 메시지를 양식에 맞추어 출력해줄
    //    printMessage()
    public static void printMessage(String message) {
        System.out.println("-----------------------------");
        System.out.println(message);
        System.out.println("-----------------------------");
        System.out.print("> ");
    }
    
    // 2. 사용자가 출력하고자 하는 메시지를 출력하고
    //    int 데이터타입의 값을 입력 받아서 리턴해주는
    //    nextInt(Scanner, String)
    public static int nextInt(Scanner scanner, String message) {
        String temp = nextLine(scanner, message);
        
        while(!temp.matches("[0-9]+")) {
            System.out.println("잘못 입력하셨습니다.");
            temp = nextLine(scanner, message);
        }
        
        return Integer.parseInt(temp);
    }
    
    // 3. 특정 범위의 int 값만 입력을 받아 리턴하는
    //    nextInt(Scanner, String, int, int)
    public static int nextInt(Scanner scanner, String message, int min, int max) {
        int temp = nextInt(scanner, message);
        
        while(!(temp >= min && temp <= max)) {
            System.out.println("잘못 입력하셨습니다.");
            temp = nextInt(scanner, message);
        }
        
        return temp;
    }
    
    // 4. Scanner 버그를 자동으로 해결해주는
    //    nextLine(Scanner, String)
    public static String nextLine(Scanner scanner, String message) {
        printMessage(message);
        String temp = scanner.nextLine();
        
        // scanner.nextLine()으로 초기화한
        // temp가 아무것도 없는 스트링일 경우,
        // 즉 비어있을 경우에는
        // 다시한번 scanner.nextLine()을 실행해준다.
        // String 변수 혹은 값이 비어있는지 확인할 때에는
        // isEmpty() 라는 메소드를 실행시켜서
        // 비어있으면 true, 비어있지 않으면 false의 값을 받아서
        // 처리하면 된다.
        
        if(temp.isEmpty()) {
            temp = scanner.nextLine();
        }
        
        return temp;
    }
    
    // 5. double 입력을 처리하는
    //    nextDouble(Scanner, String)
    
    // public static double nextDouble(Scanner scanner, String message) {
        // printMessage(message);
        // double temp = scanner.nextDouble();
        
        // return temp;
        
        
        public static double nextDouble(Scanner scanner, String message) {
        printMessage(message);
                 
        return scanner.nextDouble();
    }
    
    // 6. 범위 내 double 입력을 처리하는
    //    nextDouble(Scanner, String, double, double)
    //    단, 이상/이하가 아니라 초과/미만으로 처리한다.
    
        // public static double nextDouble(Scanner scanner, String message, double min, double max) {
        // double temp = nextDouble(scanner, message);
        
        // while(!(temp > min && temp < max)) {
            // System.out.println("잘못 입력하셨습니다.");
             // temp = nextDouble(scanner, message);
       // }
        
        // return temp;
        
       
         public static double nextDouble(Scanner scanner, String message, double min, double max) {
        double temp = nextDouble(scanner, message);
         while(!(temp > min && temp < max)) {
         System.out.println("잘못 입력하셨습니다.");
        temp = nextDouble(scanner, message);
         }
         return temp;
    
    }
         
}
