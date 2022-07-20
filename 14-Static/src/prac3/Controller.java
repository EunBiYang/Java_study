package prac3;

import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	
	EmpVO [] emp = new EmpVO[5];
	int empCnt = 0;
	
	//입력
	void input() {
		if(empCnt<5) {
			emp[empCnt] = new EmpVO();
			System.out.print("이름 : ");
			emp[empCnt].setName(sc.next());
			System.out.print("연봉 : ");
			emp[empCnt].setSalary(sc.nextInt());
			System.out.print("부서 : ");
			emp[empCnt].setDepartment(sc.next());			
			empCnt++;			
		}	
	}	
	//출력
	void output() {
		for(int i=0; i<empCnt; i++) {
			System.out.println(emp[i].toString());
		}
	}

}
