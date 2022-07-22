package score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.ListModel;

public class ScoreImpl implements Score {
	//선언
	Scanner sc = new Scanner(System.in);
	List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	
	//입력기능
	//1명 데이터 저장 및 리스트에 저장
	@Override
	public void input() {
		ScoreVO vo = new ScoreVO();
		System.out.print("학번 : ");
		vo.setHak(sc.next());
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		int tot = vo.getKor()+vo.getEng()+vo.getMat();
		double avg = (double) tot/3;
		vo.setTot(tot);
		vo.setAvg(avg);
		
		//리스트에 저장
		list.add(vo);
	}
	
	//출력기능
	@Override
	public void print() {
		if(list.size()>0) {
			printTitle();
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
		}else {
			System.out.println("등록된 데이터가 없습니다.");
		}
	}
	
	//제목 출력
	@Override
	public void printTitle() {
		System.out.println("학번\t 이름\t 국어\t영어\t수학\t총점\t평균");
	}
	
	//학번 검색
	@Override
	public void searchHak() {
		System.out.print("검색할 학번 : ");
		String hak = sc.next();
		int flag = -1;
		for(int i=0; i<list.size();i++) {
			ScoreVO vo = list.get(i);
			if(hak.equals(vo.getHak())) {
				printTitle();
				System.out.println(vo.toString());
				flag = 0;
			}
		}if(flag==-1)System.out.println(hak+"은 없는 학번입니다.");
	}
	
	//이름 검색
	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		int flag = -1;
		for(int i=0; i<list.size();i++) {
			ScoreVO vo = list.get(i);
			if(name.equals(vo.getName())) {
				printTitle();
				System.out.println(vo.toString());
				flag = 0;
			}
		}if(flag==-1)System.out.println(name+"은 없는 학생입니다.");
	}
		
	
	//총점기준 내림차순 정렬
	@Override
	public void descSortTot() {
		//정렬 기준 (약식상속)
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getTot() < o2.getTot() ?1:-1;//숫자는 삼항연산자로 비교, 참이면 앞에 거짓이면 뒤에값 리턴
			}
		};
		//정렬 (Collections.sort(list, 정렬 기준 객체);)
		Collections.sort(list, comp);
		print();
		
	}
	
	
	//학번기준 오름차순 정렬
	@Override
	public void ascSortHak() {
		//정렬기준 
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getHak().compareTo(o2.getHak());//문자열은 compareTo로 비교
//				인수 문자열이 인수와 같으면 값이 0
//				문자열이 사전순으로 인수문자열 보다 작으면 0보다 작은값
//				문자열이 사전순으로 인수문자열보다 크면 0보다 큰값
			}
		};
		Collections.sort(list, comp);
		print();
		
		
	}
	

}
















