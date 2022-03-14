package day0311;
// 다차원 배열(Multi Dimensional Array)

// 배열이란?
// 같은 데이터타입을 가지고 있는 것들을 묶어놓은 데이터타입

// 다차원 배열이란?
// 똑같은 데이터타입의 배열을 여러개 묶어놓은 배열

// 다차원 배열의 선언 방법과 초기화 방법
// 2차원 배열을 기준으로 설명하면
// 데이터타입[][] 배열이름 = new 데이터타입[모여있는 배열의 총 개수][각 배열의 길이]
// 가 된다.
public class Ex03MDArray {
    public static void main(String[] args) {
        // 1차원 배열이 4개 모여있고, 각 배열의 길이가 3인
        // int 2차원 배열 array를 선언하고 초기화
        int[][] array = new int[4][3];
        
        // array의 각 인덱스번 칸에 어떤 값이 들어가 있는지 출력해보자
        for(int i = 0; i < array.length; i++) {
            System.out.println(i+"번 인덱스: "+array[i]);
        }
        
        // array의 0번째 배열의 0번 인덱스에 저장된 값을 출력해보자
        System.out.println("array[0][0]: "+array[0][0]);
        
        // 다차원 배열의 경우, 필요에 따라서는
        // 각 배열의 길이를 따로따로 지정해 줄 수도 있다.
        // 이렇게 하위 배열들의 길이가 다른 배열을
        // 우리는 "가변형" 배열이라고 한다.
        // 단, 가변형 배열을 쓸 때 주의할 점은
        // 우리가 다음과 같이 초기화 하고,
        // 실제 값을 저장할 때 먼저 해당 인덱스번의 배열을 따로 초기화해야한다.
        
        // array를 int 1차원 배열이 4개 모여있는 2차원 배열로 초기화해라
        array = new int[4][];
        
        // array의 각 배열의 내용을 한번 출력해보자.
        for(int i = 0; i < array.length; i++) {
            System.out.println("array[i]: " + array[i]);
        }
        
        // 위의 출력결과를 보면 알 수 있듯이,
        // 아직 우리가 실제 값을 넣을 수 없는 null 상태이다.
        // 우리가 실제 값을 넣기 위해서는 각 배열을 초기화해주어야 한다.
        
        // array의 0번째 배열을 길이가 3인 int 1차원 배열로 초기화해라
        array[0] = new int[3];
        // array의 0번째 배열을 길이가 5인 int 1차원 배열로 초기화해라
        array[1] = new int[5];
        // array의 0번째 배열을 길이가 4인 int 1차원 배열로 초기화해라
        array[2] = new int[4];
        // array의 0번째 배열을 길이가 6인 int 1차원 배열로 초기화해라
        array[3] = new int[6];
        
        // 이번에는 array의 각 배열의 길이를 화면에 출력해보자
        for(int i = 0; i < array.length; i++) {
            System.out.printf("array[%d].length: %d\n", i, array[i].length);
        }

    }

}
