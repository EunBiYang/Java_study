
public class Exam5 {
   public static void main(String[] args) {
      Article5 article5 = new Article5();
      article5.setSeq(1);
      article5.setSubject("테스트 게시물");
      article5.setContent("Java Beans를 테스트 합니다.");
      article5.setWriter("자바학생");
      article5.setHit(123);
      article5.setRegDate("2022-05-10");
      
      System.out.println(article5.getSeq());
      System.out.println(article5.getSubject());
      System.out.println(article5.getContent());
      System.out.println(article5.getWriter());
      System.out.println(article5.getHit());
      System.out.println(article5.getRegDate());
   }
}