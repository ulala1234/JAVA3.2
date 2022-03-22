package viewer;
// 뷰어
// 뷰어는 주로 화면에 출력을 담당하는 프로그램들이다.
// 우리가 현재는 자바 콘솔 프로그래밍을 하기 때문에 뷰어가 별개의 클래스로 나오게 되지만
// 나중에 여러분들이 웹 프로그래밍을 하게 되면 뷰어는 주로 웹페이지가 된다.

// 화면에 출력되는 메소드를 구현한 StudentViewer 클래스

import java.util.Scanner;
import java.util.ArrayList;

import controller.StudentController;

import model.StudentDTO;
import util.ScannerUtil;

public class StudentViewer {
    // 전역 상수
    private final int SCORE_MIN = 0;
    private final int SCORE_MAX = 100;
    private final int SUBJECT_SIZE = 3;
   
    // 우리가 지금은 데이터베이스가 없기 때문에 
    // StudentController 안에 데이터베이스 역할을 대신할
    // ArrayList 객체를 만들어 놓았다.
    // 하지만 해당 객체가 private 접근제한자가 적용되었으므로
    // 우리가 뷰어에서 직접 접근을 할 수 없다.
    // 실제 데이터베이스가 있을 경우에는 우리가 각 메소드에서
    // 컨트롤러를 새롭게 불러줘도 전혀 문제가 없지만,
    // 만약 지금 상황에서 각 메소드가 컨트롤러를 매번 새롭게 만들어준다면?
    // 해당 메소드가 끝날때마다, 컨트롤러 객체도 메모리에서 사라지기 때문에
    // 우리가 입력/수정/삭제한 것이 모두 사라지게 된다.
    // 따라서 StudentController 객체를 하나만 만들어서 쓸 수 있도록
    // 여기서 필드로 지정해준다.
    private StudentController controller;
    
    // 입력을 처리할 Scanner 클래스 필드
    private Scanner scanner;
       
    // 생성자를 사용하여 StudentController 필드를 초기화한다.
    public StudentViewer() {
        controller = new StudentController();
        scanner = new Scanner(System.in);
    }
    
    // 메뉴를 출력하는 showMenu()
    public void showMenu() {
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            if(userChoice == 1) {
                insert();
            } else if(userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // 학생의 정보를 입력하는 insert()
    private void insert() {
        StudentDTO s = new StudentDTO();
        
        String message;
        
        message = "학생의 이름을 입력해주세요.";
        s.setName(ScannerUtil.nextLine(scanner, message));
        
        message = "학생의 국어 점수를 입력해주세요.";
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 영어 점수를 입력해주세요.";
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 수학 점수를 입력해주세요.";
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        controller.insert(s);

        
    }
    // 
    private void printList() {
        ArrayList<StudentDTO> temp = controller.selectAll();
        
        if(temp.isEmpty()) {
            System.out.println("등록된 학생 정보가 존재하지 않습니다.");
        } else {
            for(StudentDTO s : temp) {
                System.out.printf("%d번. %s\n", s.getId(), s.getName());
            }
            
            String message = "상세보기할 학생의 번호나 뒤로 가시려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            while(userChoice != 0 && controller.selectOne(userChoice) == null) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }
            
            if(userChoice != 0) {
                printOne(userChoice);
            }
        }
        
    }
    
    private void printOne(int id) {
        StudentDTO s = controller.selectOne(id);
        
        System.out.printf("번호: %d 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d 영어: %03d점 수학: %03d점\n", s.getKorean(), s.getEnglish(), s.getMath());
        int sum = s.getKorean() + s.getEnglish() + s.getMath();
        double average = (double) sum / SUBJECT_SIZE;
        System.out.printf("총점: %03d 평균: %06.2f점\n", sum, average);
        
        String message = "1. 수정 2. 삭제 3. 목록으로 가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        
        if(userChoice == 1) {
            update(id);
        } else if(userChoice == 2) {
            delete(id);
        } else if (userChoice == 3) {
            printList();
        }
                
    }
    
    public void update(int id) {
        StudentDTO s = controller.selectOne(id);
        
        String message;
        
        message = "새로운 국어 점수를 입력해주세요.";
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "새로운 영어 점수를 입력해주세요.";
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "새로운 수학 점수를 입력해주세요.";
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "정말로 수정하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("Y")) {
            controller.update(s);
        }
        
        printOne(id);
        
        
    }
    
    public void delete(int id) {
        String message = "해당 학생의 정보를 정말 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("Y")) {
            controller.delete(id);
            printList();
        } else {
            printOne(id);
        }
    }
    
    
}
