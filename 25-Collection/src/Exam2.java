import java.util.ArrayList;
import java.util.List;

public class Exam2 {
	public static void main(String[] args) {
		//List : 순서가 있다. 중복을 허용한다.
		List<Integer> list = new ArrayList<Integer>();
		//ArrayList<Integer> list2 = new ArrayList<Integer>();

		
		//데이터 추가 1 : 뒤에 추가, .add(data);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//데이터 추가 2 : 중간에 추가 .add(index값, data);
		list.add(2, 60);
		
		
		//전체 데이터 확인 1
		System.out.println(list);
		System.out.println("-------------------");
		
		//전체 데이터 확인 2
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------");
		
		//데이터 갯수 확인
		System.out.println(list.size());
		System.out.println("-------------------");
		
		//읽기 .get((index));
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list.get(5));
		System.out.println("-------------------");
		
		// 데이터 수정 : .set(index값, data);
		list.set(3, 70);
		System.out.println(list);
		System.out.println("-------------------");			
		//데이터 삭제
		//1개 삭제
		list.remove(3);
		System.out.println(list);
		System.out.println("-------------------");	
		
		//전체 삭제
		list.clear();
		System.out.println(list);
		System.out.println("-------------------");		
	}

}





















