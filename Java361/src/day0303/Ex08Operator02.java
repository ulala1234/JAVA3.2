package day0303;
// 연산자 02
// 할당 연산자
// 할당 연산자는 앞에 공간에 뒤의 값을 연산한 결과값을
// 할당하는 연산자이다.
// =, +=. -=. *=, /=, %=, ++, --

public class Ex08Operator02 {
    public static void main(String[]args) {
        // int 변수 number 선언
        int number;
        
        // 1. =
        // 앞에 공간에 뒤의 값을 할당해라
        
        // number에 30을 할당해라
        number = 30;
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // 2. +=
        // 앞의 공간의 현재 값에 뒤의 값을 더한 결과값을
        // 다시 앞의 공간에 할당해라
        
        // number의 현재 값에 2를 더한 결과값을 다시
        // number에 할당해라
        number += 2;
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // 3. *=
        // 앞의 공간의 현재 값에 뒤의 값을 곱한 결과값을
        // 다시 앞의 공간에 할당해라
        
        // number의 현재 값에 4를 곱한 결과값을
        // number에 할당해라
        number *= 4;
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // 4. -=
        // 앞의 공간의 현재 값에 뒤의 값을 뺀 결과값을
        // 다시 앞의 공간에 할당해라
        
        // number 현재값에 64를 뺀 결과값을
        // number에 할당해라
        number -= 64;
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // 5. /=
        // 앞의 공간의 현재 값에 뒤의 값을 나눈 몫을
        // 다시 앞의 공간에 할당해라
        
        // number의 현재 값에 10을 나눈 몫을
        // number에 할당해라
        number /= 10;
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // 6. %=
        // 앞의 공간의 현재 값에 뒤의 값을 나눈 나머지를
        // 다시 앞의 공간에 할당해라
        
        // number의 현재 값에 4를 나눈 나머지를
        // number에 할당해라
        number %= 4;
        
        // number의 현재값을 화면에 출력해라
        System.out.println("number의 현재 값: " + number);
        
        // ++, --
        // ++ 혹은 -- 는 증감연산자라고도 하며
        // 특이하게도 해당 공간에 값을 1 증가시키거나 1 감소시킨다.
        // 단, 변수의 앞에 붙냐 뒤에 붙냐에 따라서
        // 실행 우선순위가 달라진다.
        
        // 전위 증감연산자
        // 만약 ++ 혹은 --가 변수의 앞에 붙어있으면
        // 전위 증감연산자라고 부르며
        // 해당 라인에서 가장 우선순위가 높다.
        // 즉 가장 빨리 실행되는 그룹에 속한다.
        
        // number의 현재 값 출력
        System.out.println("number의 현재 값: " + number);
        // ++number의 결과값을 화면에 출력해보자
        System.out.println("++number: " + ++number);
        // 위의 87번 라인은 한줄로 적혀있지만 실제론 다음과 같은 단계를 거친다.
        // 1. ++number가 실행되서 number의 현재 값이 2에서 1 증가한
        //    3이 된다.
        // 2. "number: " + number가 실행돼서
        //    "number: " 라는 String 값 뒤에 number의 현재 값 3이
        //    "3" 이라는 String 값으로 변환돼서 이어지고
        //    "number: 3" 이라는 String 값이 결과값이 된다.
        // 3. 2번 단계의 결과값인 "number: 3" 이라는 결과값이 화면에 출력된다.
        
        // number의 현재 값 출력
        System.out.println("number의 현재 값: " + number);
        
        // 후위 증감연산자
        // 만약 ++ 혹은 --가 변수의 뒤에 붙어있으면
        // 후위 증감연산자라고 부르며
        // 해당 라인에서 가장 우선순위가 낮다.
        // 즉 가장 늦게 실행되는 그룹에 속한다.
        
        // number의 현재 값 출력
        System.out.println("number의 현재 값: " + number);
        // number++의 결과값을 화면에 출력해보자
        System.out.println("number++: " + number++);
        // 위의 코드를 단계별로 나누면 다음과 같다.
        // 1. "number++: " + number 가 실행되서
        //    "number++: " 뒤에 number의 현재 값 int 3이 String "3" 으로 변환돼서
        //    이어지고 "number++: 3" 이라는 String 값이 결과값이 된다.
        // 2. 1번의 결과 값인 "number++: 3"이 화면에 출력된다.
        // 3. number++이 실행돼서 number의 현재값이 3에서 1 증가한
        //    4가 된다.
        
        // number의 현재 값 출력
        System.out.println("number의 현재 값: " + number);
        
        // 번외
        // String 변수의 경우 더하기 할당연산이 가능하다.
        // 해당 공간의 현재 String 값에 뒤의 값을 String으로 이어서 나온
        // 결과값을 다시 String 변수에 할당한다.
        
        // String 변수 name을 선언하고 "권" 이라는 값을 할당한다.
        String name = "권";
        // name의 현재값을 화면에 출력한다.
        System.out.println("name의 현재값: " + name);
        // name의 현재 값에 "은" 을 이어 붙인 결과값을
        // 다시 name에 할당한다.
        name+= "은";
        // name의 현재값을 화면에 출력한다.
        System.out.println("name의 현재값: " + name);
                
        
        
        
        
        
    }
}
