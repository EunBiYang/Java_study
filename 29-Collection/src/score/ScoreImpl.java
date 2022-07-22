package score;

import java.util.List;
import java.util.Scanner;


public class ScoreImpl implements Score {
	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	int num;
	
	public void MainMeue() {
		while (true) {
			do {
				System.out.println();
				System.out.println("***************");				                                                                                                                                        
				System.out.println("1. 입력");
				System.out.println("2. 출력");
				System.out.println("3. 학번검색");
				System.out.println("4. 이름검색");
				System.out.println("5. 총점 내림차순 정렬");
				System.out.println("6. 학번 오름차순 정렬");
				System.out.println("7. 종료");
				System.out.println("***************");
				System.out.print("번호 : ");
				num = sc.nextInt();
				System.out.println();
			} while (num < 1 || num > 7);
			System.out.println();
		
			switch (num) {
			case 1: input(); break;
			case 2: print(); break;
			case 3: searchHak(); break;
			case 4: searchName(); break;
			case 5: descSortTot(); break;
			case 6: ascSortHak(); break;
			case 7: System.out.println("종료합니다.");
					System.exit(0);
			}
		System.out.println();
		}
	}
	
	@Override
	public void input() {
		ScoreDTO dto = new ScoreDTO();
		System.out.print("학번 : ");
		dto.setHak(sc.next());
		System.out.print("이름 : ");
		dto.setName(sc.next());
		System.out.print("국어 : ");
		dto.setKor(sc.nextInt());
		System.out.print("영어 : ");
		dto.setEng(sc.nextInt());
		System.out.print("수학 : ");
		dto.setMat(sc.nextInt());
		dto.setTot(dto.getKor() + dto.getEng() + dto.getMat());
		dto.setAvg(dto.getTot() / 3);
		dao.insert(dto);
		
		//학번 중복 검사
		ScoreDTO dto1 = dao.searchHak(dto.getHak());
		if(dto1 != null) {
			System.out.println(dto.getHak()+"학번은 존재합니다.");
		}
		
	}

	@Override
	public void print() {
		List<ScoreDTO> list = dao.printAll();
		printTitle();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	@Override
	public void printTitle() {
		System.out.println("학번\t 이름\t 국어\t영어\t수학\t총점\t평균");
	}

	@Override
	public void searchHak() {
		System.out.print("검색할 학번 : ");
		String hak = sc.next();

		ScoreDTO dto = dao.searchHak(hak);

		if (dto != null) {
			printTitle();
			System.out.println(dto.toString());
		} else {
			System.out.println(hak + "은 없는 학번입니다.");
		}
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		List<ScoreDTO> list = dao.searchName(name);
		if (list.size() > 0) {
			printTitle();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		} else
			System.out.println(name + "은 없는 이름입니다.");
	}

	@Override
	public void descSortTot() {
		List<ScoreDTO> list = dao.descTot();
		printTitle();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	@Override
	public void ascSortHak() {
		List<ScoreDTO> list = dao.ascHak();
		printTitle();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
