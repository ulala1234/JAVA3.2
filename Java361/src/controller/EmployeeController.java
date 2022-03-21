package controller;

// import java.util.ArrayList;
// import model.EmployeeDTO;
import java.util.ArrayList;
import model.EmployeeDTO;

public class EmployeeController {
//    private ArrayList<EmployeeDTO> list;
//    private int nextId;
//    
//    public EmployeeController() {
//        
//    }
    
    // 데이터베이스를 대신할 ArrayList 필드
    private ArrayList<EmployeeDTO> list;
    // 다음 입력할 사원의 번호를 저장할 int 필드
    private int nextId;
    
    // 필드를 초기화할 생성자
    public EmployeeController() {
        list = new ArrayList<>();
        nextId = 1;
    }
    
    // 파라미터로 넘어온 EmployeeDTO 객체에
    // 사원번호 추가 후 list에 추가하는 insert()
    public void insert(EmployeeDTO e) {
        e.setId(nextId++);
        
        list.add(e);
    }
    
    public ArrayList<EmployeeDTO> selectAll() {
        ArrayList<EmployeeDTO> temp = new ArrayList<>();
        for(EmployeeDTO e : list) {
            temp.add(new EmployeeDTO(e));
        }
        
        return temp;
    }
    
    public EmployeeDTO selecetOne(int id) {
        for(EmployeeDTO e : list) {
            if(e.getId() == id) {
                return new EmployeeDTO(e);
            }
        }
        
        return null;
    }
    
    // 파라미터로 들어온 EmployeeDTO 객체를
    // 원본의 해당 객체와 교체하는
    // update()
    public void update(EmployeeDTO e) {
        list.set(list.indexOf(e), e);
    }
    
    // 파라미터로 들어온 사원 번호를 가진 EmployeeDTO 객체를
    // list에서 삭제하는
    // delete()
    public void delete(int id) {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(id);
        list.remove(e);
    }
    
}
