import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		

		for(int x=2; x<=9; x++) {	//2~9단
			for(int y=1; y<=9; y++) {		//1~9
				System.out.printf("%d*%d=%2d ",x,y,x*y);
			}
			System.out.println();  //1줄 넘김
		}
		System.out.println("------------------");
		System.out.println();
		
		
			for(int y=1; y<=9; y++) {		//1~9
				for(int x=2; x<=9; x++) {
				System.out.printf("%d*%d=%2d ",x,y,x*y);
			}
				System.out.println();
	     }
	}
}
