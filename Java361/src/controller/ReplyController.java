package controller;
import java.util.ArrayList;
import model.ReplyDTO;
import java.util.Calendar;

public class ReplyController {
    private ArrayList<ReplyDTO> list;
    private int nextId;
    
    public ReplyController() {
        list = new ArrayList<>();
        nextId = 1;
        
        for(int i = 1; i <= 4; i++) {
            ReplyDTO r = new ReplyDTO();
            r.setBoardId(2);
            r.setWriterId(3);
            r.setContent("내용 " + i);
            
            add(r);
        }
    }
    
    public void add(ReplyDTO r) {
        r.setId(nextId++);
        r.setWrittenDate(Calendar.getInstance());
        
        list.add(r);
    }
    
    public ArrayList<ReplyDTO> selectAll(int boardId) {
        ArrayList<ReplyDTO> temp = new ArrayList<>();
        
        for(ReplyDTO r : list) {
            if(r.getBoardId() == boardId) {
                temp.add(new ReplyDTO(r));
            }
        }
        
        return temp;
    }
    
    public void deleteByWriterId(int writerId) {
        for(int i = 0; i < list.size(); i++) {
            ReplyDTO r = list.get(i);
            if(r.getWriterId() == writerId) {
                list.remove(i);
                i = -1;
            }
        }
    }
    
}
