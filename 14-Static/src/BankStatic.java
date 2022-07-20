
public class BankStatic {
	private String name;	//고객명
	private double balance;//잔고
	private static double rate;	//이율
	
	public BankStatic(String name,double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void print_account() {
		//System.out.println(name+"\t"+balance+"원\t"+BankStatic.rate);
		//같은 클래스 안의 맴버함수에서 static변수는 클래스명을 생략해서 사용할 수 있음
		System.out.println(name+"\t"+balance+"원\t"+rate);
	}
//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		BankStatic.rate = rate;
	}

}
