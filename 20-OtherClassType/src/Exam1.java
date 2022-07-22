
public class Exam1 {
	public static void main(String[] args) {
		//방법1
		Calc calc = Calc.getInstance();
		calc.plus(5, 7);
		
		//방법2  
		Calc.getInstance().minus(5, 7);
	}

}
