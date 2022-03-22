package controller;

import java.util.ArrayList;

import model.UserDTO;
public class UserController {
    private final String OPTION_GO_BACK = "X";
    
    private ArrayList<UserDTO> list;
    private int nextId;
    
    public UserController() {
        list = new ArrayList<>();
        nextId = 1;
        
        for(int i = 1; i <= 4; i++) {
            UserDTO u = new UserDTO();
            u.setUsername("u"+i);
            u.setPassword("1");
            u.setNickname("사용자" + i);
            add(u);
        }
    }
    
    // add()
    public void add(UserDTO u) {
        u.setId(nextId++);
        
        list.add(u);
    }
    
    public ArrayList<UserDTO> selectAll() {
        ArrayList<UserDTO> temp = new ArrayList<>();
        
        for(UserDTO u : list) {
            temp.add(new UserDTO(u));
        }
        
        return temp;
    }
    
    public UserDTO selectOne(int id) {
        for(UserDTO u : list) {
            if(u.getId() == id) {
                return new UserDTO(u);
            }
        }
        
        return null;
    }
    
    public void update(UserDTO u) {
        int index = list.indexOf(u);
        list.set(index, u);
    }
    
    public void delete(int id) {
        UserDTO temp = new UserDTO();
        temp.setId(id);
        list.remove(temp);
                
    }
    
    public boolean validateUsername(String username) {
        if(username.equalsIgnoreCase(OPTION_GO_BACK)) {
            return true;
        }
        
        for(UserDTO u : list) {
            if(u.getUsername().equalsIgnoreCase(username))
                return true;
        }
        
        return false;
    }
    
    public UserDTO auth(String username, String password) {
        for(UserDTO u : list) {
            if(u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)) {
                return new UserDTO(u);
            }
        }
        
        return null;
    }
}
