package viewer;
import controller.ReplyController;
import model.ReplyDTO;
import util.ScannerUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class ReplyViewer {
    
    private ReplyController replyController;
    private Scanner scanner;
    private UserViewer userViewer;
    
    public ReplyViewer() {
        replyController = new ReplyController();
        scanner = new Scanner(System.in);
    }
    
    public void setUserViewer(UserViewer userViewer) {
        this.userViewer = userViewer;
    }
    
    public void printList(int boardId) {
        ArrayList<ReplyDTO> list = replyController.selectAll(boardId);
        
        if(list.isEmpty()) {
            System.out.println("\n아직 등록된 댓글이 존재하지 않습니다.\n");
        } else {
            for(ReplyDTO r : list) {
                printOne(r);
            }
        }
    }
    
    private void printOne(ReplyDTO r) {
        SimpleDateFormat sdf = new SimpleDateFormat("yy/m/d H:m:s");
        System.out.printf("%s - by ", r.getContent());
        userViewer.printNickname(r.getWriterId());
        System.out.printf(" at %s\n", sdf.format(r.getWrittenDate().getTime()));
        
    }
    
    public void writeReply(int writerId, int boardId) {
        ReplyDTO r = new ReplyDTO();
        r.setWriterId(writerId);
        r.setId(boardId);
        
        String message = "댓글의 내용을 입력해주세요.";
        r.setContent(ScannerUtil.nextLine(scanner, message));
        
        replyController.add(r);
        
        
    }
    
    public void deleteByWriterId(int writerId) {
        replyController.deleteByWriterId(writerId);
    }

}
