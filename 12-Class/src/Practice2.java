import java.util.Scanner;
class Gugudan{
	int start, end;
	void setGugudan(int s, int e){
		start = s;
		end = e;
	}
	void dispGgudan(){
		for (int i =start; i<=end ;i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d*%d=%2d ",i, j ,(i*j));
			}
		}System.out.println();
	}
}


public class Practice2 {
	public static void main(String[] args) {
		Gugudan gl = new Gugudan();
		Scanner sc = new Scanner(System.in);
		int s, e;
		
		System.out.print("시작단 : ");
		s = sc.nextInt();
		System.out.print("끝단 : ");
		e = sc.nextInt();
		
		gl.setGugudan(s,e);
		gl.dispGgudan();
		
	}

}
