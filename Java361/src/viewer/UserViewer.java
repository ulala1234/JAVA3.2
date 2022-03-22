package viewer;

import java.util.Scanner;
import java.util.ArrayList;

import controller.UserController;

import model.UserDTO;
import util.ScannerUtil;

public class UserViewer {
    private final String OPTION_GO_BACK = "X";
    
    private Scanner scanner;
    private UserController userController;
    private UserDTO logIn;
    private BoardViewer boardViewer;
    
    
    public UserViewer() {
        scanner = new Scanner(System.in);
        userController = new UserController();
        boardViewer = new BoardViewer();
        boardViewer.setUserViewer(this);
    }
    
    // showIndex()
    public void showIndex() {
        String message = "1. 로그인 2. 회원가입 3. 종료";
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                logIn();
                
                if(logIn != null) {
                    showMenu();
                }
            } else if(userChoice == 2) {
                register();
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    // register()
    private void register() {
        String message;
        
        message = "사용하실 아이디나 뒤로 가시려면 X를 입력해주세요";
        String username = ScannerUtil.nextLine(scanner, message);
        
        while(userController.validateUsername(username)) {
            System.out.println("사용하실 수 없는 아이디입니다.");
            username = ScannerUtil.nextLine(scanner, message);
            
            if(username.equalsIgnoreCase(OPTION_GO_BACK)) {
                break;
            }
        }
        
        if(!username.equalsIgnoreCase(OPTION_GO_BACK)) {
            message = "사용하실 비밀번호를 입력해주세요.";
            String password = ScannerUtil.nextLine(scanner, message);

            message = "사용하실 닉내임을 입력해주세요.";
            String nickname = ScannerUtil.nextLine(scanner, message);
            
            UserDTO u = new UserDTO();
            u.setUsername(username);
            u.setPassword(password);
            u.setNickname(nickname);
            
            userController.add(u);
            
            
        }
        
    }
    
    private void logIn() {
        String message;
        
        message = "아이디를 입력해주세요.";
        String username = ScannerUtil.nextLine(scanner, message);
        
        message = "비밀번호를 입력해주세요.";
        String password = ScannerUtil.nextLine(scanner, message);
        
        while(userController.auth(username, password) == null) {
            System.out.println("잘못 입력하셨습니다.");
            
            message = "아이디를 입력하시거나 뒤로 가시려면 X를 입력해주세요.";
            username = ScannerUtil.nextLine(scanner, message);
            
            if(username.equalsIgnoreCase(OPTION_GO_BACK)) {
                break;
            }
            
            message = "비밀번호를 입력해주세요.";
            password = ScannerUtil.nextLine(scanner, message);            
        }
        
        logIn = userController.auth(username, password);
    }
    
    private void showMenu() {
        String message = "1. 게시판 보기 1. 회원정보 보기 2. 로그아웃";
        while(logIn != null) {
            
            boardViewer.setLogIn(logIn);
            
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if(userChoice == 1) {
               boardViewer.showMenu(); 
            } else if(userChoice == 2) {
                printOne(logIn.getId());
            } else if(userChoice == 3) {
                System.out.println("로그아웃 되셨습니다.");
                logIn = null;
                boardViewer.setLogIn(null);
            }
            
        }
    }

    
    private void printOne(int id) {
        UserDTO temp = userController.selectOne(id);
        System.out.println(temp.getNickname() + "회원님의 정보");
        System.out.println("아이디: " + temp.getUsername());
        System.out.println("닉네임: " + temp.getNickname());
        
        String messgae = "1. 수정 2. 회원 탈퇴 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, messgae);
        
        if(userChoice == 1) {
            update(id);
        } else if(userChoice == 2) {
            delete(id);
        }
    }
    
    private void update(int id) {
        String message;
        UserDTO u = userController.selectOne(id);
        
        message = "수정할 닉네임을 입력해주세요.";
        u.setNickname(ScannerUtil.nextLine(scanner, message));
        
        message = "수정할 닉네임을 입력해주세요.";
        u.setPassword(ScannerUtil.nextLine(scanner, message));

        message = "수정할 닉네임을 입력해주세요.";
        String oldPassword = ScannerUtil.nextLine(scanner, message);
        
        if(logIn.getPassword().equals(oldPassword)) {
            userController.update(u);
        }
        
        printOne(id);

        
    }
    
    private void delete(int id) {
        String message = "정말로 탈퇴하시겠습니까?";
        String yesNo = ScannerUtil.nextLine(scanner, message);
        
        if(yesNo.equalsIgnoreCase("Y")) {
            userController.delete(id);
            logIn = null;
        } else {
            printOne(id);
        }
    }
    
    public void printNickname(int id) {
        UserDTO u = userController.selectOne(id);
        System.out.println(u.getNickname());
    }
}
