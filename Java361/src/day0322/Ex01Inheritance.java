package day0322;

import model.ReplyDTO;

// 상속(Inheritance)
// 상속이란, 자바에서 부모 클래스의 코드를 자식 클래스가 다시 안 써도
// 그대로 쓸 수 있게 하는 방법이다.

// 우리가 직접 코드로 입력하지 않았지만 우리가 만들었던 모든 클래스들은
// java.lang.Object를 상속 받아서 그 안에 equals(), 생성자, toString() 등의 메소드를
// 사용할 수 있다.

// 하지만 우리가 직접 상속을 하려고 하면 어떻게 해야할까?
// 또, 상속에는 어떤 종류가 있을까?
// 클래스 상속: 클래스 상속이 우리가 일반적으로 말하는 상속으로써
// 코드의 재사용성을 높여주는 방법이다.
// 클래스 상속은 우리가 클래스 선언이 끝나고 {} 시작 전에 extends "상속할 클래스 이름" 을 적어서 
// 상속을 하게 된다.

// 인터페이스 상속: 인터페이스 상속은 코드의 재사용성이 아닌, 객체의 "다형성" 이라는 성격을 부여해주기 위해
// 하는 상속이다.
// 인터페이스 상속은 클래스 선언이 끝나고 implements "상속할 인터페이스 이름" 을 적어서 
// 상속을 하게 된다.

// 우리는 일단 클래스 상속부터 배워보게 될 것이다.


public class Ex01Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
        
        
        Felix f = new Felix();
        f.move();
        f.makeSound();
        
        // 다형성
        // 다형성이란 다양한 모습을 가지는 성격을 뜻한다.
        // 프로그래밍에서 다형성이란
        // 파라미터 혹은 객체의 데이터타입을 부모 클래스로 적어두게 되면
        // 실제 해당 메소드를 호출하거나 객체를 초기화할때 자식 클래스의 객체를 파라미터로 넘겨주거나
        // 또는 자식 클래스의 생성자를 호출할 수도 있게 된다.
        // 예시: equals(Object o)
        
        ReplyDTO r = new ReplyDTO();
        r.setId(1);
        
        ReplyDTO r2 = new ReplyDTO();
        r2.setId(1);
        
        System.out.println(r.equals(r2));
        System.out.println(r.equals(a));
        System.out.println(r.equals("abc"));
    }
}
