import java.util.Scanner;

class Sub5{
    Scanner sc = new Scanner(System.in);
    double num1=0, num2=0, result=0;
    String s="";
    
	void input(){
        System.out.print("첫 번째 수 : ");
        num1 = sc.nextDouble();
        System.out.print("두 번째 수 : ");
        num2 = sc.nextDouble();
        System.out.print("연산자 : ");
        s = sc.next();
	}
	void calc() {
        switch(s) {
        case "+":
        	result = num1 + num2; break;
        case "-": result = num1 - num2; break;
        case "*": result = num1 * num2; break;
        case "/": result = num1 / num2; break;
        default: s = "e";
        }
	}
	void output() {
        if(s.equals("e")) {
            System.out.println("연산자 입력이 잘못되었습니다. 연산자(+, -, *, /)");
         } else {
            System.out.printf("%s %s %s = %s", num1, s, num2, result);
         }  
	}
}


public class Practice5 {
   public static void main(String[] args) {
	   Sub5 s5 = new Sub5();
	   s5.input();
	   s5.calc();
	   s5.output();
   }
}