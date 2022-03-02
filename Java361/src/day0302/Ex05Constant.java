package day0302;
// 상수(Constant)
// 변수와 마찬가지로 상수도 값을 저장하는 공간이지만,
// 차이점은 상수는 딱 한번만 값을 저장할 수 있다.

// 상수는 다음과 같은 형태로 선언한다.
// final 데이터타입 상수이름;

public class Ex05Constant {
    public static void main(String[] args) {
        // int 상수 NUMBER를 선언해보자
        final int NUMBER;
        // NUMBER에 20을 할당해보자
        NUMBER = 20;
        // 화면에 NUMBER의 현재값을 출력해보자
        System.out.println(NUMBER);
        
        // NUMBER에 30을 할당해보자
        // NUMBER = 30; -> 이미 우리가 상수에 20이란 값을 저장했으므로
        // 더이상 새로운 값을 저장할 수 없다.
        // NUMBER = 20; -> 컴퓨터는 기존의 값이 얼마이던 간에
        // 오른쪽 값을 새롭게 저장하려고 하므로 에러가 발생
        
    }
}
