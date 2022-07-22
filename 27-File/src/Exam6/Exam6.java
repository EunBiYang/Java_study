package Exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		ObjectInOut oio = new ObjectInOut();
		List<StudentVO> list = new ArrayList<StudentVO>();
		
		list.add(new StudentVO("홍길동", 17, "수원"));
		list.add(new StudentVO("김철수", 25, "서울"));
		list.add(new StudentVO("이영희", 32, "대전"));
		list.add(new StudentVO("고길동", 45, "부산"));
		
		//파일에 저장
		boolean result = oio.write("student.txt", list);
		if(result) {
			System.out.println("저장성공");
		}else {
			System.out.println("저장 실패");
			return; //함수 강제종료
		}
		
		//파일에서 읽어오기
		List<StudentVO> list2 = oio.read("student.txt");
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i).toString());
		}
	}

}
