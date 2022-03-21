package model;
// 모델클래스
// 모델 클래스는 데이터타입을 담당하게 된다.
// 주로, 이름의 뒤에 DTO 혹은 VO 라고 붙는데,
// DTO는 Data Transfer Object의 줄임말이고
// VO는 Value Object의 줄임말이다.
// 둘 중 어느걸 사용해도 틀리지는 않지만
// 엄격하게 구분하자면, 사용자로부터 데이터를 입력 받아서 서버로 전달하거나 서버에서 값을 받아서 저장하여 사용자로
// 보내주는 쌍방향일 때에는 DTO를, 만약 서버에서 값을 받아서 사용자에게 전달하는 용도일 때에는
// VO 라고 적어준다.

// 모델 클래스에는
// 필드와 getter/setter 그리고 java.lang.Object 클래스에 대한 오버라이드 메소드만 구현된다.


public class StudentDTO {
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKorean() {
        return korean;
    }
    public void setKorean(int korean) {
        this.korean = korean;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    
    public boolean equals(Object o) {
        if(o instanceof StudentDTO) {
            StudentDTO s = (StudentDTO)o;
            return id == s.id;
        }
        return false;
    }
    
    public StudentDTO() {
        
    }
    
    public StudentDTO(StudentDTO s) {
        id = s.id;
        name = s.name;
        korean = s.korean;
        english = s.english;
        math = s.math;
    }
    
    
}
