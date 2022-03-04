package day0303;
// 형 변환(Type Casting)
// 형 변환이란 특정 데이터타입의 값을 다른 데이터타입의 값으로 변경하는 코드를 뜻한다.

// 형 변환에는 크게 암시적 형변환과 명시적 형변환 두가지 종류가 존재한다.

// 암시적 형변환(Implicit Type Casting)
// 암시적 형변환의 경우, 우리가 별도의 코드를 적어주지 않더라도
// 내부적으로 자동으로 형변환을 하는 경우이다.
// 더 작은 데이터타입의 값을 더 큰 데이터타입의 공간에 저장할 때나
// 혹은 정수 데이터타입의 값을 실수형 데이텉입으로 변환할 때 발생된다.

// 명시적 형변환(Explicit Type Casting)
// 명시적 형변환의 경우, 데이터 손실이 발생할 수 있기 때문에
// 우리가 명시적으로 형변환을 하도록 강제하는 경우이다.
// 형변환 시에 데이터 손실이 발생하는 경우는
// 더 큰 데이터타입의 값을 더 작은 데이터타입의 값으로 변환하거나
// 혹은 실수형 데이터타입의 값을 정수형 데이터타입으로 변환할 떄 발생된다.
// 명시적 형변환은 다음과 같이 코드를 적어준다.
// (바꿀 데이터타입)바꿀 값;
// 실수의 소숫점 이하가 사라지거나
// 정수의 경우에는 overflow 혹은 underflow가 발생할 수도 있다.

// 오버플로우: 정수가 표현 가능한 최대값보다 큰 값이 저장되면서
//          값이 오히려 음의 정수로 바뀌는 경우
// 언더플로우: 정수가 표현 가능한 최소값보다 작은 값이 저장되면서
//          값이 오히려 양의 정수로 바뀌는 경우

public class Ex06TypeCasting {
    public static void main(String[] args) {
        //byte 변수 myByte 선언 후 50 저장
        byte myByte = 50;
        
        // 암시적 형변환의 경우
        // 1. 더 작은 데이터타입의 값을 더 큰 데이터타입의 공간에 저장하는 경우
        // int 변수 myInt 선언 후 myByte의 현재 값을 저장
        int myInt = myByte;
        // 화면에 myInt의 현재 값 출력
        System.out.println(myInt);
        
        // 2. 정수형 데이터타입의 값을 실수형 데이터타입으로 변환하는 경우
        // double 변수 myDouble 선언 후 myByte의 현재 값을 저장
        double myDouble = myByte;
        // 화면에 myDouble의 현재 값 출력
        System.out.println(myDouble);
        
        // 명시적 형변환의 경우
        // myInt에 20 저장
        myInt = 20;
        // myDouble에 23.4 저장
        myDouble = 23.4;
        
        // 1. 더 큰 데이터타입의 값을 더 작은 데이터타입의 값으로 변환하는 경우
        // myInt의 값을 byte로 형 변환하여 myByte에 저장
        myByte = (byte)myInt;
        // 화면에 myByte의 현재 값 출력
        System.out.println(myByte);
        
        // 2. 실수형 데이터타입의 값을 정수형 데이터타입의 값으로 변환하는 경우
        // myDouble의 값을 byte로 형 변환하여 myByte에 저장
        myByte = (byte)myDouble;
        System.out.println(myByte);
        
        // 오버플로우
        // myByte에 128을 명시적 형변환하여 저장
        myByte = (byte)128;
        // 화면에 myByte의 현재 값 출력
        System.out.println(myByte);
        
        // 언더플로우
        // myByte에 -130을 명시적으로 형변환하여 저장
        myByte = (byte)-130;
        // 화면에 myByte의 현재 값 출력
        System.out.println(myByte);
        
    }
}
