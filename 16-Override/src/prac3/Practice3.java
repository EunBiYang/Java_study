package prac3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test3[] op = new Test3[2];
		int cnt;
		//입력
		for(int i=0;i<op.length;i++) {
			op[i] = new Test3();
			op[i].input();
			op[i].setProcess();
			cnt = op[i].getQty()+Sales.getCnt();//총판매건수 계산
			Sales.setCnt(cnt);
		}
		
		//할인율 입력
		System.out.print("할인율 : ");
		Sales.setDiscount(sc.nextDouble());
		System.out.println();

		//판매가 출력
		
		System.out.println("[[판매가]]");
		for(int i=0;i<op.length;i++) {
			op[i].getDisplay();
		}
		//총수량 출력
		System.out.println("\n판매건수 : "+Sales.getCnt());
	
	}
}
