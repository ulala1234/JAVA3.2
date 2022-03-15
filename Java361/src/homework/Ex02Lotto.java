package homework;
// 숙제 2번.
// 메서드를 실행시킬 때 파라미터로 값을 넘겨주는 경우
// call by value(값에 의한 호출)과 call by reference(참조에 의한 호출)
// 이라는 2가지 방법 중 하나가 실행됩니다.
// 각각이 무엇인지 그리고 언제 실행되는지를 조사해오세요.

// Call By Value:
// 값에 의한 호출은 파라미터로 넘어온 값이 실제 값이 아니라 실제 값을 복사한 값이 넘어오는 경우이다.
// 만약 파라미터의 데이터타입이 기본형 데이터타입일 경우에는 값에 의한 호출이 발생한다.

// Call By Value:
// 참조에 의한 호출은 파라미터로 넘어온 값이 실제 주소값이 넘어오는 경우이다.
// 만약 파라미터의 데이터타입이 참조형 데이터타입일 경우에는 참조에 의한 호출이 발생한다.


public class Ex02Lotto {
    public static void main(String[] args) {
        // 값에 의한 호출의 경우
        System.out.println("-------------------------------");
        System.out.println("1. Call By Value");
        System.out.println("-------------------------------\n");
        int num = 3;
        System.out.println("num의 현재 값: " + num);
        callByValue(num);
        System.out.println("num의 현재 값: " + num);
        
        // 참조에 의한 호출의 경우
        System.out.println("-------------------------------");
        System.out.println("1. Call By Reference");
        System.out.println("-------------------------------\n");
        int[] array = new int[3];
        System.out.println("array[0]의 현재 값: " + array[0]);
        callByReference(array);
        System.out.println("array[0]의 현재 값: " + array[0]);
        
        // 단, 참조에 의한 호출을 사용할 때 한가지 주의할 점은
        // 파라미터로 들어간 참조형 데이터타입의 변수에
        // 새로운 주소값이 부여되면 실제 값이 변경되지 않는다.
        System.out.println("-------------------------------");
        System.out.println("3. 새로운 주소값 부여");
        System.out.println("-------------------------------\n");
        System.out.println("array의 현재 길이: " + array.length);
        array = increaseLength(array);
        System.out.println("array의 현재 길이: " + array.length);


        
    }
    
    public static int[] increaseLength(int[] arr) {
        System.out.println("increaseLength 실행");
        arr = new int[5];
        System.out.println("arr.length: " + arr.length);
        System.out.println("increaseLength 종료");
        
        return arr;
    }
    
    public static void callByValue(int num) {
        System.out.println("callByValue() 실행");
        num++;
        System.out.println("num의 현재 값: " + num);
        System.out.println("callByValue() 종료");


    }

    public static void callByReference(int[] arr) {
        System.out.println("callByReference() 실행");
        arr[0] = 30;
        System.out.println("arr[0]의 현재 값: " + arr[0]);        
        System.out.println("callByReference() 종료");
    }
}
