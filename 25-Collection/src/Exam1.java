import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam1 {
	public static void main(String[] args) {
		//<key자료형, data 자료형>
		//key값의 중복이 안됨, 데이터의 순서가 없다.
		Map<String, Integer> map = new HashMap<String, Integer>(); //부모클래스 기준, 자주쓴다!
		//HashMap<String, Integer> map2 = new HashMap<String, Integer>();//자식클래스 기준
		//기능의 차이는 없다.
		
		//저장
		//=>key의 중복을 허락하지 않는다.
		//put : 기존에 없는 키면 저장, 있으면 수정
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("aaa", 444);
		map.put("ccc", 333);
				
		//전체 데이터 확인
		System.out.println(map);
		System.out.println("------");
		
		//데이터 갯수 확인하기
		System.out.println(map.size());
		System.out.println("------");
		
		//데이터 읽기 
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		//없는 데이터를 꺼내려 한다면? null값이 뜬다.
		System.out.println(map.get("ddd"));
		
		//iterator를 사용하여 한번에 처리하기 
		Set<String> set = map.keySet();//key값만 추출
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key = "+key+", value : "+map.get(key));
		}
		
		//데이터 삭제
		//1개 삭제
		map.remove("aaa");
		System.out.println(map);
		System.out.println("------");
		
		//전체 삭제
		map.clear();
		System.out.println(map);
		System.out.println("------");
		
	}

}











