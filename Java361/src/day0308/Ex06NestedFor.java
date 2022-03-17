package day0308;
// 다중 for 문
// 다중 for문은 중첩 if문 처럼
// 하나의 for문 안에 다른 for문 구조가 들어가 있는 형태이다.
// 다중 for문의 가장 큰 특징은
// 바깥쪽 for문이 한 번 실행되는 동안
// 안쪽 for문은 여러번 실행되는 구조가 된다.
// 또한 바깥쪽 for문의 반복횟수와 안쪽 for문의 반복횟수는 같은 필요가 없다!
public class Ex06NestedFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            System.out.println("---------------------------------");
            
            for(int j = 11; j <=14; j++) {
                System.out.printf("i의 현재값: [%d] j의 현재값: [%d]\n", i, j);
            }
            
            System.out.println("---------------------------------\n");
            
            
        }
            
    }

}
