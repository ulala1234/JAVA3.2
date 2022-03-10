package day0308;
// 난수(Random)

// 난수란 어떤 특정 패턴이 존재하지 않고
// 무작위적으로 숫자가 나오는 것을 우리가 난수라고 한다.

// 자바에서 난수는 우리가 직접 코딩을 해서
// 만들어주는 것이 아니라
// 난수를 제공해주는 Random 이라는 클래스를 변수를 통해서
// 제공받게 된다.
// Scanner와 마찬가지로, Random 클래스는 포장 클래스가 아니므로
// 우리가 import 해야한다.

import java.util.Random;

public class Ex01Random {
    public static void main(String[] args) {
        // Random 클래스는 Scanner와 다르게
        // 초기화시 () 안에 아무것도 넣지 않는다.
        Random random = new Random();
        
        // Random 클래스의 원리를 간단하게 설명하자면
        // 내부적으로 0부터 1 사이의 수많은 실수를
        // 뒤죽박죽 되어있는 순서로 가지고 있고
        // 우리가 실행시켜서 특정 정수 혹은 실수를
        // 뽑아달라고 하면
        // 그 실수를 최대값에 곱하여
        // 난수를 만들어준다.
        
        // 1. 만약 실수 즉 double 타입의
        //    난수가 필요하면
        //    Random 클래스 변수의 nextEouble()을 실행시키면 된다.
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        
        // 2. 만약 정수 즉 int 타입의
        //    난수가 필요하면
        //    Random 클래스 변수의 nextInt()를 실행시키면 된다.
        //    단, 이때에는 int의 전체 범위인 -2의 31승부터 2의 31승 -1 까지
        //    난수가 나오게 된다.
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        
        // 3. 특정 범위의 정수 안에 난수를 뽑는 것도 가능하다.
        //    이 때에는 nextInt(시작, 끝) 으로 지정한다.
        //    단, 이렇게 범위를 지정할 때에는 최대 난수는 끝 -1이 된다.
        //    즉, 시작 <= 난수 < 끝
        //    의 범위가 된다.(버전 달라서 안되는 사람 발생)
        // System.out.println(random.nextInt(5, 9));
        // System.out.println(random.nextInt(5, 9));
        // System.out.println(random.nextInt(5, 9));
        
        // 또는, 0부터 특정 숫자 -1 사이의 숫자를 뽑을 수 있는데
        // nextInt(특정 숫자) 로 지정한다.
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        
        // 그렇다면 만약 우리가
        // 0부터 특정숫자 -1 이 아니라
        // 1부터 특정 숫자까지의 난수가 필요하다면
        // 어떻게 해야할까?
        // nextInt(특정 숫자) + 1을 하면
        // 난수로 뽑힌 숫자에 무조건 1씩 더하게 되므로
        // 1부터 해당 숫자까지의 난수가 나오게 된다.
        
        // 1부터 특정 숫자가 아니라
        // 10부터 40 사이의 랜덤한 숫자를 뽑고 싶다면?
        
        // nextInt(나올 수 있는 가지의 수) + 최소 값
        
        

    }

}
