package veiwer;

import java.util.Scanner;
import java.util.ArrayList;

import controller.EmployeeController;
import model.EmployeeDTO;

import util.ScannerUtil;

public class EmployeeViewer {
    // 사원 부서에 관한 상수
    private final int DEP_CODE1 = 1;
    private final int DEP_CODE2 = 2;
    private final int DEP_CODE3 = 3;
    
    // 사원 직급에 관한 상수
    private final int RANK_CODE1 = 1;
    private final int RANK_CODE2 = 2; 
    private final int RANK_CODE3 = 3;
    private final int RANK_CODE4 = 4;
    
    // 사원 부서 입력시 사용할 String 상수
    private final String DEP_INPUT_MSG = "1. 총무 2. 개발 3. 영업";
    
    // 사원 직급 입려깃 아용할 String 상수
    private final String RANK_INPUT_MSG = "1. 부장 2. 차장 3. 대리 4. 사원";
    
    // 데이터베이스 역할을 하는 ArrayList 객체를
    // 간접적으로 접근하기 위한 EmployeeController 필드
    private EmployeeController controller;
    
    // 데이터 입력을 처리하기 위한 Scanner 필드
    private Scanner scanner;
    
    // 생성자를 사용하여 각 필드를 초기화한다.
    public EmployeeViewer() {
        controller = new EmployeeController();
        scanner = new Scanner(System.in);
    }
    
    // 메뉴를 출력할 showMenu()
    public void showMenu() {
        while(true) {
            String message = "1. 사원 등록 2. 사원 목록 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice == 1) {
                insert();
            } else if(userChoice == 2) {
                printList();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // 사원 등록을 담당하는 insert()
    private void insert() {
        // 사원 정보를 담을 EmployeeDTO 객체
        EmployeeDTO e = new EmployeeDTO();
        
        // 정보 입력시 출력할 메시지를 담을
        String message;
        
        // 1. 사원 이름 입력
        message = "사원의 이름을 입력해주세요.";
        e.setName(ScannerUtil.nextLine(scanner, message));
        
        // 2. 사원 부서 입력
        message = "사원의 부서를 입력해주세요.(" + DEP_INPUT_MSG + ")";
        e.setDepartmentCode(ScannerUtil.nextInt(scanner, message, DEP_CODE1, DEP_CODE3));
        
        // 3. 사원 직급 입력
        message = "사원의 직급을 입력해주세요.(" + RANK_INPUT_MSG + ")";
        e.setRankCode(ScannerUtil.nextInt(scanner, message, RANK_CODE1, RANK_CODE4));
        
        // 4. 사원 연봉 입력
        message = "사원의 부서를 입력해주세요.";
        e.setSalary(ScannerUtil.nextInt(scanner, message));        
        
        // 컨트롤러로 e를 보내서 컨트롤러 필드 리스트에 추가한다.
        controller.insert(e);
        
    }
    
    private void printList() {
        ArrayList<EmployeeDTO> temp = controller.selectAll();
        
        if(temp.isEmpty()) {
            System.out.println();
        } else {
            for(EmployeeDTO e : temp) {
                System.out.printf("%d. %s\n", e.getId(), e.getName());
            }
            
            String message = "상세보기할 사원의 번호나 뒤로가시려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            while(userChoice != 0 && controller.selecetOne(userChoice) == null) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }
            
            if(userChoice != 0) {
                printOne(userChoice);
            }
        }
    }
    
    private void printOne(int id) {
        EmployeeDTO e = controller.selecetOne(id);
        
        System.out.printf("사원 번호: %d 사원 이름: %s\n", e.getId(), e.getName());
        System.out.printf("사원 부서: %s 사원 직급: %s\n", e.getDepartmentCode(), e.getRankCode());
        System.out.printf("사원 연봉: %s원\n", e.getSalary());
        
        String message = "1. 수정 2. 삭제 3. 목록";
        int userChoice = ScannerUtil.nextInt(scanner, message);
        
        if(userChoice == 1) {
            update(id);
        } else if(userChoice == 2) {
           // delete(id);
        } else if(userChoice == 3) {
            printList();
        }
    }
    
    private void update(int id) {
        EmployeeDTO temp = new EmployeeDTO();
        EmployeeDTO origin = controller.selecetOne(id);
        
        String message;
        
        message = "새로운 부서를 입력해주세요. (0. 수정 안함 " + DEP_INPUT_MSG + ")";
        temp.setDepartmentCode(ScannerUtil.nextInt(scanner, message, 0, DEP_CODE3));
        
        message = "새로운 직급을 입력해주세요. (0. 수정 안함 " + RANK_INPUT_MSG + ")";
        temp.setRankCode(ScannerUtil.nextInt(scanner, message, 0, RANK_CODE4));
        
        message = "새로운 연봉을 입력해주세요. (변경 없을 시에는 0)";
        temp.setSalary(ScannerUtil.nextInt(scanner, message));
        
        if(temp.getDepartmentCode() != 0) {
            origin.setDepartmentCode(temp.getDepartmentCode());
        }
        
        if(temp.getRankCode() != 0) {
            origin.setRankCode(temp.getRankCode());
        }
        
        if(temp.getSalary() != 0) {
            origin.setSalary(temp.getSalary());
        }
        
        controller.update(origin);
        
    }
    
    private String convertDepCode(int depCode) {
        if(depCode == DEP_CODE1) {
            return "총무";
        } else if(depCode == DEP_CODE2) {
            return "개발";
        } else if(depCode == DEP_CODE3) {
            return "영업";
        }
        
        return null;
    }
    
    private String convertRankCode(int rankCode) {
        if(rankCode == RANK_CODE1) {
            return "부장";
        } else if(rankCode == RANK_CODE2) {
            return "차장";
        } else if(rankCode == RANK_CODE3) {
            return "대리";
        } else if(rankCode == RANK_CODE4) {
            return "사원";
        }
        
        return null;
    }
    

}
