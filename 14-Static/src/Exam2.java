
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("---2010년 ---");
		//이율설정
		BankStatic.setRate(2.5);
		BankStatic hong = new BankStatic("홍길동", 100000);
		hong.print_account();
		
		System.out.println("---2015년 ---");
		BankStatic.setRate(4.5);
		BankStatic kim = new BankStatic("김철수", 200000);
		hong.print_account();
		kim.print_account();
		
		System.out.println("---2020년 ---");
		BankStatic.setRate(5.5);
		BankStatic lee = new BankStatic("이영희", 300000);
		hong.print_account();
		kim.print_account();
		lee.print_account();
		
		
	}

}
