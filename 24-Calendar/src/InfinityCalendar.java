import java.util.Calendar;
import java.util.Scanner;

public class InfinityCalendar {
	//선언
	Scanner sc = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();//싱글톤으로 만들어진 API클래스
	int y;	//년
	int m;	//월
	int dayNum;	//요일수
	
	//입력
	void input() {
		do{
			System.out.print("년도? :");
			y = sc.nextInt();
		}while(y<1);
		do{
			System.out.print("월? :");
			m = sc.nextInt();
		}while(y<1 || m>12);
	}
	//연산
	void setDate() {
		//입력받은 년월과 1일로 설정
		calendar.set(y, m-1, 1);  //컴퓨터 내부에서는 1월을 0으로 표기하기때문에 하나더 작은 값으로 세팅해줘야한다.
		//요일수 구하기
		dayNum = calendar.get(Calendar.DAY_OF_WEEK); //요일수 구하기
	}
	
	//요일 이름 출력
	void outputTitle() {
		System.out.println();
		System.out.println("일  월  화 수 목  금  토 ");
		System.out.println("---------------------");
	}
	
	//날짜 출력
	void output() {
		//요일수만큼 커서를 옮기기
		for(int i =1; i<dayNum;i++) {
			System.out.printf("%2s ", " ");
		}
		//이번달의 총 일수 구하기
		int daysOfMonth = calendar.getActualMaximum(Calendar.DATE);
		
		//날짜 출력
		for(int i=1; i<=daysOfMonth;i++) {
			System.out.printf("%2s ", i);
			dayNum++;
			//요일수가 일요일인가? 일요일이면 1줄 넘김함
			if(dayNum %7 ==1) System.out.println();
		}
	}
}












