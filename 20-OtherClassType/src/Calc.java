
public class Calc {
	//singleton 만들기
	//singleton 패턴 시작
	private static Calc instance;
	
	public static Calc getInstance() {
		if(instance == null) instance = new Calc();
		
		return instance;
	}
	
	private Calc() {}
	//singleton 패턴 끝
	//아래는 매소드 입력
	
	public void plus(int x, int y) {
		int z = x+y;
			System.out.println(x + "+"+y+"="+z);
	}
	public void minus(int x, int y) {
		int z = x-y;
			System.out.println(x + "-"+y+"="+z);
	}
}
