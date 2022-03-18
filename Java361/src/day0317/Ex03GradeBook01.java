package day0317;
// 어레이리스트를 사용하여 학생 관리 프로그램을 작성하시오.
// 단, 개별 학생에 대한 수정, 삭제 기능도 포함되어야 합니다.

import java.util.Scanner;
import java.util.ArrayList;

import util.ScannerUtil;

import day0316.Student2;

public class Ex03GradeBook01 {
/*    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;
    
    public static Scanner scanner;
    public static Student s;
    
    public static void main(String[] args) {
        init();
        
    }
    
    public static void init() {
        scanner = new Scanner(System.in);
        s = new Student();
        ArrayList<Integer> list = new ArrayList<>();
        
        showMenu();
    }
    
    public static void showMenu() {
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                insert();
            } else if(userChoice == 2) {
                print();
            } else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
        
    }
    
    public static void insert() {
        String message;
        
        message = "학생의 번호를 입력해주세요.";
        s.id = ScannerUtil.nextInt(scanner, message);

        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(scanner, message);

        message = "학생의 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
    }
    
    public static void print() {
        if (s.korean == -1) {
            System.out.println("아직 입력되지 않은 상태입니다.");
        } else {
            s.printInfo();
        }
    }
*/
    
    // 전역 상수
    private static final int SCORE_MIN = 0;
    private static final int SCORE_MAX = 100;
    
    // 전역 변수
    private static Scanner scanner;
    private static ArrayList<Student2> list;
    private static int nextId;
    
    // 1. main 메소드
    public static void main(String[] args) {
        init();
    }
    
    // 2. 초기화 메소드
    private static void init() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        nextId = 1;
        
        showMenu();
    }
    
    // 3. 메뉴 메소드
    private static void showMenu() {
        while(true) {
            String message = "1. 학생 정보 입력 2. 학생 목록 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                insertStudent();
            } else if(userChoice == 2) {
                printAll();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
    }
    
    // 4. 정보 입력 메소드
    private static void insertStudent() {
        Student2 s = new Student2();
        String message;
        
        s.setId(nextId++);
        
        message = "학생의 이름을 입력해주세요";
        String name = ScannerUtil.nextLine(scanner, message);
        s.setName(name);
        
        message = "학생의 국어 점수를 입력해주세요";
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 영어 점수를 입력해주세요";
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 수학 점수를 입력해주세요";
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        list.add(s);
        
        
    }
    
    // 5. 학생 목록 출력
    private static void printAll() {
        if(list.isEmpty()) {
            System.out.println("아직 입력된 학생의 정보가 존재하지 않습니다.");
        } else {
            for(Student2 s : list) {
                System.out.printf("%d번. %s\n", s.getId(), s.getName());
            }
            
            String message = "상세보기 할 학생의 번호나 뒤로 가시려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            Student2 temp = new Student2();
            temp.setId(userChoice);
            
            while(userChoice != 0 && !list.contains(temp)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
                temp.setId(userChoice);
            }
            
            if(userChoice != 0) {
                printOne(userChoice);
            }
        }
    }
    
    // 6. 개별 학생 출력
    private static void printOne(int id) {
        Student2 s = selectOneById(id);
        
        s.printInfo();
        
        String message = "1. 수정 2. 삭제 3. 목록으로";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        
        if(userChoice == 1) {
            update(id);
        } else if(userChoice == 2) {
            delete(id);
        } else if(userChoice == 3) {
            printAll();
        }
        
    }
    
    private static Student2 selectOneById(int id) {
        Student2 s = new Student2();
        
        s.setId(id);
        
        if(list.contains(s)) {
            return list.get(list.indexOf(s));
        }
        
        return null;
    }
    
    private static void update(int id) {
        Student2 s = selectOneById(id);
        
        String message;
        
        message = "학생의 새로운 국어 점수를 입력해주세요.";
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 새로운 영어 점수를 입력해주세요.";
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        message = "학생의 새로운 수학 점수를 입력해주세요.";
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        
        printOne(id);
    }
    
    private static void delete(int id) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("Y")) {
            Student2 s = selectOneById(id);
            list.remove(s);
            printAll();
        } else {
            printOne(id);
        }
        

    }

}
