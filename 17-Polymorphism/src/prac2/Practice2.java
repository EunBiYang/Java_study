package prac2;

public class Practice2 {
	public static void main(String[] args) {
		
		Circle circle;
		
		circle = new CircleArea(10);
		circle.compute();
		circle.output();
		
		circle = new CircleRound(10);
		circle.compute();
		circle.output();
		
	}

}
