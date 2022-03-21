package homework;
// 정적 할당이 구현된 배열을 사용해서
// 5개의 게시글을 제어하는 프로그램을 작성하시오.
// 단, 캡슐화의 개념까지 적용시키시오.

// Board 클래스는 homework에 패키지에 만드시면 됩니다!
import java.util.Scanner;
import util.ScannerUtil;
public class Ex06Board {
    // 전역 상수
    // 1. 최대 입력 가능한 게시글의 개수
    private static final int MAX_SIZE = 5;
    
    // 전역 변수
    // 1. 입력을 처리할 Scanner 클래스 변수
    private static Scanner scanner;
    // 2. 게시글을 저장할 Board 클래스 배열
    private static Board[] array;
    // 3. 다음 입력할 인덱스를 저장할 int 변수
    private static int nextIndex;
    // 4. 글 번호를 저장할 int 변수
    private static int nextId;
    
    public static void main(String[] args) {
        init();
    }
    
    // 1. 각 변수를 초기화하고 메뉴 출력 메소드를 호출할
    //    init()
    private static void init() {
        scanner = new Scanner(System.in);
        array = new Board[MAX_SIZE];
        nextIndex = 0;
        nextId = 1;
        
        showMenu();
        
    }
    
    // 2. 메뉴를 출력하고 게시글 입력, 게시글 출력, 프로그램 종료에 따른
    //    메소드 및 코드 처리를 할 showMenu()
    private static void showMenu() {
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                writeBoard();
            } else if(userChoice == 2) {
                printAll();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // 3. 게시글 작성을 담당할 writeboard()
    private static void writeBoard() {
        // 현재 저장된 게시글이 5개 미만일때에만 게시글을 저장하고
        // 그 외는 경고 메시지만 출력한다.
        
        if(nextIndex < MAX_SIZE) {
            Board b = new Board();
            // 글 번호 자동 배정
            b.setId(nextId++);
            
            // 사용자 입력시 출력할 메시지를 저장할 String 객체
            String message;
            
            // 글 제목 입력
            message = "글의 제목을 입력해주세요.";
            b.setTitle(ScannerUtil.nextLine(scanner, message));
            
            // 글 작성자 입력
            message = "글의 작성자를 입력해주세요.";
            b.setWriter(ScannerUtil.nextLine(scanner, message));
            
            // 글 내용 입력
            message = "글의 내용을 입력해주세요.";
            b.setContent(ScannerUtil.nextLine(scanner, message));
            
            // b를 array에 저장
            array[nextIndex++] = b;
            
        } else {
            System.out.println("더이상 글을 작성할 수 없습니다.");
        }
        
        
    }
    
    // 4. 게시글 목록을 간단하게 보여주는 printAll()
    private static void printAll() {
        // 현재 저장된 글이 0개이면 경고 메시지만 출력하고
        // 그 외에는 글의 번호. 제목 의 형식으로 목록을 출력해준다.
        if(nextIndex == 0) {
            System.out.println("아직 작성된 글이 없습니다.");
        } else {
            for(int i = 0; i < nextIndex; i++) {
                System.out.printf("%d. %s\n", array[i].getId(), array[i].getTitle());
            }
            
            String message = "상세보기할 게시글의 변호나 뒤로 가시려면 0을 입력해주세요.";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            
            while(userChoice != 0 && selectIndexById(userChoice) == -1) {
                System.out.println("잘못 입력하셨습니다");
                userChoice = ScannerUtil.nextInt(scanner, message);
            }
            
            if(userChoice != 0) {
                printOne(userChoice);
            }
        }
    }
    
    // 5. 사용자가 입력한 게시글 번호가 존재하면 해당 글의 인덱스를,
    //    존재하지 않으면 -1을 리턴하는 selectIndexById()
    private static int selectIndexById(int id) {
        Board b = new Board();
        b.setId(id);
        
        for(int i = 0; i < nextId; i++) {
            if(b.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    
    // 6. 개별 게시글 출력을 담당할 printOne()
    private static void printOne(int id) {
        Board b = array[selectIndexById(id)];
        
        b.printBoard();
        
        String message = "1. 목록으로 돌아가기";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 1);
        if(userChoice == 1) {
            printAll();
        }
    }

}
