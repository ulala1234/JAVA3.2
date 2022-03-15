package day0314;
// ScannerUtil을 우리가 원하는대로 사용 가능하지 확인하는 클래스

import java.util.Scanner;

import util.ScannerUtil;

public class Ex01ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. nextInt(Scanner, String)
        int temp = ScannerUtil.nextInt(scanner, "임시로 값을 입력해보기");
        System.out.println("temp의 현재 값: " + temp);
        String message = "nextInt(Scanner, String) 체험해보기";
        temp = ScannerUtil.nextInt(scanner, message);
        System.out.println("temp의 현재 값: " + temp);
        
        // 2. nextInt(Scanner, String, int, int)
        temp = ScannerUtil.nextInt(scanner, "0이상 10이하 입력받기", 0, 10);
        System.out.println("temp의 현재 값: " + temp);
        
        // 3. nextLine(Scanner, String)
        String str = ScannerUtil.nextLine(scanner, "스캐너 버그가 발생할까?");
        System.out.println("str의 현재 값: " + str);
        
        str = ScannerUtil.nextLine(scanner, "스캐너 버그가 발생할까?");
        System.out.println("str의 현재 값: " + str);
        
        // 4. nextDouble(Scanner, String)
        double temp1 = ScannerUtil.nextDouble(scanner, "double");
        System.out.println("temp1의 현재 값: " + temp1);

    }

}
