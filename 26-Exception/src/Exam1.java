
public class Exam1 {
	//형식에 맞지 않는 입력값을 받는 경우 에러가 발생하는 예제
	public static void main(String[] args) {

		String year1 = "1998";
		int age1 = 2022 - Integer.parseInt(year1)+1;
		System.out.println(age1+"살 입니다.");
		
		String year2 = "뭘까요?";
		int age2 = 2022 - Integer.parseInt(year2)+1;
		System.out.println(age2+"살 입니다.");
		
		System.out.println("--------프로그램을 종료합니다.-----------");
	}
}
