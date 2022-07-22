import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam3 {
	public static void main(String[] args) {
		//Set : 순서가 없고, 데이터의 중복을 허용하지 않음
		Set<String> set = new HashSet<String>();
		
		//데이터 저장
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
		set.add("코끼리");
		set.add("호랑이");
		
		//전체 데이터 확인
		System.out.println(set);
		System.out.println("-------------------------");
		
		//데이터 읽기
		//개별 읽기는 안됨 =>key값이나 index가 없기 때문에 
		
		//개별 데이터 처리
		//Iterator를 사용하여 개별 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------");
		
		//데이터 수정 불가능
		//=>key 값이나 index가 없기때문
		// => 삭제하고 추가하기
		
		//데이터 삭제
		//1개 삭제
		set.remove("호랑이");
		System.out.println(set);
		System.out.println("-------------------------");
		//전체 삭제
		set.clear();
		System.out.println(set);
		System.out.println("-------------------------");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
