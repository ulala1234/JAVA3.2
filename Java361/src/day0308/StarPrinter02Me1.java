package day0308;

import java.util.Scanner;

//별찍기 2번

public class StarPrinter02Me1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t\t별찍기 2번");
        System.out.println("***********************************************");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int iMin = 1;
        int iMax = userNumber;

        for (int i = iMin; i <= iMax; i++) {
            int jMin = 1;
            int jMax = i;
            for (int j = jMin; j <= jMax; j--) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
