package day0311;
// 로또 번호 제작기 ver 3.0

// 사용자로부터 로또 번호를 입력받아서
// 정렬하여 출력해주는 프로그램.
// 단, 1~45를 벗어나거나 중복된 숫자를 입력할 시에는
// 사용자가 다시 입력하도록 프로그램 코드를 작성하시오
// 4시 20분까지

import java.util.Scanner;

public class Ex01Lotto03 {
    public static void main(String[] args) {
        // 상수
        // 1. 로또 번호의 최소값
        final int LOTTO_MIN = 1;
        // 2. 로또 번호의 최대값
        final int LOTTO_MAX = 45;
        // 3. 배열의 크기
        final int MAX_LENGTH = 6;

        // 1. 입력받기
        // - Scanner
        Scanner scanner = new Scanner(System.in);
        // - 배열
        // -- 매직넘버 없애주기 - 로또 개수 상수만들기
        // -- 매직넘버 없애주기 - 로또 최소 최대 상수 만들기
        final int LOTTO = 6;
        int[] lotto = new int[LOTTO];

        // - 로또번호를 입력하세요 > String 변수 = scanner.메소드
        String userNumber = scanner.nextLine();

        // 1~45벗어나거나 중복된 숫자를 입력하면 다시 입력하세요.
        // while(userNumber 1 이상 || 45 이상 아니거나, 중복된 숫자를 입력한지 어떻게 알지?

        // 2. 정렬하기
        // 3. 출력하기

 
        System.out.println("---------------------------------");

        // 입력한 값을 저장할 배열 선언 및 초기화
        int[] lottoNumbers = new int[MAX_LENGTH];

        // 사용자로부터 입력받은 값을 배열에 저장하는 i for문
        for (int i = 0; i < lottoNumbers.length;) {
            // 사용자로부터 숫자를 하나 입력받는다.
            System.out.printf("%d번째 숫자를 입력해주세요\n", i + 1);
            System.out.print("> ");
            int temp = scanner.nextInt();

            // 사용자가 입력한 값 temp가 올바르면 true, 올바르지 않으면
            // false가 저장될 boolean 변수 선언 및 true로 초기화
            boolean validSwitch = true;

            // 먼저 사용자가 입력한 숫자가 로또 번호 숫자의 범위에 속하는지 체크하여
            // 속하면 true, 속하지 않으면 false가 저장되게 코드를 작성한다.
            validSwitch = temp >= LOTTO_MIN && temp <= LOTTO_MAX;

            // j for문을 사용하여 사용자가 입력한 숫자가 중복인지 확인하여
            // 만약 중복이면 validSwitch에 false를 저장한다.
            for (int j = 0; j < i; j++) {
                if (temp == lottoNumbers[j]) {
                    validSwitch = false;
                }
            }

            // validSwithch에 저장된 값이 true이면
            // temp를 lottoNumbers 배열의 i번째 인덱스 칸에 저장하고
            // i를 1 증가시킨다.
            // 만약 false이면
            // "범위를 벗어나거나 중복된 숫자입니다." 만 출력되게 한다.
            if (validSwitch) {
                lottoNumbers[i] = temp;
                i++;
            } else {
                System.out.println("범위를 벗어나거나 중복된 숫자입니다.");
                System.out.println("확인하시고 다시 입력해주세요.");
            }
        }

        // 값 입력이 완료된 배열을 오름차순 정렬하는 i for문
        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = temp;
                i = -1;
            }
        }

        // 결과를 출력한다.
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("%d번 숫자: [%2d]\n", i, lottoNumbers[i]);
        }

    }
}
