package model;

import day0317.Employee;

public class EmployeeDTO {
//    private int id;
//    private String name;
//    private String department;
//    private String rank;
//    private int salary;
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getDepartment() {
//        return department;
//    }
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//    public String getRank() {
//        return rank;
//    }
//    public void setRank(String rank) {
//        this.rank = rank;
//    }
//    public int getSalary() {
//        return salary;
//    }
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//    
//    public boolean equals(Object o) {
//        if(o instanceof EmployeeDTO) {
//            EmployeeDTO e = (EmployeeDTO)o;
//            return id == e.id;
//        }
//        
//        return false;
//    }

    // 필드

    // 사원 번호
    private int id;
    // 사원 이름
    private String name;
    // 사원 부서 코드
    private int departmentCode;
    // 사원 직급 코드
    private int rankCode;
    // 사원 연봉
    private int salary;

    // 메소드

    // 겟터/셋터

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

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getRankCode() {
        return rankCode;
    }

    public void setRankCode(int rankCode) {
        this.rankCode = rankCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean equals(Object o) {
        if (o instanceof EmployeeDTO) {
            EmployeeDTO e = (EmployeeDTO) o;
            return id == e.id;
        }

        return false;
    }
    
    // 파라미터가 없는 생성자
    public EmployeeDTO() {
        
    }
    
    // 깊은 복사를 위한 파라미터가 있는 생성자
    public EmployeeDTO(EmployeeDTO e) {
        id = e.id;
        name = e.name;
        departmentCode = e.departmentCode;
        rankCode = e.rankCode;
        salary = e.salary;
    }

}
