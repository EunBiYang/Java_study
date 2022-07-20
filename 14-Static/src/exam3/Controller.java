package exam3;

import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);

	PersonV0[] list = new PersonV0[5];// 객체배열 : 클래스 레퍼런스 배열
	int listCnt = 0;//배열의 위치를 관리하는 변수
	
	//입력
	void input() {
		if(listCnt<5) {
			list[listCnt] = new PersonV0();
			System.out.print("이름 : ");
			list[listCnt].setName(sc.next());
			System.out.print("나이 : ");
			list[listCnt].setAge(sc.nextInt());
			System.out.print("전화 : ");
			list[listCnt].setTel(sc.next());
			
			listCnt++;
		}else {
			System.out.println("인원은 5명까지 입니다.");
		}
	}
	//출력
	void output() {
		for(int i=0; i<listCnt;i++) {
			System.out.println(list[i].toString());
		}
	}

}
