//JavaBeans 
//순수하게 변수들을 묶어서 사용하는 용도의 클래스
//자바 빈즈 규약대로 만들어야한다.
public class Article5 {
	
//1.맴버변수는 private으로 설정한다.
   private int seq;      // 글번호
   private String subject;   // 제목
   private String content;   // 내용
   private String writer;   // 글쓴이
   private int hit;      // 조회수
   private String regDate; // 작성일

//2.default 생성자가 무조건 있어야한다.
   public Article5() {      
   }
//3.모든 맴버함수는 public으로 설정한다.
   public Article5(int seq, String subject, String content, String writer, int hit, String regDate) {
      this.seq = seq;
      this.subject = subject;
      this.content = content;
      this.writer = writer;
      this.hit = hit;
      this.regDate = regDate;
   }
//4.setter와 getter가 반드시 존재해야한다.  
   public void setSeq(int seq) {
      this.seq = seq;
   }
   public int getSeq() {
      return seq;
   }
   public void setSubject(String subject) {
      this.subject = subject;
   }
   public String getSubject() {
      return subject;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public String getContent() {
      return content;
   }
   public void setWriter(String writer) {
      this.writer = writer;
   }
   public String getWriter() {
      return writer;
   }
   public void setHit(int hit) {
      this.hit = hit;
   }
   public int getHit() {
      return hit;
   }
   public void setRegDate(String regDate) {
      this.regDate = regDate;
   }
   public String getRegDate() {
      return regDate;
   }
}
