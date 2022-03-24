package controller;
import java.util.ArrayList;
import java.util.Calendar;

import model.BoardDTO;

public class BoardController {
    
    private ArrayList<BoardDTO> list;
    private int nextId;
    
    public BoardController() {
        list = new ArrayList<>();
        nextId = 1;
        
        for(int i = 1; i <= 4; i++) {
            BoardDTO b = new BoardDTO();
            b.setTitle("제목: " + i);
            b.setWriterId(i);
            b.setContent("내용: " + i);
            add(b);
        }
    }
    
    public void add(BoardDTO b) {
        b.setId(nextId++);
        b.setWrittenDate(Calendar.getInstance());
        b.setUpdatedDate(Calendar.getInstance());
        
        list.add(b);
    }
    
    public ArrayList<BoardDTO> selectAll() {
        ArrayList<BoardDTO> temp = new ArrayList<>();
        for(BoardDTO b : list) {
            temp.add(new BoardDTO(b));
        }
        
        return temp;
                
    }
    
    public BoardDTO selectOne(int id) {
        for(BoardDTO b : list) {
            if(b.getId() == id) {
                return new BoardDTO(b);
            }
        }
        
        return null;
    }
    
    public void update(BoardDTO b) {
        b.setUpdatedDate(Calendar.getInstance());
        
        int index = list.indexOf(b);
        
        list.set(index, b);
                
    }
    
    public void delete(int id) {
        BoardDTO b = new BoardDTO();
        b.setId(id);
        
        list.remove(b);
    }
    
    public void deleteByWriterId(int writerId) {
        for(int i = 0; i < list.size(); i++) {
            BoardDTO b = list.get(i);
            if(b.getWriterId() == writerId) {
                list.remove(i);
                i = -1;
            }
        }
    }

}
