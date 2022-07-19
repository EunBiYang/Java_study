/** 여러줄 주석
 * 프로그램 소스의 최소 단위는 = class
 * 프로그램 시작 클래스 (메인 클래스)-->public class 클래스 명 
 * 메인클레스 이름은 소스파일의 이름과 동일해야하며, 영어, 숫자, 언더바(_)만 사용 가능하다.
 * 첫글자는 반드시 알파뱃 대문자로 시작되어야 한다.
 */
public class Exam1 {
	/**
	 * 프로그램의 시작점 : main 메소드(함수)
	 * =>자바는 메인 메소드안의 명령들을 첫줄부터 마지막 줄까지 순차적으로 실행함
	 *		마지막 줄까지 실행되면 프로그램은 종료됨
	 */
	public static void main(String[] args) {
		// 콘솔에 데이터를 출력하기 위한 명령어
		//자바의 데이터 종류 (정수(소수점x),실수(소수점0),문자('),문자열(""),boolean(true,false 소문자로시작)
		
		//System.out.println(데이터)
		//==>데이터를 출력하고 한줄 넘김이 있음
		System.out.println(5);
		System.out.println(7.7);
		System.out.println('A');
		System.out.println("ABC");
		System.out.println(true);
		System.out.println("-----------------------");
		
		//System.out.print(데이터)
		//==>데이터를 출력하고 한줄 넘김 없음
		System.out.print(5);
		System.out.print(7.7);
		System.out.print('A');
		System.out.print("ABC");
		System.out.print(true);
		System.out.println("-----------------------");
		
		//System.out.printf("서식문자",데이터)
		//==>서식문자에 데이터를 삽입하여, 문자열을 만들고, 그 문자열을 콘솔창에 출력함
		//==>줄넘김 기능이 없기 때문에 필요한 경우 줄넘김 문자('\n')를 사용해준다.
		//%d : 정수, %자리수d
		//%f : 실수, %자리수.소수점자리수f
		//%c : 문자
		//%s : 문자열
		//%b : boolean
		System.out.printf("%d %f %c %s %b", 5,7.7,'A',"ABC", true);
		System.out.println("-----------------------\n");
		
		System.out.printf("%d %f %c %s %b\n", 5,7.7,'A',"ABC", true);
		System.out.println("-----------------------");
		
		//%s는 모든 타입을 아우른다. 소수점도 입력한 만큼만 나온다.
		System.out.printf("%s %s %s %s %s\n", 5,7.7,'A',"ABC", true);
		System.out.println("-----------------------");
		
		
		System.out.printf("%10d %10.2f %c %s %b\n", 5,7.7,'A',"ABC", true);
		System.out.println("-----------------------");
	}

}
