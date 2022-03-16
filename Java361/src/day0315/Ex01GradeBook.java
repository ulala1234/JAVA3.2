package day0315;
// 동적할당을 사용하는
// 학생 성적 입출력 프로그램을 작성하시오.
// 단, 메인 메소드의 코드를 최소화 시키시오.

//import java.util.Scanner;
//import util.ArrayUtil;
//import util.ScannerUtil;
import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;
public class Ex01GradeBook {
   // public static final int SUBJECT_SIZE = 3;
   // public static final int SCORE_MIN = 0;
   // public static final int SCORE_MAX = 100;
    
   // public static Scanner scanner;
   // public static int[][] id;
   // public static String[][] name;
   // public static int[][] korean;
   // public static int[][] english;
   // public static int[][] math;
   // public static int studentSize;
   // public static int currentIndex;
    
  //  public static void main(String[] args) {
     //   scanner = new Scanner(System.in);
        
     //   studentSize = ScannerUtil.nextInt(scanner, "몇 명의 학생을 입력하시겠습니까?");
     //   id = new int[studentSize][0];
     //   name = new String[studentSize][0];
     //   korean = new int[studentSize][0];
      //  english = new int[studentSize][0];
     //   math = new int[studentSize][0];
     //   currentIndex = 0;
        
      //  showMenu();
                
 //   }
    
  //  public static void showMenu() {
     //   while(true) {
        //    String message = "1. 입력 2. 출력 3. 종료";
        //    int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
         //   if(userChoice == 1) {
        //        insertInfo()
         //   } else if(userChoice == 2) {
                
          //  } else if(userChoice == 3) {
        //        System.out.println("사용해주셔서 감사합니다.");
        //        break;
        //    }
    //    }
//    }
    
   // public static void insertInfo() {
        
     //   for(int i = 0; i < studentSize; i++) {
      //      System.out.println("===============================");
      //      System.out.printf("%d번 학생 입력하기\n", currentIndex + 1);
      //      System.out.println("===============================");
            
        //    String message = "학생의 번호를 입력해주세요.";
        //    id[currentIndex] = ScannerUtil.nextInt(scanner, message);

            // 이름 입력
        //    message = "학생의 이름을 입력해주세요.";
         //   nameArray[currentIndex] = ScannerUtil.nextLine(scanner, message);

            // 국어 점수 입력
         //   message = "학생의 국어 점수를 입력해주세요.";
         //   koreanArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 영어 점수 입력
         //   message = "학생의 영어 점수를 입력해주세요.";
         //   englishArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 수학 점수 입력
         //   message = "학생의 수학 점수를 입력해주세요.";
        //    mathArray[currentIndex] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

            // 다음 입력할 인덱스를 1 증가
        //    currentIndex++;

     //   } else {
            // 이미 다섯명을 입력했을 경우
     //       System.out.println("이미 5명 모두 정보가 입력되어 있습니다.");
     //   }
    //    }
        
    // 전역 변수
    // 1. 입력에 사용할 Scanner 클래스 변수
    public static Scanner scanner;
    // 2. 학생 번호를 저장할 int[] idArray
    public static int [] idArray;
    // 3. 학생 이름을 저장할 String[] nameArray
    public static String[] nameArray;
    // 4. 학생 국어 점수를 저장할 int[] koreaArray
    public static int[] koreanArray;
    // 5. 학생 영어 점수를 저장할 int[] englishArray
    public static int[] englishArray;
    // 6. 학생 수학 점수를 저장할 int[] mathArray
    public static int[] mathArray;
    // 7. 다음 입력할 학생의 번호를 저장한 int nextId;
    public static int nextId;
    
    
    // 전역 상수
    // 1. 가능한 최소 점수
    public static final int SCORE_MIN = 0;
    // 2. 가능한 최대 점수
    public static final int SCORE_MAX = 100;
    // 3. 총 과목의 숫자
    public static final int SUBJECT_SIZE = 3;
    
    // 1. 각 전역 변수를 초기화해주는 init()
    public static void init() {
        scanner = new Scanner(System.in);
        idArray = new int[0];
        nameArray = new String[0];
        koreanArray = new int[0];
        englishArray = new int[0];
        mathArray = new int[0];
        nextId = 1;
    }
    
    // 2. init() 메소드를 호출하고 메뉴를 출력해라
    //    showMenu()
    public static void showMenu() {
        init();
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                // 입력 메소드 호출
                insert();
                
            } else if(userChoice == 2) {
                // 출력 메소드 호출
                printAll();
                
            } else if(userChoice == 3) {
                // 메시지 출력 후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
}
    
    // 3. 새로운 학생의 정보를 입력하는 insert()
    public static void insert() {
        
        // 1. 이름 입력
        String message = "학생의 이름을 입력해주세요.";
        String name = ScannerUtil.nextLine(scanner, message);
        
        // 2. 국어 점수 입력
        message = "학생의 국어 점수를 입력해주세요.";
        int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        // 3. 영어 점수 입력
        message = "학생의 영어 점수를 입력해주세요.";
        int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);

        // 4. 수학 점수 입력
        message = "학생의 수학 점수를 입력해주세요.";
        int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        // 5. 입력된 정보를 각 배열에 추가
        idArray = ArrayUtil.add(idArray, nextId++);
        nameArray = ArrayUtil.add1(nameArray, name);
        koreanArray = ArrayUtil.add(koreanArray, korean);
        englishArray = ArrayUtil.add(englishArray, english);
        mathArray = ArrayUtil.add(mathArray, math);
        
    }
    
    // 4. 학생의 목록을 출력하는 printAll()
    public static void printAll() {
        // 만약 배열 중 한개가 비어있으면 경고 메시지만 출력하고
        // 그 외는 for문을 사용하여 printOne()을 호출한다.
        
        if(ArrayUtil.isEmpty(idArray)) {
            // 아직 입력된 학생이 존재하지 않으므로 메시지만 출력
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");            
        } else {
            for(int i = 0; i < ArrayUtil.size(idArray); i++) {
                System.out.println("\n----------------------------------");
                System.out.printf("%d번쨰 학생 정보:\n", i+1);   
                System.out.println("===================================");
                printOne(i);
                System.out.println("----------------------------------\n");
            }
        }
        
    }

    // 5. 개별 학생을 출력하는 printOne()
    public static void printOne(int index) {
        // 각 배열의 index번째 값을 변수에 저장한다.
        int id = ArrayUtil.get(idArray, index);
        String name = ArrayUtil.get1(nameArray, index);
        int korean = ArrayUtil.get(koreanArray, index);
        int english = ArrayUtil.get(englishArray, index);
        int math = ArrayUtil.get(mathArray, index);
        
        // 번호 이름 출력
        System.out.printf("번호: %d번 이름: %s\n", id, name);
        
        // 국영수 점수 출력
        System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", korean, english, math);
        
        // 총점 평균 출력
        int sum = korean + english + math;
        double average = (double)sum / SUBJECT_SIZE;
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
    }
    
    // 6. 메인 메소드
    public static void main(String[] args) {
        showMenu();
    }

}
