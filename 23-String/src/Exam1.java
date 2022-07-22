
public class Exam1 {
	public static void main(String[] args) {
		// 문자열 저장
		//index(위치값) 01234567890123
		String str1 ="자바 Programming";
		String str2 = new String("Java");
		
		//1)문자열의 길이를 조회
		System.out.println("str1 len : "+ str1.length());
		System.out.println("str2 len : "+ str2.length());
		System.out.println("--------------------------");
				
		//2)특정 문자열이 처음으로 나타나는 위치를 조회
		// =>왼쪽에서 오른쪽으로 이동하면서 위치를 검사
		System.out.println(str1.indexOf(" "));
		System.out.println(str2.indexOf("a"));
		System.out.println(str1.indexOf("m",str1.indexOf("m")+1));
		System.out.println("--------------------------");
		
		//3)특정 문자열이 나타나는 마지막 위치를 조회
		//오른쪽에서 왼쪽으로 이동하면서 위치를 검사
		System.out.println(str1.lastIndexOf("m"));
		System.out.println(str2.lastIndexOf("a"));
		System.out.println("--------------------------");
		
		//4)A를 B로 변경하기
		String new_str1 = str1.replace(" ", "_"); //원본은 바뀌지 않는다.
		String new_str2 = str2.replace("a", "A");
		System.out.println(new_str1);
		System.out.println(new_str2);
		System.out.println("--------------------------");
		
		//5)대소문자 변경
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		System.out.println("--------------------------");
		
		//6)문자열의 앞뒤 공백 제거
		String input = "               enjoy java programming            ";
		System.out.println(input.trim());
		System.out.println("--------------------------");
		
		//7)문자열 비교하기
		boolean isSame = str1.equals(str2);
		if(isSame) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		System.out.println(str1.equals(str2));
		System.out.println("--------------------------");
		
		//8)문자열 자르기
		//substring(시작 위치, 끝 위치) : 시작~끝-1까지
		String sub_str1= str1.substring(0,2);
		System.out.println(str1);
		System.out.println(sub_str1);
		System.out.println("--------------------------");
		System.out.println(str1.substring(1,9));
		System.out.println(str2.substring(2));
		System.out.println("--------------------------");
		//substring(첫번째 위치값) : 첫번째~ 마지막까지 문자열을 잘라냄
		sub_str1 = str1.substring(3);
		System.out.println(str1);
		System.out.println(sub_str1);
		
		
		//9)형식에 따른 문자열 출력을 위한 static 매소드 사용
		System.out.println("--------------------------");
		int yy = 2022;
		int mm = 5;
		int dd = 16;
		String gender = "여자";
		String result = String.format("%d년 %d월 %d일 %s", yy,mm,dd,gender);
		System.out.println(result);
		System.out.println("--------------------------");
		
		//10) 주어진 글자를 기준으로 잘라내어 배열로 전환
		String src = "C++/Java/C#/Javascript/VB";
		String[] data = src.split("/");
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

}










