package day0304;
// if - else if 조건문

// if - else if 조건문에서는
// 처음 if 조건식을 체크하여
// true가 나오면 해당 코드 블락을 실행
// false 가 나오면 그 다음에 나오는 else if 조건식을 체크
// true 가 나오면 해당 코드 블락을 실행
// false 가 나오면 그 다음에 나오는 else if 조건식을 체크
// 이런식으로 진행이 된다.
// 또한 모든 조건식이 false가 나왔을 때 실행할 코드가 존재하면
// 제일 마지막에 else를 붙여서 처리해 줄수도 있다.
// 단, else 이후로는 새로운 else if가 나올 수 없다.

// if - else if 구즌 다음과 같이 이루어져 있다.

// if (조건식1) {
//      조건식1이 true일 때 실행할 코드
// } else if(조건식2) {
//      조건식2가 true일 때 실행할 코드
// } else if(조건식3) ....
//      조건식3이 true일 때 실행할 코드
// } else {
//      위 조건식들이 모두 false일 때 실행할 코드
// }

public class Ex05IfElseIf {
    public static void main(String[] args) {
        // 조건식에서 사용할 int 변수 선언 및 초기화
        int number = 20;
        
        // number가 음의 정수인지
        // 0인지
        // 한자리 양의 정수인지
        // 아니면 두자리 이상의 양의 정수인지
        // 출력하는 if - else if 구조
        
        if (number < 0) {
            System.out.println("음의 정수입니다.");            
        } else if(number == 0) {
            System.out.println("0입니다.");
        } else if(number < 10) {
            System.out.println("한자리 양의 정수입니다.");
        } else {
            System.out.println("두자리 이상의 양의 정수입니다.");
        }
    }
    

}
