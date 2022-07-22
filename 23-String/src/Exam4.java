
public class Exam4 {
	public static void main(String[] args) {
		//데이터 타입을 문자열로 변경하는 방법1
		int i = 5;
		double d = 3.14;
		boolean b= true;
		
		String str1 = String.valueOf(i);
		String str2 = String.valueOf(d);
		String str3 = String.valueOf(b); 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("--------------");

		//데이터 타입을 문자열로 변경하는 방법2
		int ii = Integer.parseInt(str1);
		double dd = Double.parseDouble(str2);
		boolean bb = Boolean.parseBoolean(str3);
		System.out.println(str1+str2);
		System.out.println(dd);
		System.out.println(bb);
		System.out.println("--------------");
		
		
	}
}
