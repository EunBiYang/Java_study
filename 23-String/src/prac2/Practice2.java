package prac2;

public class Practice2 {
	public static void main(String[] args) {
		Circle c1 = Circle.getInstance();//싱클턴 패턴은 new로 객체를 생성할 수 없고 getInstance로 호출!//클레스 내에서 private으로 생성했기때문!!
		c1.setR(10);
		c1.compute_area();
		c1.compute_round();
		c1.output_area();
		c1.output_round();
	}
	


}
