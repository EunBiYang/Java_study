
public class Exam6 {
	public static void main(String[] args){
		AAA aa = new AAA();
		//예외 전가된 함수를 사용할 때에는 반드시 예외처리를 해야한다.
		try {
			aa.ex();
		}catch (NumberFormatException e) {
			System.out.println("입력된 데이터에 문제가 있습니다.");
			//e.printStackTrace();
		}catch(Exception e) {
			System.out.println("에러가 있습니다.");
			//e.printStackTrace();
		}
	}
}
