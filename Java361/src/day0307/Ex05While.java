package day0307;
// 제어문 02
// while 반복문

// while 반복문은
// 특정 조건식이 true가 나오는동안
// 속해있는 코드 블락을 계속 실행시킨다.

// while 반복문의 구조
// while(조건식) {
//          조건식의 결과값이 true이면
//          실행할 코드
// }

public class Ex05While {
    public static void main(String[] args) {
        // while의 조건식에서 사용할 int 변수 선언 및 초기화
        int number = 3;
        
        // number의 현재 값이 0보다 클 동안
        // number의 현재 값을 출력하는 코드
        // 단, number의 현재 값을 출력하고 나서는
        // 값을 1 감소 시킨다.
        
        
        while (number > 0) {
            int a = 0;
            System.out.println(number);
            number--;
            System.out.println("a의 현재 값: " + a);
            a++;
        }
        
     
    }

}
