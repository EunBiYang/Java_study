import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		DatePrinter.printDateTime(calendar);
		System.out.println("---------------");
		
		//특정 날짜로 수정 방법1
		calendar.set(Calendar.YEAR,2020);
		calendar.set(Calendar.MONTH, 5); //6월로 설정 한것, 현재 달보다 하나 적은 수로 설정
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 15);
		calendar.set(Calendar.MINUTE, 30);
		calendar.set(Calendar.SECOND, 30);
		DatePrinter.printDateTime(calendar);
		System.out.println("---------------");
		
		
		//특정 날짜로 수정 방법 2	
		calendar.set(2023, 4, 5);
		DatePrinter.printDateTime(calendar);
		System.out.println("---------------");
		
		//특정 날짜로 수정 방법3
		calendar.set(2022,5,1,12,12,12);
		DatePrinter.printDateTime(calendar);
		System.out.println("---------------");
		
	}

}
