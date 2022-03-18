package day0317;
// ArrayList

// 자바는 내부적으로 여러개가 같은 데이터타입의 객체들을 한꺼번에 모아서
// 제어할 수 있는 "Collection" 이라는 개념이 존재한다.
// 이 콜렉션에 해당하는 클래스들은 모두 공통적으로 "동적 할당" 이 구현되어 있다.
// 콜렉션에 해당하는 클래스들을 크게 나누면 다음과 같다.
// List: 순서가 존재하고 중복된 객체도 저장 가능하다.
// Set: 순서가 존재하지만 중복된 객체를 저장할 수 없다.
// Map: 순서가 존재하지 않고 중복된 객체를 저장할 수 없다. 단, 저장된 객체를 불러올 때는
//      미리 약속한 "열쇄(key)" 값으로 불러오게 된다.

// 우리는 여기에서 그중 List에 해당하는 ArrayList를 직접 체험해볼 것이다.

import java.util.ArrayList;
public class Ex01ArrayList {
    public static void main(String[] args) {
        // ArrayList 객체 list를 선언하고 초기화해주는 코드.
        // 단, 콜렉션에 해당하는 클래스 객체들은 반드시 어떤 클래스 혹은 인터페이스가 모여있는지 적어주어야 한다.
        // 적어주는 방법은 각 데이터타입 옆에 <>를 적고 그 안에 모여있을 클래스를 적어야 한다.
        // <>는 우리가 Template이라고 부른다.
        
        // String 객체들이 모여있을 ArrayList 객체 list
        ArrayList<String> list = new ArrayList<>();
        
        // 이번 예제에서 사용할 String 객체를 5개 선언과 초기화해보자.
        String str1 = "abc";
        String str2 = "def";
        String str3 = "ghi";
        String str4 = "jkl";
        String str5 = new String("abc");
        
        // 1. ArrayList 객체의 크기를 확인할 때에는 size()를 사용한다.
        System.out.println("1. size()");
        System.out.println("list.size(): " + list.size());
        System.out.println("------------------------\n");
        
        // 2. 현재 ArrayList의 객체가 비어있는지 확인할 때에는 isEmpty()를 사용한다.
        System.out.println("2. isEmpty()");
        System.out.println("list.isEmpty(): " + list.isEmpty());
        System.out.println("------------------------\n");
        
        // 3. ArrayList에 새로운 객체를 추가할 때에는 add(객체)를 사용한다.
        System.out.println("2. add(객체)");
        System.out.println("add() 전 list.size(): " + list.size());
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        System.out.println("add() 후 list.size(): " + list.size());
        System.out.println("------------------------\n");
        
        // 4. 특정 인덱스에 저장된 객체를 불러올 때에는 get(인덱스)로 불러온다.
        System.out.println("4. get(인덱스)");
        System.out.println("list.get(2): " + list.get(2));
        // 단, get()의 경우 올바르지 않은 인덱스를 파라미터로 넘기면 에러가 발생한다.
        // System.out.println("list.get(-1): " + list.get(-1));
        // System.out.println("list.get(100): " + list.get(100));
        System.out.println("------------------------\n");
        
        // 5. ArrayList 객체의 특정 인덱스에 새로운 객체를 끼어넣으려면
        //    add(인덱스, 객체)를 사용한다.
        System.out.println("5. add(인덱스, 객체)");
        System.out.println("add(인덱스, 객체) 전 list.get(): " + list.get(1));
        list.add(1, "가나다");
        System.out.println("add(인덱스, 객체) 후 list.get(): " + list.get(1));
        System.out.println("------------------------\n");
        
        // 6. ArrayList 객체의 특정 인덱스의 객체를 다른 객체로 바꿀 때에는
        //    set(인덱스, 객체)를 사용한다.
        //    단, 해당 메소드는 원래 있던 객체를 리턴한다.
        System.out.println("6. set(인덱스, 객체)");
        System.out.println("set(인덱스, 객체) 전 list.get(0): " + list.get(0));
        String temp = list.set(0, "aaa");
        System.out.println("set(인덱스, 객체) 후 list.get(0): " + list.get(0));
        System.out.println("원래 0번 인덱스에 있던 객체: " + temp);
        System.out.println("------------------------\n");
        
        // 7. ArrayList 객체 안에 저장된 값들을 모두 날릴 때에는
        //    clear()를 사용한다.
        System.out.println("7. clear()");
        System.out.println("clear() 전 list.isEmpty(): " + list.isEmpty());
        list.clear();
        System.out.println("clear() 후 list.isEmpty(): " + list.isEmpty());
        System.out.println("------------------------\n");
        
        // 7번 이후 비어있는 ArrayList 객체에 다시 String 객체를 추가한다.
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str1);
        list.add(str4);
        
