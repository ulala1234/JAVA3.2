package day0304;
// if - else 조건문

// 우리가 if문을 단독 사용하게 되면
// 해당 조건식이 false가 나왔을 때
// 당연히 해당 조건문은 추가적인 코드 실행을 하지 않는다.
// 하지만 만약 우리가 if문의 조건식이 true가 나왔을 때
// 그리고 false가 나왔을 때 실행시킬 코드가 따로 존재한다면
// if - else 조건문을 사용하게 된다.

// if - else 조건문
// 다음과 같은 구조를 가진다.
// if(조건식) {
//      조건식이 참일 때 실행할 코드
// } else {
//      조건식이 false일 때 실행할 코드
// }
public class Ex04IfElse {
    public static void main(String[] args) {
        // 조건식에서 사용할 int 변수 선언 및 초기화
        int number = -5;

        if (number >= 0) {
            System.out.println("자연수입니다.");
        } else {
            System.out.println("자연수가 아닙니다.");
        }

        System.out.println("프로그램 종료");
    }
}
