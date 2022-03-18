package day0317;
// 6개의 중복되지 않는 랜덤숫자를 뽑아주는 Lotto
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ex02Lotto {
    public static void main(String[] args) {
        // 랜덤 숫자를 뽑을 때 사용할 Random 클래스 객체
        Random random = new Random();
        // 랜덤 숫자를 저장할 ArrayList 객체
        // 단, template에 int의 wrapper 클래스를 적어준다.
        // int의 wrapper 클래스는 Integer 이다.
        ArrayList<Integer> list = new ArrayList<>();
        
        // list에 6개의 중복되지 않는 랜덤 숫자를 추가하는 코드
        while(list.size() < 6) {
            // Integer 객체의 경우, int와 완벽히 일치하므로
            // 우리가 여기서 int 타입의 변수 temp를 만들어도 되지만
            // 한번 Integer로 만들어보자
            Integer temp = random.nextInt(45) + 1;
            if(!list.contains(temp)) {
                list.add(temp);
            }
        }
        
        // Collections 라는 클래스의 static 메소드인 sort()를 사용하면
        // ArrayList 객체의 정렬을 손쉽게 할 수 있다.
        Collections.sort(list);
        
        // list의 내용을 출력한다.
        // 만약 우리가 콜렉션에 해당하는 클래스 객체를 단순히 출력만 할 때에는
        // forEach()라는 특수한 구조를 사용해도 된다.
        // 단, 해당 객체의 크기가 변하면, forEach() 구문은 에러가 발생한다.
        
        // forEach 구조는 다음과 같이 쓴다.
        // for(템플릿 변수 이름: 콜렉션 객체) {
        //
        // }
        
        // 위 구조는 다음 코드와 의미가 완전히 동일하다.
        // for(int i = 0; i < 콜렉션 객체.size(); i++ {
        //      템플릿 변수이름 = 콜렉션 객체.get(i);
        //
        // }
        
        // 지금 현재 우리의 ArrayList 객체인 list를 기준으로 해서
        // for문 형태와 forEach문 형태로 적으면 각각 다음과 같다.
        for(int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
        }
        
        for(Integer num : list) {
            System.out.println(num);
        }
        
    }
}
