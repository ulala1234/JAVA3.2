package day0315;
// Student 구조체를 사용한
// 학생 관리 프로그램을 만들어보세요
// 45분까지

import java.util.Scanner;
import struct.Student;
import util.ScannerUtil;
import util.ArrayUtil;

public class Ex03GradeBook03 {
    
    // 전역 상수
    // 1. 가능한 최소 점수
    public static final int SCORE_MIN = 0;
    // 2. 가능한 최대 점수
    public static final int SCORE_MAX = 100;
    // 3. 과목의 숫자
    public static final int SUBJECT_SIZE = 3;
    
    // 전역 변수
    // 1. 입력을 처리할 Scanner 클래스 변수
    public static Scanner scanner;
    // 2. 정보를 저장할 Student 배열
    public static Student[] array;
    // 3. 다음 입력할 학생의 id를 저장할 int 변수
    public static int nextId;
    
 //   public static Scanner scanner;
 //   public static Student[] studentArray;
  //  public static int nextId;
    
  //  public static void init() {
   //     scanner = new Scanner(System.in);
   //     studentArray = new Student[0];
   //     nextId = 1;

  //  }
    
  //  public static void showMenu() {
    //    init();
     //   while(true) {
        //    String message = "1. 입력 2. 출력 3. 종료";
       //     int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
       //     if(userChoice == 1) {
                // 입력 메소드 호출
        //        insert();
                
       //     } else if(userChoice == 2) {
                // 출력 메소드 호출
         //       printAll();
                
       //     } else if(userChoice == 3) {
                // 메시지 출력 후 종료
        //        System.out.println("사용해주셔서 감사합니다.");
         //       break;
         //   }
     //   }
   

//}
    
  //  public static void insert() {
        
        // 1. 이름 입력
    //    String message = "학생의 이름을 입력해주세요.";
    //    String name = ScannerUtil.nextLine(scanner, message);
        
        // 2. 국어 점수 입력
    //    message = "학생의 국어 점수를 입력해주세요.";
    //    int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        // 3. 영어 점수 입력
   //     message = "학생의 영어 점수를 입력해주세요.";
   //     int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        // 4. 수학 점수 입력
    //    message = "학생의 수학 점수를 입력해주세요.";
    //    int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        // 5. 입력된 정보를 각 배열에 추가
   //     studentArray = ArrayUtil.add(studentArray, nextId++);
   //     studentArray = ArrayUtil.add(studentArray, name);
    //    studentArray = ArrayUtil.add(studentArray, korean);
    //    studentArray = ArrayUtil.add(studentArray, english);
     //   studentArray = ArrayUtil.add(studentArray, math);
        
  //  }
    
    
    // 메서드
    // 1. 전역 변수를 초기화 하는 init()
    public static void init() {
        scanner = new Scanner(System.in);
        array = new Student[0];
        nextId = 1;
    }
    
    // 2. 메뉴를 출력하는 showMenu()
    public static void showMenu() {
        init();
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                insert();
            } else if(userChoice == 2) {
                printAll();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // 3. 학생 정보를 입력하는 insert()
    public static void insert() {
        // 사용자가 입력한 값을 Student 변수로 저장하기 위해
        // Student 변수를 하나 만들어준다.
        Student s = new Student();
        
        s.id = nextId++;
        
        String message = "학생의 이름을 입력해주세요";
        s.name = ScannerUtil.nextLine(scanner, message);
        
        message = "학생의 국어 점수를 입력해주세요";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        message = "학생의 영어 점수를 입력해주세요";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        message = "학생의 수학 점수를 입력해주세요";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        array = ArrayUtil.add(array, s);
    }
    
    // 4. 학생 목록을 출력하는 printAll()
    public static void printAll() {
        if(ArrayUtil.isEmpty(array)) {
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");
        } else {
            for(int i = 0; i < ArrayUtil.size(array); i++) {
                Student s = ArrayUtil.get(array, i);
                System.out.printf("%d. %s\n", i + 1, s.name);   
                             
            }
            
            // 사용자한테서 상세보기할 학생의 인덱스를 입력 받는다.
            String message = "상세보기할 학생의 번호나 메뉴로 가실려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, ArrayUtil.size(array)) - 1;
            
            if(userChoice != -1) {
                printOne(userChoice);
            }
        }
    }
    
    // 5. 개별 학생 출력을 담당하는 printOne()
    public static void printOne(int index) {
        Student s = ArrayUtil.get(array, index);
        
        System.out.printf("번호: %d번 이름: %s\n", s.id, s.name);    
        System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", s.korean, s.english, s.math);  
        int sum = s.korean + s.english + s.math;
        double average = (double)sum / SUBJECT_SIZE;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        
        System.out.println("----------------------------------");
        String message = "1. 수정 2. 삭제 3. 학생 목록으로";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        
        if(userChoice == 1) {
            // 개별 학생 수정 메소드 호출
            update(index);
        } else if(userChoice == 2) {
            // 개별 학생 삭제 메소드 호출
            delete(index);
        } else if(userChoice == 3) {
            printAll();
        }
        
    
    }
    
    // 6. 개별 학생의 정보를 수정하는 update()
    public static void update(int index) {
        // 업데이트 할 학생의 정보를 불러와서 Student 변수에 저장한다.
        Student s = ArrayUtil.get(array, index);
        
        String message = "새로운 국어 점수를 입력해주세요.";
        s.korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        message = "새로운 영어 점수를 입력해주세요.";
        s.english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        message = "새로운 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        printOne(index);
    }
    
    // 7. 개별 학생의 정보를 삭제하는 delete()
    public static void delete(int index) {
        String message = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        // 만약 String 값을 대소문자 상관없이 비교할 때에는
        // equalsIgnoreCase() 를 사용하면 된다.
        
        if(yesNo.equalsIgnoreCase("Y")) {
            array = ArrayUtil.remove(array, index);
            printAll();
        } else {
            printOne(index);
        }
    }
    
    // 8. main()
    public static void main(String[] args) {
        showMenu();
    }
}
