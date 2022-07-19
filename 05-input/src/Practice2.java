import java.util.Scanner;

public class Practice2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		double length;
		System.out.print("밑변은?");
		length = sc.nextDouble();
		
		double height;
		System.out.print("높이는?");
		height = sc.nextDouble();
		
		System.out.printf("넓이 :%.2f ",(length*height)/2);
		
	}

}