package day0308;
// 2중 for문을 사용하여
// 1에서 100사이의 소수를 구하는 프로그램

// 1. 소수란 무엇인가?
//    약수가 1과 자기 자신인 숫자
//    = 약수가 2개인 숫자
// 2. 약수란 무엇인가?
//    나누어 떨어지는 수
//    = a를 b로 나눠서 떨어지면
//      b는 a의 약수이다.
//    = a를 b로 나눠서 나머지가 0이면
//      b는 a의 약수이다.
// 3. 어떤 숫자 a의 가장 큰 약수는?
//    a 자기 자신이다.

public class Ex07PrimeNumber {
    public static void main(String[] args) {
        // i for문에서 제어변수 i는
        // 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면 i의 최소값은? 1
        // i의 최대값은? 100
        
        // i의 최소값을 저장한 int 변수
        int iMin = 1;
        // i의 최대값을 저정한 int 변수
        int iMax = 100;
        
        for(int i = iMin; i <= iMax; i++) {
            // i의 약수의 개수를 저장한 int 변수 count
            int count = 0;
            
            // j for문의 제어변수 j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
            // 그렇다면 j의 최소값은? 1
            // j의 최대값은? i
            
            // j의 최소값을 저장할 int 변수
            int jMin = 1;
            // j의 최대값을 저장할 int 변수
            int jMax = i;
            
            for(int j = jMin; j <= jMax; j++) {
                // i를 j로 나눠서
                // 나머지가 0이면 count를 1 증가시킨다.
                
                if(i % j == 0) {
                    count++;
                }
            }
            
            if(count == 2) {
                System.out.printf("[%2d]는 소수입니다.\n", i);
            }
        }
    }

}
