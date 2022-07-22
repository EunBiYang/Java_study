import java.io.CharConversionException;

public class Exam1 {
	public static void main(String[] args) {
		//다중상속일 경우는 부모가 많기 때문에
		//자식 클래스 기준으로 사용함
		Character ch = new Character("주인공");
		ch.walk();
		ch.run();
		ch.attact();
		ch.shield();
		System.out.println("-----------------");
		
		Monster mon = new Monster("악당");
		mon.attact();
		mon.walk();
		mon.run();
		mon.shield();
		System.out.println("-----------------");
		
		//다중 상속일 경우에 부모 클래스 기준으로 사용하면 
		//그 부모가 가지고 있는 기능의 함수만 사용할 수 있음
		
		Fight f = new Character("주인공1");
		f.attact();
		f.shield();
		
	}

}
