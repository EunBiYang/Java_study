package Exam6;

import java.util.List;
import java.util.Scanner;

//기능 함수 구현 클래스
public class DbtestImpl implements Dbtest{
	
	Scanner sc = new Scanner(System.in);
	DbtestDAO dao = new DbtestDAO();
	
	
	@Override
	public void input() {
		//DTO 객체 초기화 : 생성자 이용
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();

		DbtestDTO dto = new DbtestDTO(name, age, height);
		int result = dao.insert(dto);

		if (result > 0)
			System.out.println("저장 성공!");
		else
			System.out.println("저장 실패");
	}
	public void input1() {
		//DTO 객체 초기화 : Setter 이용/data 갯수가 많을 때는 이게 좋다!
		DbtestDTO dto = new DbtestDTO();//매개변수 없이 디폴트 생성자 호출
		System.out.print("이름 : ");
		dto.setName(sc.next());
		System.out.print("나이 : ");
		dto.setAge(sc.nextInt());
		System.out.print("키 : ");
		dto.setHeight(sc.nextDouble());

		int result = dao.insert(dto);

		if (result > 0)
			System.out.println("저장 성공!");
		else
			System.out.println("저장 실패");
	}

	@Override
	public void printAll() {
		List<DbtestDTO> list = dao.selectAll();
		System.out.println("이름\t나이\t키\t등록일");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name3 = sc.next();

		DbtestDTO dto3 = dao.selectOne(name3);
		System.out.println("이름\t나이\t키\t등록일");
		if (dto3 != null) {
			System.out.println(dto3.toString());
		} else {
			System.out.println(name3 + "님의 정보가 없습니다.");
		}
	}

	@Override
	public void modifyAge() {
		System.out.print("이름 : ");
		String name4 = sc.next();
		System.out.print("나이 : ");
		int age4 = sc.nextInt();

		int result = dao.update(age4, name4);
		if (result > 0)
			System.out.println("수정 성공");
		else
			System.out.println();
	}

	@Override
	public void delete() {
		System.out.print("이름 : ");
		String name5 = sc.next();
		int result = dao.delete(name5);
		
		if (result > 0)
			System.out.println("삭제 성공");
		else
			System.out.println("삭제 실패");
	}

	@Override
	public void endPgm() {
		System.out.println("종료합니다.");
		System.exit(0);
	}

}
