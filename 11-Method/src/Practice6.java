import java.util.Scanner;

public class Practice6 {
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	static void in_goods(int[] nn) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 입력하세요");
		for(int i=0;i<nn.length;i++) {
			if(nn[i]== 0) {
				nn[i] = sc.nextInt();
			}else {
				
			}
		} 
	}
	
	
	public static void main(String[] args) {		
		//필요한 변수와 1차원 배열 만들기
		String[] goods = new String[20];
		int[] quan = new int[20];
		int[] price = new int[20];
		int[] total = new int[20];
		int counter = 0;
		int menu_num = 0;
		
		
		//menu()함수를 호출하여, 번호를 입력 받으시오.
		int menu = menu();
		//in_goods()함수를 호출하여 품명, 수량, 단가를 입력 받으시오
		//out_ goods()함수를 호출하여 품명, 수량을 입력 받으시오
		//compute()함수를 호출하여 총액을 저장하시오
		//output_list() 함수를 호출하여 결과를 아래와 같이 출력하시오
	}
	
	
	//2. compute()함수에서 계산된 결과를 저장하시오
		//(계산방법 : 총액 = 수량 * 단가)
	//3. 한번 입고한 품명으 다시 입고하지 않는다.(간단히 연습하기 위해서)
	

}
