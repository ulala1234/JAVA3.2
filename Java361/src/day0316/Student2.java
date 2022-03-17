package day0316;
// 캡슐화가 적용된 학생 클래스

public class Student2 {
    // 필드
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    
    // getter/setter
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setKorean(int korean) {
        this.korean = korean;
    }
    
    public int getKorean() {
        return korean;
    }
    
    public void setEnglish(int korean) {
        this.english = english;
    }
    
    public int getEnglish() {
        return english;
    }
    
    public void setMath(int korean) {
        this.math = math;
    }
    
    public int getMaht() {
        return math;
    }
}
