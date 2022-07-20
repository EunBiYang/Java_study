
class Address{
	private String name;
	private String number;
	private String addr;
	
	public Address(String name, String number, String addr) {
		this.name = name;
		this.number = number;
		this.addr = addr;
		
	}
	public void showAddress() {
		System.out.printf("이름 : %s\n전화 : %s\n주소 : %s\n"
							,name,number,addr);
	}
	
}


public class Practice2 {
	public static void main(String[] args) {
		Address a1;
		a1 = new Address("홍길동", "010-1234-5678","서울시 강남구 역삼동");
		
		a1.showAddress();
	}

}


