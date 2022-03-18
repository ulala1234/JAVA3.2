package day0317;
// 사원 관리 프로그램을 만들어보세요.
// 이 Main에는 당연히 메소드만 들어갑니다.
// Employee 라는 클래스를 day0317에 따로 만드셔서
// 필요한 메소드들을 직접 구현해보세요.
// 사원 정보에는
// 사원 번호, 사원 이름, 사원 부서, 사원 직급, 사원 연봉 의 정보가 필요합니다.

// 8시 20분까지

import java.util.Scanner;
import java.util.ArrayList;

import util.ScannerUtil;

import day0317.Employee;

public class Ex04EmpMain {
    // 전역 변수
    private static Scanner scanner;
    
    private static ArrayList<Employee> list;
    
    private static int nextId;
    
    // 전역 변수 초기화 메소드
    private static void init() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        nextId = 1;
        showMenu();
    }
    
    // 사원 정보 입력 메소드
    private static void insertEmployee() {
        Employee e = new Employee();
        e.setId(nextId);
        
        String message = "사원의 이름을 입력해주세요.";
        e.setName(ScannerUtil.nextLine(scanner, message));
        
        message = "사원의 부서를 입력해주세요. (1: 총무 2: 개발 3: 영업";
        e.setDepartment(ScannerUtil.nextInt(scanner, message, 1, 3));
        
        message = "사원의 직급을 입력해주세요. (1: 부장 2: 차장 3: 대리 4: 사원)";
        e.setRank(ScannerUtil.nextInt(scanner, message, 1, 4));
        
        message = "사원의 연봉을 입력해주세요";
        e.setSalary(ScannerUtil.nextInt(scanner, message));
        
        list.add(e);
    }
    
    // 사원 목록 출력 메소드
    private static void printAll() {
        if(list.isEmpty()) {
            System.out.println("아직 등록된 사원 정보가 존재하지 않습니다.");
        } else {
            for(Employee e : list) {
                System.out.printf("%d. %s\n", e.getId(), e.getName());
            }
            
            String message = "상세보기 할 사원의 번호나 뒤로가시려면 0을 입력해주세요.";
            
            int userChoice = ScannerUtil.nextInt(scanner, message);
            Employee e = new Employee(userChoice);
            
            while(userChoice != 0 && !list.contains(e)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
                e.setId(userChoice);
            }
            
            if(userChoice != 0) {
                printOne(userChoice);
            }
        }
    }
    
    // 사원 개별 출력 메소드
    private static void printOne(int id) {
        Employee e = selectOneById(id);
        
        e.printInfo();
        
        String message = "1. 수정 2. 삭제 3. 목록으로 가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        if(userChoice == 1) {
            update(id);
        } else if(userChoice == 2) {
            delete(id);
        } else if(userChoice == 3) {
            printAll();
        }
    }
    
    // 사원 번호와 일치하는 사원을 리스트에서 찾는 메소드
    private static Employee selectOneById(int id) {
        Employee e = new Employee(id);
        if(list.contains(e)) {
            return list.get(list.indexOf(e));
        }
        return null;
    }
    
    // 사원 수정 메소드
    private static void update(int id) {
        Employee e = new Employee();
        
        String message;
        
        
        message = "사원의 새로운 부서를 입력해주세요.\n(1: 총무 2: 개발 3: 영업 0: 기존 값 유지)";
        e.setDepartment(ScannerUtil.nextInt(scanner, message, 0, 3));
        
        message = "사원의 새로운 직급을 입력해주세요.(1: 부장 2: 차장 3: 대리 4: 사원 0: 기존 값 유지)";
        e.setRank(ScannerUtil.nextInt(scanner, message, 0, 4));
        
        message = "사원의 새로운 부서를 입력하시거나 원래 값을 남기시려면 0을 입력해주세요.";
        e.setSalary(ScannerUtil.nextInt(scanner, message));
        
        Employee origin = selectOneById(id);
        
        if(e.getDepartment() != null) {
            origin.setDepartment(e.getDepartment());
        }
        
        if(e.getRank() != null) {
            origin.setRank(e.getRank());
        }
        
        if(e.getSalary() != 0) {
            origin.setSalary(e.getSalary());
        }
        
        printOne(id);
    }
    
    // 사원 삭제 메소드
    private static void delete(int id) {
        Employee e = new Employee(id);
        
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("Y")) {
            list.remove(e);
            printAll();
        } else {
            printOne(id);
        }
    }
    
    // 메뉴 출력 메소드
    private static void showMenu() {
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                insertEmployee();
            } else if(userChoice == 2) {
                printAll();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // 메인 메소드
    public static void main(String[] args) {
        init();
    }

}
