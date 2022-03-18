package day0317;

import day0316.Student2;

public class Employee {
    // 필드
    // 사원 번호
    private int id;
    // 사원 이름
    private String name;
    // 사원 부서
    private String department;
    // 사원 직급
    private String rank;
    // 사원 연봉
    private int salary;
    
    // 메소드
    // 겟터/셋터
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
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setDepartment(int departmentCode) {
        if(departmentCode == 1) {
            department = "총무";
        } else if(departmentCode == 2) {
            department = "개발";
        } else if(departmentCode == 3) {
            department = "영업";
        }
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setRank(int rankCode) {
        if(rankCode == 1) {
            rank = "부장";
        } else if(rankCode == 2) {
            rank = "차장";
        } else if(rankCode == 3) {
            rank = "대리";
        } else if(rankCode == 4) {
            rank = "사원";
        }
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
    
    // equals() 오버라이드
    public boolean equals(Object o) {
        if(o instanceof Employee) {
            Employee e = (Employee)o;
            return id == e.id;
        }
        
        return false;
    }
    
    // 사원 정보 출력
    public void printInfo() {
        System.out.println("\n==========================================");
        System.out.printf("사원 번호: %d번 이름: %s\n", id, name);
        System.out.printf("부서: %s 직급: %s\n", department, rank);
        System.out.printf("연봉: %d원\n", salary);
        System.out.println("==========================================\n");
    }
    
    // 파라미터 없는 생성자
    public Employee() {
        
        
    }
    
    // int id를 파라미터로 받는 생성자
    public Employee(int id) {
        this.id = id;
    }

    
}
