package model;

public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String nickname;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public boolean equals(Object o) {
        if(o instanceof UserDTO) {
            UserDTO u = (UserDTO) o;
            return id == u.id;
        }
        return false;
    }
    
    public UserDTO() {
        
    }
    
    public UserDTO(UserDTO u) {
        id = u.id;
        username = u.username;
        password = u.password;
        nickname = u.nickname;
    }
}
