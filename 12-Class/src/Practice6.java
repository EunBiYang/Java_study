import java.util.Scanner;

class Sub6{
    Scanner sc = new Scanner(System.in);
    int[] stu = new int[5];
    int sum = 0;
    double avg = 0;
    
    void input(){
    	for (int i = 0; i < 5; i++) {
    		System.out.print(i + 1 + "번 학생의 점수를 입력 : ");
            stu[i] = sc.nextInt();
            sum = sum + stu[i];
         }
    }
    
    void calc_avg(){
        avg = (double)sum / stu.length;
    }

    void out_put(){
        System.out.println();
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
public class Practice6 {
   public static void main(String[] args) {
      Sub6 s6 = new Sub6();
      
      s6.input();
      s6.calc_avg();
      s6.out_put();
      
   }
}