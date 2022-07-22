import java.util.Calendar;

public class Exam4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//요일수(DAY_OF_WEEK) : 오늘이 일주일중 몇일째인지를 나타낸다.
		//=> 일(1)~토(7)
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일수 : "+dayNum);
		System.out.println("---------------");
		
		//요일 출력하기
		String[] day_name = {"일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+day_name[dayNum -1 ]+"요일 입니다.");
		
		//이번달은 몇일까지 있는지 확인하기
		int day_count = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("이번달은 "+ day_count +"일까지 있습니다.");
		
		
		//문제
		//6월1일의 요일을 표시해 보세요
		calendar.set(2022,5,1);
		int num = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("6월 1일은 "+day_name[num-1]+"요일 입니다.");
		
		
	}

}
