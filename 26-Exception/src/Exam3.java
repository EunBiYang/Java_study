
public class Exam3 {
	public static void main(String[] args) {

		String year1 = "1998";
		int age1 = 2022 - Integer.parseInt(year1)+1;
		System.out.println(age1+"살 입니다.");
		
		//예외 처리
		try {
			//문제가 될만한 코드
			String year2 = "뭘까요?";
			int age2 = 2022 - Integer.parseInt(year2)+1;
			System.out.println(age2+"살 입니다.");
		}catch (NumberFormatException e) {
			//예외가 발생했을 경우 동작함
			System.out.println("오류입니다.");
			System.out.println("원인 : "+e.getMessage());
		}finally {
			//예외 발생 여부와 상관 없이 동작될 코드
			System.out.println("finally 에서 동작합니다.");
		}
		System.out.println("--------프로그램을 종료합니다.-----------");
	}
}

