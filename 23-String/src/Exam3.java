/*
 * 주민등록번호 기본구조
 * 900101 - 1234567
 * 90 : 년도
 * 01 : 출생월
 * 01 : 출생일
 * 1 : 성별(1900년도 1: 남성, 2: 여성
 * 			2000년도 3: 남성, 4: 여성)
 */
public class Exam3 {
	public static void main(String[] args) {
		
		String gen;
		String jumin = "9006071234567";
		String yy = jumin.substring(0,2);
		String mm = jumin.substring(2,4);
		String dd = jumin.substring(4,6);
		String g = jumin.substring(6,7);
	
		//년도 수정
		if(g.equals("1")|| g.equals("2")) {	    	  
			yy= 19+yy;	      
		}else {
			yy = 20+yy;
		}
	      
		//성별설정
		if(g.equals("1")|| g.equals("3")) {
			gen = "남자";
		}else {
			gen = "여자";
		}
		System.out.printf("%s년 %s월 %s일 %s",yy,mm,dd,gen);
		
		
	}

}
