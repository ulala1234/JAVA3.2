package day0303;
// printf를 사용하여 내가 출력할 내용을 다양한
// 형식에 맞추는 방법들
//
public class Ex12Printf {
    public static void main(String[] args) {
        // int 변수 number를 선언하고 47을 할당하자
        int number = 47;
        
        // 1. 10진법 정수('D'ecimal)
        // 1-A. 10진법 정수를 그대로 출력하라
        System.out.printf("1-A. [%d]\n", number);
        // 1-B. 10진법 정수를 오른쪽 정렬 4자리로 출력해라
        System.out.printf("1-B. [%4d]\n", number);
        // 1-C. 10진법 정수 12345를 오른쪽 정렬 4자리로 출력해라
        System.out.printf("1-C. [%4d]\n", 12345);
        
        
    }
}
