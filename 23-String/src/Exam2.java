
public class Exam2 {
	public static void main(String[] args) {
		String email = "student@java.com";
		
		int position = email.indexOf("@");
		
		String ID = email.substring(0,position);
		String Address = email.substring(position+1);
		
		System.out.println(position);
		System.out.println(ID);
		System.out.println(Address);
		
	}

}
