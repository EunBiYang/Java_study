package parc1;

public class Practice2 {
	public static void main(String[] args) {
		//자식클래스
		Circle circle = new CircleArea(10);
		Circle circle2 = new CircleRound(10);
		
		circle.compute();
		circle.output();
		circle2.compute();
		circle2.output();
		System.out.println("--------------");
		
		//부모 클래스
		
		Circle[] circle3 = new Circle[2];
		circle3[0] = new CircleArea(10);
		circle3[1] = new CircleRound(10);
		for(int i=0;i<circle3.length;i++) {
			circle3[i].compute();
			circle3[i].output();
		}
		
	}

}
