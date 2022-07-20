import java.util.Scanner;

public class Practice61 {
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 관리 프로그램");
		System.out.println("*************");
		System.out.println("     1. 입고\n     2. 출고\n     3. 목록\n     4. 종료");
		System.out.println("*************");
		System.out.print("   메뉴 : ");
		int menu = sc.nextInt();
		return menu;
		
	}


	static int in_goods(int goods_cnt, String[] name, int[] amount, int[] price) {
		Scanner sc = new Scanner(System.in);
		if(goods_cnt < 20) {
			System.out.print("품명 : ");
			name[goods_cnt] = sc.next();
			System.out.print("수량 : ");
			amount[goods_cnt] = sc.nextInt();
			System.out.print("단가 : ");
			price[goods_cnt] = sc.nextInt();
				         
			goods_cnt++;	//품목수 증가
		} else {
			System.out.println("저장할 공간이 없습니다.");
		}
		return goods_cnt;
	}			      
		      
		   
		   
	static int out_goods(int goods_cnt, String[] name, int[] amount) {
		Scanner sc = new Scanner(System.in);
		System.out.print("품명 : ");
		String name_tmp = sc.next();
		System.out.print("수량 : ");
		int amount_tmp = sc.nextInt();
		
		// 품명이 없는지 검사
		int flag = -1;	//상태를 저장하는 변수 / 상태저장 => 0: 품명이 있음, -1:품명이 없음
		int position = -1; //총액을 계산하기 위한, 품명의 위치값
		
		for(int i=0; i<name.length; i++) {				 
			
			if(name_tmp.equals(name[i])) {	//품명이 같은지 검사
				flag = 0;	//상품이 있음으로 상태 변경
				position =i;
				if(amount[i] >= amount_tmp) {  //재고가 부족하지 않는지 검사
					amount[i] -= amount_tmp;
				}else {
					System.out.println("수량이 부족합니다.현재 재고 : "+amount[i]);
				}
				break;		//for문 종료
			}
		}
		if(flag == -1) System.out.println("품명이 없습니다.");
		
		return position;
	}
	
	
	//모든 품명에 대해서 계산
	static void compute_all(int goods_cnt, int[]amount, int[]price, int[] total) {
		for(int i=0; i<goods_cnt; i++) {
			total[i] = amount[i] * price[i];
		}		
	}
	
	//한개 품명에 대해서 계산
	static void compute_one(int position, int[] amount, int[] price, int[] total) {		
		total[position] = amount[position] * price[position];		
	}
		   

	static void output_list(int goods_cnt, String[] name, int[] amount, int[] price, int[] total) {
		System.out.println("품명\t수량\t단가(원)\t총액(원)");  // \t : 탭문자
		      for(int i=0; i<goods_cnt; i++) {
		    	  System.out.printf("%s\t%d\t%d\t%d\n", name[i], amount[i], price[i], total[i]);
		      }
	}

	
	public static void main(String[] args) {
		// 선언
		String[] name = new String[20];  //품명
		int[] amount = new int[20];  	//수량
		int[] price = new int[20];  		//가격
		int[] total = new int[20];  		//총액
		int goods_cnt = 0;  //품목의 수 저장
		int menu_num = 0;  //메뉴번호 저장
			   
		//입력, 연산, 출력
		while(true) {
			menu_num = menu();
				   
			if(menu_num ==4) {
				System.out.println("종료");				
				break;
			}
				   
			switch(menu_num) {
			case 1:		//입고
				goods_cnt = in_goods(goods_cnt, name, amount,price);
				compute_one(goods_cnt-1, amount, price, total);
				break;
			case 2:		//출고
				int position = out_goods(goods_cnt, name, amount);
				if(position >= 0) {
					compute_one(position, amount, price, total);
				}
				break;
			case 3:		//목록
				output_list(goods_cnt,name, amount, price, total);
				break;
				
			default:		//
				System.out.println("1~4 사이의 번호를 출력해주세요");
			}
			System.out.println();//줄넘김
		}
	}
}

