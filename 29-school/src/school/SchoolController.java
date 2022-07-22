package school;

import java.util.List;
import java.util.Scanner;

//메뉴 기능 처리
public class SchoolController {
	Scanner sc = new Scanner(System.in);
	SchoolDAO dao = new SchoolDAO();

	// 1. 메인메뉴
	public void MainMeue() {
		while (true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   관리");
			System.out.println("***************");
			System.out.println("1. 입력");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			System.out.println();

			// 기능
			switch (num) {
			case 1:input();break;
			case 2:search();break;
			case 3:delete();break;
			case 4:endpgm();
			}
		}
	}

	// 2.입력에서 쓸 메뉴구현
	public void input() {
		while (true) {
			System.out.println("***************");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			System.out.println("4. 이전메뉴");
			System.out.println("***************");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			System.out.println();

			switch (num) {
			case 1:// 학생일때
				SchoolDTO dto = new SchoolDTO();
				dto.setCode(1);
				System.out.print("이름 입력 :");
				dto.setName(sc.next());
				System.out.print("학번 입력 :");
				dto.setValue(sc.next());
				dao.insert(dto);
				break;
			case 2:// 교수일때
				SchoolDTO dto2 = new SchoolDTO();
				dto2.setCode(2);
				System.out.print("이름 입력 :");
				dto2.setName(sc.next());
				System.out.print("과목 입력 :");
				dto2.setValue(sc.next());
				dao.insert(dto2);
				break;
			case 3:// 관리자일때
				SchoolDTO dto3 = new SchoolDTO();
				dto3.setCode(3);
				System.out.print("이름 입력 :");
				dto3.setName(sc.next());
				System.out.print("부서 입력 :");
				dto3.setValue(sc.next());
				dao.insert(dto3);
				break;
			case 4:
				MainMeue();
				break;
			}
		}
	}

	// 3.검색에서 쓸 메뉴구현
	public void search() {
		while (true) {
			System.out.println("***************");
			System.out.println("1. 이름 검색");
			System.out.println("2. 전체 검색");
			System.out.println("3. 이전메뉴");
			System.out.println("***************");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			System.out.println();

			switch (num) {
			case 1:
				// 이름검색
				System.out.print("검색할 이름은?");
				String name = sc.next();

				List<SchoolDTO> list = dao.selectOne(name);
				if (list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
				} else {
					System.out.println("정보가 없습니다.");
				}
				break;
			case 2:
				// 전체검색
				List<SchoolDTO> list2 = dao.selectAll();
				for (int i = 0; i < list2.size(); i++) {
					System.out.println(list2.get(i).toString());
				}
				break;
			case 3:
				MainMeue();
				break;
			}
		}
	}

	// 4.삭제
	public void delete() {
		System.out.print("삭제를 원하는 이름 입력 : ");
		String dname = sc.next();
		int result = dao.delete(dname);

		if (result > 0)
			System.out.println("삭제되었습니다.");
		else
			System.out.println("삭제되지 않았습니다.");
	}

	// 5.종료
	public void endpgm() {
		System.out.println("종료합니다.");
		System.exit(0);
	}
}
