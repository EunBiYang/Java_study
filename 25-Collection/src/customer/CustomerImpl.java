package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer {
	
	//필요한 기능 선언
	Scanner sc = new Scanner(System.in);
	List<CustomerVO> list = new ArrayList<CustomerVO>();
	
	//입력
	@Override
	public void input() {
		CustomerVO vo = new CustomerVO();
		System.out.print("고객번호 : ");
		vo.setCnum(sc.next());
		System.out.print("이   름 : ");
		vo.setCname(sc.next());
		System.out.print("전화번호 : ");
		vo.setCtel(sc.next());
		list.add(vo);
	}
	
	//타이틀 출력
	@Override
	public void printTitle() {
		System.out.println("고객번호\t 이름\t 전화번호");
		
	}
	
	//출력
	@Override
	public void print() {
		if(list.size()>0) {
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
		}else System.out.println("등록된 고객이 없습니다.");
	}
	
	//고객번호검색
	@Override
	public void searchCnum() {
		System.out.print("검색할 고객번호?");
		String num = sc.next();
		int flag = -1;
		for(int i=0; i<list.size();i++) {
			CustomerVO vo = list.get(i);
			if(num.equals(vo.getCnum())) {
				printTitle();
				System.out.println(vo.toString());
				flag = 0;
				break;
			}
		}if(flag==-1) System.out.println("일치하는 고객이 없습니다."); 
	}
	
	//이름검색
	@Override
	public void searchCname() {
		System.out.print("검색할 이름?");
		String name = sc.next();
		int flag = -1;
		
		for(int i=0;i<list.size();i++) {
			CustomerVO vo = list.get(i);
			if(name.equals(vo.getCname())) {
				printTitle();
				System.out.println(vo.toString());
				flag=0;
				break;
			}
		}if(flag==-1) System.out.println("일치하는 고객이 없습니다.");
	}
	
	//전화번호검색
	@Override
	public void searchCtel() {
		System.out.print("검색할 전화번호? ");
		String tel = sc.next();
		int flag = -1;
		
		for(int i=0;i<list.size();i++) {
			CustomerVO vo = list.get(i);
			if(tel.equals(vo.getCtel())) {
				printTitle();
				System.out.println(vo.toString());
				flag = 0;
				break;
			}
		}if(flag == -1) System.out.println("일치하는 고객이 없습니다.");
	}
	
	//이름 내림차순 정렬
	@Override
	public void descSortCname() {
		//정렬기준(약식상속)
		Comparator<CustomerVO> comp = new Comparator<CustomerVO>() {
			@Override
			public int compare(CustomerVO o1, CustomerVO o2) {
				return o2.getCname().compareTo(o1.getCname());
				//내림차순은 o1과 o2의 위치를 바꿔주면 된다!
			}
		};
		//정렬
		Collections.sort(list,comp);
		printTitle();
		print();
	}
	
	//고객번호 오름차순 정렬
	@Override
	public void ascSortCtel() {
		Comparator<CustomerVO> comp = new Comparator<CustomerVO>() {
			@Override
//			public int compare(CustomerVO o1, CustomerVO o2) {
//				return o1.getCtel().compareTo(o2.getCtel());
//			}
			
			// 두번째 자리수까지 오름차순으로 나오게 하려면 int로 형변환 해서 사용
			public int compare(CustomerVO o1, CustomerVO o2) {
				int num1 = Integer.parseInt(o1.getCnum());
				int num2 = Integer.parseInt(o2.getCnum());
				return num1 >num2 ? 1 : -1 ;
			}
		};
		
		Collections.sort(list, comp);
		printTitle();
		print();
	}
}
