package controller;
// 컨트롤러
// 컨트롤러의 경우, 데이터베이스와 화면 사이에서 사용자가 요청한 정보를 제공하거나 아니면
// 사용자가 입력한 정보를 데이터베이스에 입력하는 중간다리 역할을 맡는 클래스들이다.

// 하지만 문제가 있다...!
// 아직 우리한테 데이터베이스가 없다.

// 따라서 우리는 컨트롤러 안에 ArrayList 타입의 필드를 사용하여
// 일종의 데이터베이스 역할을 할 수 있도록 해줄 것이다.

import java.util.ArrayList;
import model.StudentDTO;
public class StudentController {
    // 유사 데이터베이스 역할을 할 ArrayList 객체
    private ArrayList<StudentDTO> list;
    // 다음 추가할 학생의 학생 번호를 저장한 int 변수
    private int nextId;
    
    public StudentController() {
        // 필드의 초기화
        list = new ArrayList<>();
        nextId = 1;
        
        // 필요에 따라서는 우리가 생성자 안에서
        // Student 객체를 여러개 만들어서 list에 추가해주는 방법으로
        // 샘플 데이터를 만들어 줄 수도 있다.
        for(int i = 1; i <= 4; i++) {
            StudentDTO s = new StudentDTO();
            s.setId(nextId++);
            s.setName("학생" + i);
            s.setKorean(i * 10);
            s.setEnglish(i * 10);
            s.setMath(i * 10);
            
            list.add(s);
        }
    }
    
    // 1. 뷰어가 보낸 StudentDTO 객체에
    //    학생 번호 추가 후 list에 저장하는
    //    insert()
    public void insert(StudentDTO s) {
        s.setId(nextId++);
        list.add(s);
    }
    
    // 2. 학생의 목록을 뷰어로 보내주는
    //    selectAll()
    public ArrayList<StudentDTO> selectAll() {
        // 얕은 복사와 깊은 복사
        // 참조형 변수의 값을 복사할 때에는 2가지 방법이 가능하다.
        // 1. 얕은 복사: 원본이 되는 참조형 값의 주소값을 복사
        // 얕은 복사의 경우, 코드가 간단하지만 대신 한개의 변수에서 값을 변경하면
        // 원본의 값도 변경된다라는 단점이 존재한다.
        // 2. 깊은 복사: 원본이 되는 참조형 값이 실제 값을 복사해서
        // 다른 변수의 직접 저장한다.
        // 이 경우에는 코드가 매우 복잡해지지만 대신 한쪽의 값을 변경한다고 해도
        // 다른쪽의 값은 유지가 된다.
        
        // 리턴에서 사용할 ArrayList객체 선언 및 초기화
        ArrayList<StudentDTO> temp = new ArrayList<>();
        
        // forEach를 사용하여 원본이 저장되어있는 ArrayList 객체 list에서
        // StudentDTO 객체를 깊은 복사하여 temp에 추가한다.
        for(StudentDTO s : list) {
            StudentDTO sTemp = new StudentDTO(s);
            
            temp.add(sTemp);
        }
        
        return temp;
        
    }
    
    // 3. 학생 번호를 파라미터로 받아서
    // 일치하는 StudentDTO를 리턴하는
    // selectOne().
    // 단, 해당 학생 번호를 가진 학생이 존재하지 않으면
    // null을 리턴한다.
    public StudentDTO selectOne(int id) {
        StudentDTO s = new StudentDTO();
        s.setId(id);
        
        if(list.contains(s)) {
            return new StudentDTO(list.get(list.indexOf(s)));
        }
        
        return null;
    }
    
    // 4. 파라미터로 들어온 StudentDTO 객체를 사용하여
    // 원본을 수정하는 update()
    public void update(StudentDTO s) {
        StudentDTO origin = list.get(list.indexOf(s));
        origin.setKorean(s.getKorean());
        origin.setEnglish(s.getEnglish());
        origin.setMath(s.getMath());
    }
    
    // 5. 파라미터로 들어온 int 값과 일치하는 StudentDTO 객체를
    // 삭제하는 delete()
    public void delete(int id) {
        StudentDTO s = new StudentDTO();
        s.setId(id);
        list.remove(s);
    }

}
