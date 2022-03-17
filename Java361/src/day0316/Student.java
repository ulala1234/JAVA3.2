package day0316;

// Student 클래스
// 필드: 번호, 이름, 국어, 영어, 수학
// 메소드: 총점계산(), 평균계산(), 정보 출력(),
//       생성자(), 생성자(int, String, int, int, int), equals()
public class Student {
    // 필드
    // 번호
    public int id;
    // 이름
    public String name;
    // 국어
    public int korean;
    // 영어
    public int english;
    // 수학
    public int math;
    // 총 과목의 숫자
    public final int SUBJECT_SIZE = 3;

    // 메소드
    // 총점 계산
    public int calculateSum() {
        return korean + english + math;
    }

    // 평균 계산
    public double calculateAverage() {
        return (double) calculateSum() / SUBJECT_SIZE;
    }

    // 개별 정보 출력 메소드
    public void printInfo() {
        System.out.printf("번호: %d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", calculateSum(), calculateAverage());
    }

    // 생성자
    public Student(int id, String name, int korean, int english, int math) {
        // 메소드 내부에 필드와 같은 이름의 변수가 있을 경우,
        // 우리가 그 이름을 적으면 변수가 우선시 된다.
        // 그러한 경우, 이 메소드를 실행시키는 객체의 필드를 특별하게 지정해야하는데
        // 이때에는 우리가 this 라는 키워드를 사용한다.
        // this는 이 메소드를 실행시키는 객체를 지칭하는 키워드이다.

        this.id = -id;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public Student() {
        id = -1;
        name = "아직 입력 안됨";
        korean = -1;
        english = -1;
        math = -1;
    }

    public boolean equals(Object obj) {
        // 1. obj가 이 Student 클래스의 객체인지 확인한다.
        // 만약 어떤 객체가 특정 클래스의 객체인지 확인할 때에는
        // instanceof라는 키워드를 사용하게 된다.
        // 만약 해당 클래스의 객체이면 true가 리턴되고 아니면 false가 리턴된다.
        if (obj instanceof Student) {
            // obj가 Student 클래스의 객체가 맞으므로
            // 우리가 명시적 형변환을 통해서
            // Student 클래스의 임시 객체로 모양을 바꿔줄 수 있다.
            Student s = (Student) obj;
            // obj가 형변환된 s의 특정 필드와 이 메소드를 실행시키는 객체의 특정 필드를 비교하여
            // 같으면 true를 리턴하게 코드를 작성한다.
            return this.id == s.id;
        }

        return false;
    }

}
