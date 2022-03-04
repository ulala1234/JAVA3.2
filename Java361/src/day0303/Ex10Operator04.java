package day0303;
// 연산자 04
// 논리연산자

// 논리연산자는 boolean 데이터타입의 값에 대한 연산을 한다.
public class Ex10Operator04 {
    public static void main(String[]args) {
        // 1. AND 연산자
        //    왼쪽의 값과 오른쪽의 값이 모두 true일때만
        //    true가 결과값으로 연산된다.
        System.out.println("1. AND 연산자");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));
        
        // 2. OR 연산자
        //    OR 연산자는 둘 중 하나라도 true 이면
        //    true가 결과값으로 연산이 된다.
        System.out.println("2. OR 연산자");
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));
        
        // 3. NOT 연산자
        //    NOT 연산자는 해당 boolean 값의 반댓값을 연산한다.
        System.out.println("3. NOT 연산자");
        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
        
        // 논리연산자의 경우, 여러개의 boolean을 연산해서
        // 우리가 원하는 결과를 얻어내는데 사용이 되는데,
        // 대표적으로 어떤 값이 특정 범위에 속하는지 연산하는 경우,
        // 우리가 반드시 논리연산자를 사용해야 한다.
        // 0 <= x <= 10
        int x = 5;
        // System.out.println(0 <= x <= 10);
        // 위의 코드는 먼저 0 <= x가 실행돼서
        // true 혹은 false의 값을 가진 boolean 데이터타입의 결과값이
        // 나오게 된다.
        // 하지만 그 후에 해당 결과값을 10보다 작거나 같은지 비교하려고 한다면
        // true 혹은 false를 10과 비교할 수 없으므로
        // 위 코드는 에러가 발생한다.
        // 따라서 우리는 위의 코드를 논리연산자를 사용하여
        // x가 0 이상 10 이하인지를 확인해야 한다.
        
        // 특정 범위에 속한다는 것은
        // x가 해당 범위의 최소값 보다 크다
        // x가 해당 범위의 최대값 보다 작다
        // 이 2가지 조건을 모두 만족하므로, 즉 모두 true가 나올 때에만
        // true가 나와야 하므로
        // 우리는 AND 연산자를 사용하여
        // 해당 조건이 맞는지를 확인해야 한다.
        System.out.println("x >= 0 && x <= 10: " + (x >= 0 && x <= 10));
        
        
                
        
    }

}
