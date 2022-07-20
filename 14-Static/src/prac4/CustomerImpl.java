package prac4;

import java.util.Scanner;

public class CustomerImpl {
	Scanner sc = new Scanner(System.in);
	
	CustomerVO [] customer = new CustomerVO[10];
	int cnt = 0;	//고객수 저장
	String name; 	
	
	//입력
	void input() {
		if(cnt<10) {
			customer[cnt] = new CustomerVO();
			System.out.print("고객번호 : ");
			customer[cnt].setCnumber(sc.next());
			System.out.print("이   름 : ");
			customer[cnt].setCname(sc.next());
			System.out.print("전화번호 : ");
			customer[cnt].setCtel(sc.next());			
			cnt++;			
		}else {
			System.out.println("고객은 10명까지 입니다.");
		}
	}	
	
	//출력
	void output_title() {
		System.out.println("고객번호\t이름\t전화번호");
	}
	void output() {
		System.out.println("고객번호\t이름\t전화번호");
		for(int i=0; i<cnt; i++) {
			System.out.println(customer[i].toString());
		}
	}
	
	//수정
	//=>동명2인은 존제하지 않은다는 전제
	void change() {
		System.out.print("수정할 이름 ?");
		name = sc.next();
		
		int flag =-1; //수정할 사람이 존재하면 0, 없으면 -1
		
		for(int i=0; i<cnt;i++) {
			if(name.equals(customer[i].getCname())) {
				//고객정보 출력
				output_title();
				System.out.println(customer[i].toString());
				System.out.println();
				//수정작업
				System.out.print("고객번호 : ");
				customer[i].setCnumber(sc.next());
				System.out.print("이   름 : ");
				customer[i].setCname(sc.next());
				System.out.print("전화번호 : ");
				customer[i].setCtel(sc.next());
				
				flag = 0;
				break;
			}
		}	
		if(flag == -1) {
			System.out.println(name+"님은 고객목록에 없습니다.");
		}
	}
	
	//검색
	void search() {
		System.out.print("검색할 이름 ?");
		name = sc.next();
		
		int flag = -1;
		output_title();
		for(int i=0; i<cnt;i++) {
			if(name.equals(customer[i].getCname())) {				
				System.out.println(customer[i].toString());
				flag=0;
			}		
		}	
		if(flag ==-1) {
			System.out.println(name+"님은 고객목록에 없습니다.");
		}
	}
}
