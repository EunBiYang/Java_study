import java.util.ArrayList;
import java.util.List;

import study.java.model.People;

public class Exam4 {
	public static void main(String[] args) {
		List<People> list = new ArrayList<People>();
		
		//데이터 저장
		People p1 = new People("홍길동","010-1245-5677");
		People p2 = new People("김철수","010-1245-5678");
		People p3 = new People("이영희","010-1245-5676");
		People p4 = new People("고길동","010-1245-5675");
		People p5 = new People("김길동","010-1245-5674");
		
		//리스트에 저장
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		//데이터 확인
		for(int i=0;i<list.size();i++) {
			People people = list.get(i);
			System.out.println(people.toString());
		}
		
		
	}

}
