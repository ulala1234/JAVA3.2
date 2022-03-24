package day0322;
// 정규표현식(Regular Expression)
// 정규표현식이란, String 값에 대해
// 특정 패턴을 만족하는지 확인할 때
// 패턴을 뜻하는 특수한 표현식이다.

// 예를 들어서
// 숫자의 경우에는
// 시작부터 끝까지 0부터 9가 1개 이상으로 이루어진 것이라고 표현 가능하다.

// 핸드폰 번호(010 기준)은 다음과 같이 표현 가능하다.
// 010-1~9로 시작하는 4자리 숫자-1~9로 시작하는 4자리 숫자

public class Ex02RegEx {
    public static void main(String[] args) {
        // 정규 표현식은 다음과 같은 구조로 이루어진다.
        // ^~~~~$
        // ^: 문자열의 시작
        // ~~~~: 맞는지 확인할 문자열 구조
        // $: 문자열 끝
        
        // a: 글자 a 1개
        // [abc]: a, b, c 중 1개
        // [0-9]: 0부터 9 중 1개
        
        String pattern = "^ab$";
        System.out.println("ab.matches(pattern): " + "ab".matches(pattern));
        System.out.println("bc.matches(pattern): " + "bc".matches(pattern));
        System.out.println("ab..matches(pattern): " + "ab.".matches(pattern));
        pattern = "^[a|d]$";
        System.out.println("a.matches(pattern): " + "a".matches(pattern));
        System.out.println("d.matches(pattern): " + "d".matches(pattern));
        System.out.println("ab..matches(pattern): " + "ab.".matches(pattern));
        
        // 우리가 지정한 글자의 종류가 총 몇번 나올지도 직접 지정해 줄 수 있다.
        // *: 1번 이상
        // +: 0번 이상
        // {X}: X번 이상
        pattern = "^[A-z]*";
        System.out.println("a.matches(pattern): " + "a".matches(pattern));
        System.out.println("d.matches(pattern): " + "d".matches(pattern));
        System.out.println("ab..matches(pattern): " + "ab.".matches(pattern));
        pattern = "^[A-z]+";
        System.out.println("a.matches(pattern): " + "a".matches(pattern));
        System.out.println("d.matches(pattern): " + "d".matches(pattern));
        System.out.println("ab..matches(pattern): " + "ab.".matches(pattern));
        
        // 해당 String 값이 숫자로만 이루어져 있는지 체크하는 정규 표현식
        // 단, 자릿수는 0자리 이상
        pattern = "^[0-9]+$";
        System.out.println("123.matches(pattern): " + "123".matches(pattern));
        System.out.println("123a.matches(pattern): " + "123a".matches(pattern));
        System.out.println("a123.matches(pattern): " + "a123".matches(pattern));
        System.out.println("abc.matches(pattern): " + "abc".matches(pattern));
        
        // 정규 표현식으로 이메일 주소값 확인해보기
        // 1. 이메일 주소는 숫자로 시작할 수 없다.
        // 2. 이메일 주소는 첫 글자를 제외한 앞 부분이 알파벳과 숫자로 이루어져있다.
        // 3. 이메일 주소 앞부분이 끝나면 @ 가 나온다.
        // 4. 이메일 주소 뒷부분은 맨 첫글자가 알파벳으로 시작한다.
        // 5. 뒷부분에 첫 파트는 알파벳과 숫자로 이루어져 있다.
        // 6. 뒷부분의 첫 파트가 끝나면 . 이 나온다.
        // 7. . 다음에는 알파벳과 . 으로 이루어진 스트링 값이 나온다.
        
        pattern = "^[A-Za-z]\\w*@[A-Za-z]\\w*.[\\w|.]*$";
        System.out.println("aaa".matches(pattern));
        System.out.println("bc@".matches(pattern));
        System.out.println("bc@aa.b".matches(pattern));
        System.out.println("bc@aa.bb.cc".matches(pattern));
        
        
                

    }

}
