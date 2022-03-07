package day0307;
// 무한 반복문
// 무한 반복문이란 반복 조건식이 항상 true가 나와서
// 반복문이 무한하게 진행되는 코드를 우리가 무한 반복문이라고 한다.
// 무한 반복문을 만드는 방법은 다양하게 있지만
// 우리는 그 중에서 while을 사용한 무한 반복문을 만드는 세가지 방법을 알아볼 것이다.

public class Ex09InfiniteLoop {
    public static void main(String[] args) {
        // 1. 변수를 사용하는 조건식이지만
        //    변수의 값이 변함 없을 경우
        
        int number = 3;
        
        // while(number > 0) {
        //     System.out.println("무한반복 1번");
        // }
        
        // 2. 항상 참이 나오는 조건식
        
        // while(0 != 1) {
        //     System.out.println("무한반복 2번");
        // }
        
        // 3. true
        // while(true) {
        //     System.out.println("무한반복 3번");
        // }
    }

}
