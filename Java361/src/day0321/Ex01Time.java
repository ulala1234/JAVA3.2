package day0321;
// 자바에서 시간을 표시하는 방법
// 기본적으로 자바에서 전통적으로 시간을 표시하는 방법은
// DateTime 이라는 클래스를 사용하는 것이었다.
// DateTime은 1970년 1월 1일 그리니치 표준 시간대 0시 0분 0초를 기준으로 하여
// 목표시간을 1000분의 1초로 나타내는 방법이었다.
// 하지만, 이제는 우리가 DateTime보다는
// Calendar 라는 클래스를 사용하여 시간을 저장하게 되었다.
// 또한, 시간을 출력할 때에는
// 우리가 SimpleDateFormat이라는 것을 사용하게 됐다.
// 각각을 우리가 어떻게 사용하는지 체험해보자.

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01Time {
    public static void main(String[] args) {
        Date d = new Date();
        
        System.out.println(d);
        
        Calendar cal = Calendar.getInstance();
        
        // System.out.print(), printf(), println()에 객체를 파라미터로 넘겨주면?
        // 해당 객체의 toString() 메소드가 실행되서 리턴된 String 값이 결과로 출력된다.
        // Calendar의 경우, 각 필드의 값이 출력되도록 toString()이 정의되어있다.
        System.out.println(cal);
        
        // Calendar 객체의 값을 좀 예쁘게 출력하고 싶다면
        // 우리가 SimpleDateFormat이라는 클래스의 객체를 사용해서
        // Calendar 객체의 getTime() 메소드의 결과값을 예쁘게 조정해서 출력해라 는 식으로
        // 코드를 작성해야 한다.
        
        // SimpleDateFormat의 경우,
        // 객체를 초기화할 때 생성자에
        // 우리가 시간을 어떤 형식으로 출력될지를 지정해야 한다.
        // y: 년도
        // M: 월
        // d: 일
        // H: 24시 기준 시간
        // h: 12시 기준 시간
        // m: 분
        // s: 초
        // SS: 1/1000 초
        
        // ####년 #월 #일 ##시 #분 #초의 형식으로 출력되게 SimpleDateFormat을 초기화해보자.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 HH시 m분 s초");
        
        // sdf를 사용하여 우리의 현재 시각이 저장되어있는 Calendar 객체의 getTime() 결과를
        // 미리 지정한 양식으로 출력해보자
        System.out.println(sdf.format(cal.getTime()));
        
        // Calendar 객체에 시간 저장하기
        // 단, 월을 입력할 때 주의할 점은 1~12가 아닌
        // 0~11 기준이다.
        // 1. 년/월/일 수정
        // 이때에는 set(int year, int month, int day) 로 저장하면 된다.
        cal.set(2001, 2, 15);
        System.out.println(sdf.format(cal.getTime()));
        
        // 2. 년/월/일/시/분 수정
        // set(year, month, day, hour, minute)
        cal.set(2003, 5, 8, 15, 20);
        System.out.println(sdf.format(cal.getTime()));
        
        // 3. 년/월/일/시/분/초 수정
        // set(year, month, day, hour, minute, second)
        cal.set(2009, 5, 4, 3, 3, 3);
        System.out.println(sdf.format(cal.getTime()));
        
        // 4. 특정 필드만 수정
        // set(Calendar 의 상수, 바꿀 값)
        cal.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println(sdf.format(cal.getTime()));
        
        // 5. 만약 set을 사용해서 잘못된 값(예시: 50일) 등을 넣으면?
        cal.set(Calendar.DAY_OF_MONTH, 50);
        System.out.println(sdf.format(cal.getTime()));
        
    }

}
