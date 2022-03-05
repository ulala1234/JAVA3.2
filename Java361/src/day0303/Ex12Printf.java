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
        // 1-D. 10진법 정수를 왼쪽 정렬 4자리로 출력해라
        System.out.printf("1-D. [%-4d]\n", number);
        // 1-E. 10진법 정수를 오른쪽 정렬 4자리로 맞추고
        //      왼쪽 빈 자리가 있으면 0으로 채워서 출력해라
        System.out.printf("1-E. [%04d]\n", number);
        
        // 2. 실수('f'loat)
        // 실수 출력에 사용할 실수 선언 및 초기화
        double d = 123.456;
        // 2-A. 실수를 그대로 출력해라
        System.out.printf("2-A. [%f]\n", d);
        // 2-B. 실수를 오른쪽 정렬 15자리로 출력해라
        System.out.printf("2-B. [%15f]\n", d);
        // 2-C. 실수를 소숫점 3번째자리까지 출력해라
        System.out.printf("2-C. [%.3f]\n", d);
        // 2-D. 실수를 왼쪽 정렬 10자리, 소숫점은 3번째자리까지 출력해라
        System.out.printf("2-D. [%-10.3f]\n", d);
        // 2-E. 실수를 오른쪽 정렬 10자리로 하되 왼쪽 빈 공간이 있으면 0으로 채우고
        // 소숫점은 3번째 자리까지 출력해라
        System.out.printf("2-E. [%010.3f]\n", d);
        
        // 3. 스트링('S'tring)
        // 출력에 사용할 스트링 변수 선언 및 초기화
        String string1 = "aBcD";
        // 3-A. 스트링을 그대로 출력해라
        System.out.printf("3-A. [%s]\n", string1);
        // 3-B. 스트링을 모두 대문자로 변환하여 출력해라
        System.out.printf("3-B. [%S]\n", string1);
        // 3-C. 스트링을 오른쪽 정렬 6자리로 맞추어 출력해라
        System.out.printf("3-C. [%6s]\n", string1);
        // 3-D. 스트링을 왼쪽 정렬 6자리로 맞추어 출력해라
        System.out.printf("3-D. [%-6s]\n", string1);
        
        // printf를 사용할 때 주의해야할 점
        // 1. 우리가 출력할 내용에 다양한 %문자를 사용해서
        //    원하는 형식으로 출력해줄 수 있다.
        System.out.printf("이름: %s 나이: %03d세 직급: %s\n", "권은지", 27, "개발자");
        // 2. 존재하지 않는 %문자를 사용하면 에러가 발생한다.
        // System.out.printf("1%\n", 123);
        // 3. %문자와 출력할 대상의 데이터타입이 다르면 에러가 발생한다.
        // System.out.printf("3%d\n", 12.345);
        // 4. %문자의 개수보다 출력해야할 대상의 개수가 더 많으면?
        System.out.printf("%d %d %d\n", 1, 2, 3, 4, 5);
        // 5. %문자의 개수보다 출력해야할 대상의 개수가 더 적으면?
        // System.out.printf("%d %d %d %d %d\n", 1, 2, 3);
        
        
    }
}
