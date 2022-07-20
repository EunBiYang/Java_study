package prac2;

public class Practice2 {
   public static void main(String[] args) {
      Score2 [] list=new Score2[2];   // 객체배열
      // 입력, 연산
      for(int i=0; i<list.length; i++) {
         list[i] = new Score2();
         list[i].input();
         System.out.println(); // 1줄넘김
      }
      // 출력
      list[0].printTitle();
      for(int i=0; i<list.length; i++) {
         list[i].out();
      }      
   }
}