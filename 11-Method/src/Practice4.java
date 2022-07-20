import java.util.Scanner;

public class Practice4 {
	static double input_num(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str+"번째 수 : ");
        double num = sc.nextDouble();
        return num;
	}
	static String input_op() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 : ");
        String s = sc.next();
        return s;
	}
	static double calc(String s,double num1, double num2) {
		double result = 0;   
		switch(s) {		   
	         case "+": result = num1 + num2; break;
	         case "-": result = num1 - num2; break;
	         case "*": result = num1 * num2; break;
	         case "/": result = num1 / num2; break;
	         }
		   return result;
	}
	static void output(double num1, String s, double num2, double result) {
		System.out.printf("%s %s %s = %s", num1, s, num2, result);
	}
	
	
	   public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         double num1=0, num2=0, result=0;
	         String s="";
	         
	         // 입력
	        num1 = input_num("첫");
	        num2 = input_num("두");
	        s = input_op();

	         // switch
	        result = calc(s,num1,num2);
	         
	         // 출력
	         output(num1,s,num2,result);
	                       
	}

}
