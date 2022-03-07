package day0303;
// 자바 콘솔화면에 출력하는 3가지 방법
// 우리가 지금까지는 화면에 출력을 할 때
// println()만 사용을 했지만
// 사실 다른 몇가지 방법으로도 우리가 화면에 출력을 할 수 있다.
// 우리는 그 중에서 대표적인 3가지 방법을 알아볼 것이다!
public class Ex11Print {
    public static void main(String[]args) {
        // 출력에 사용할 String 변수 string1과 string2를 선언하고
        // 각각 "abcd"와 "EFGH"를 할당한다.
        String string1 = "abcd";
        String string2 = "EFGH";
        
        // 1. print()
        // print()는 괄호 안의 내용을 출력하고
        // 만약 그 다음에 출력할 내용이 있으면 출력된 내용이
        // 오른쪽 한칸 옆부터 출력을 시작한다.
        System.out.print(string1);
        System.out.print(string2);
        
        // 2. println()
        // println()은 "print a line"의 줄임말로써
        // 괄호 안의 내용을 출력하고
        // 만약 그 다음에 출력할 내용이 있으면
        // 출력된 내용의 다음 줄 첫번째 칸부터 출력을 시작한다.
        System.out.println(string1);
        System.out.println(string2);
        
        // 3. printf()
        // printf()는 "print in format"의 줄임말로써
        // 괄호 안의 내용을 형식에 맞추어 출력하고
        // 만약 그 다음에 출력할 내용이 있으면
        // 출력된 내용의 오른쪽 칸부터 출력을 시작한다.
        System.out.printf("%s", string1);
        System.out.printf("%s", string2);
        
        System.out.println();        
        //4. 이스케이프 문자
        // 이스케이프 문자란, 자바에서 다른 기능이 정의되어있는
        // 문장부호들을 의미 그대로 사용할 수 있게
        // \와 조합하여 한개의 문자로 만들어둔 특수 문자들이다.
        // 개행문자, 탭공백, ', ", \ 등 다양한 특수 문자들이 존재한다.
        // 4-1. 개행문자
        // 개행문자는 해당문자를 출력하면 무조건
        // 다음줄 첫번째 칸으로 넘어간다.
        // \n으로 적는다.
        System.out.print(string1 + "\n");
        System.out.print(string1 + "\n" + string2 + "\n");
        
        // 4-2. 탭 공뱁
        // 탭 공백은 약 스페이스 4개 분량의
        // 커다란 공백을 뜻한다.
        // \t로 적는다.
        System.out.println(string1 + '\t' + string2);
        
        // 4-3. 따옴표
        // 만약 우리가 따옴표를 char 값의 시작 혹은 끝의 의미로 쓰는 것이 아니라
        // 문장기호로써의 따옴표를 사용하고 싶다면
        // \' 라고 적어주어야 한다.
        
        System.out.println('\'');
        
        // 4-4. 쌍따옴표
        // 만약 우리가 쌍따옴표를 String 값의 시작 혹은 끝의 의미로 쓰는 것이 아니라
        // 문장기호로써 쌍따옴표를 사용하고 싶다면
        // \"라고 적어주어야 한다.
        
        // "내 사전에 불가능은 없다!" - 나폴레옹
        System.out.println("\"내 사전에 불가능은 없다!\" - 나폴레옹");
        
        // 4-5. 역 슬러시
        // 역 슬러시의 경우, 우리가 문장기호로 사용되는 것이 아니라
        // 주로 파일 경로로써 사용이 된다.
        // 그렇다면 우리가 \를 String에 넣어서
        // 특정 파일 경로를 화면에 출력하고 싶다면 어떻게 해야할까?
        System.out.println("C:\\내문서\\내프로젝트");
    }

}
