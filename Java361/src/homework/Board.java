package homework;

public class Board {
    // 필드
    // 1. 글 번호
    private int id;
    
    // 2. 글 제목
    private String title;
    
    // 3. 글 작성자
    private String writer;
    
    // 4. 글 내용
    private String content;
    
    // 메소드
    // 1. 필드에 대한 겟터/셋터
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getWriter() {
        return writer;
    }
    
    public void setWriter(String writer) {
        this.writer = writer;
    }
    
    // 2. equals()
    public boolean equals(Object o) {
        if(o instanceof Board) {
            Board b = (Board)o;
            return this.id == b.id;
        }
        return false;
    }
    
    // 3. printBoard()
    public void printBoard() {
        System.out.println("\n============================================");
        System.out.println(title);
        System.out.println("--------------------------------------------");
        System.out.println("작성자: "+writer);
        System.out.println("--------------------------------------------");
        System.out.println("내용");
        System.out.println("--------------------------------------------");
        System.out.println(content);
        System.out.println("\n============================================");
    }

}