        // 여기서부터 알려드릴 메소드들은 모두다 템플릿 클래스 안에 
        // equals() 가 오버라이드가 되어있어야 정상적으로 작동하는 메소드들이다.
        
        // 8. 특정 객체가 ArrayList 객체에 존재하는지 찾을 때에는 contains(객체)를 사용한다.
        System.out.println("8. contains(객체)");
        System.out.println("list.contains(str1): " + list.contains(str1));
        System.out.println("list.contains(ㅋㅋㅋ): " + list.contains("ㅋㅋㅋ"));
        System.out.println("list.contains(str5): " + list.contains(str5));
        System.out.println("------------------------\n");
        
        // 9. 특정 객체가 ArrayList의 몇번 인덱스에 있는지 찾을 때에는 indexOf(객체)를 사용한다.
        //    가장 먼저 등장하는 인덱스를 불러오며, 만약 해당 객체가 존재하지 않으면
        //    -1이 리턴된다.
        System.out.println("9. indexOf(객체)");
        System.out.println("list.indexOf(str1): " + list.indexOf(str1));
        System.out.println("list.indexOf(ㅋㅋㅋ): " + list.indexOf("ㅋㅋㅋ"));
        System.out.println("list.indexOf(str5): " + list.indexOf(str5));
        System.out.println("------------------------\n");
        
        // 10. 특정 객체가 ArrayList의 가장 마지막 등장 인덱스를 찾을 때에는 
        //     lastIndexOf(객체)를 사용한다.
        //     만약 해당 객체가 존재하지 않으면 -1이 리턴된다.
        System.out.println("9. lastIndexOf(객체)");
        System.out.println("list.lastIndexOf(str1): " + list.lastIndexOf(str1));
        System.out.println("list.lastIndexOf(ㅋㅋㅋ): " + list.lastIndexOf("ㅋㅋㅋ"));
        System.out.println("list.lastIndexOf(str5): " + list.lastIndexOf(str5));
        System.out.println("------------------------\n");
        
        // 11. 특정 인덱스에 저장된 객체를 ArrayList 객체에서 삭제할 때에는
        //     remove(index)를 사용한다.
        System.out.println("11. remove(인덱스)");
        System.out.println("remove() 전 list.size(): " + list.size());
        System.out.println("remove() 전 list.get(1): " + list.get(1));
        list.remove(1);
        System.out.println("remove() 후 list.size(): " + list.size());
        System.out.println("remove() 후 list.get(1): " + list.get(1));
        System.out.println("------------------------\n");
                
        // 12. 특정 객체와 일치하는 객체를 ArrayList 객체에서 삭제할 때에는
        //     remove(객체)를 사용한다.
        System.out.println("12. remove(객체)");
        System.out.println("remove(str4) 전 list.contains(str4): " + list.contains(str4));
        list.remove(str4);
        System.out.println("remove(str4) 후 list.contains(str4): " + list.contains(str4));
        System.out.println("remove(str5) 전 list.indexOf(str1): " + list.indexOf(str1));
        list.remove(str5);
        System.out.println("remove(str5) 후 list.indexOf(str1): " + list.indexOf(str1));
        System.out.println("------------------------\n");
        
        
        
    }

}
