
public class test1 {
	//연산 : 저장된 데이터 가공하기
	//				↓매개변수 : 다른 함수에서 전달된 값을 저장하는 변수
	//		↓:결과자료형, 리턴값의 자료형
	static int plus(int x,int y) {
		return x + y;				//호출된 곳으로 되돌아가라!
	}  //결과값 (=리턴값)		만일 리턴값이 있으면, 그값을 가지고 호출한 곳으로 돌아가라는 명령.

	
	
	//출력 : 저장된 데이터 또는 입력값 확인
	static void output(int cc) {
			System.out.println(cc);
			return; //제일 마지막 줄의 결과값이 없는 return은 생략 가능함
	}
		
	
	//				↓ void : 리턴값이 없다는 의미
	public static void main(String[] args) {
		//선언 : 변수 만들기
		int a=5, b=7;
		int c;
		
		//입력 : 변수에 데이터 저장하기
		
		//연산 : 저장된 데이터 가공하기
		c = plus(a,b);  //함수의 호출(순위2.5) : 만들어진 함수의 사용
		
		output(c);
		
	}

}
