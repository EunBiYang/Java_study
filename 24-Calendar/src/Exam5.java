
public class Exam5 {
	public static void main(String[] args) {
		InfinityCalendar infinitiyCalendar
		=new InfinityCalendar();
		
		infinitiyCalendar.input();
		System.out.println("---------------------");
		System.out.print(infinitiyCalendar.m+"월 달력");
		infinitiyCalendar.setDate();
		infinitiyCalendar.outputTitle();
		infinitiyCalendar.output();
		System.out.println("\n---------------------");
	}

}
