import java.io.File;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		//java 프로젝트의 상대경로 기준은 프로젝트 이름폴더.
		File f1 = new File("src/Main01.java");
		System.out.println(f1);
		System.out.println("----------------");
		
		// 1)절대 경로로 출력하기
		String abs = f1.getAbsolutePath();
		System.out.println("절대 경로 : "+ abs);
		System.out.println("----------------");
		
		// 2)저장된 경로가 파일인지 검사
		// -> 파일이나 폴더가 존재하면 검사하지만 존재하지 않으면 무조건 false
		System.out.println("파일인가 ?"+f1.isFile());
		System.out.println("----------------");

		// 3)저장된 경로가 폴더(=디렉토리)인지 검사
		System.out.println("폴더인가 ?"+f1.isDirectory());
		System.out.println("----------------");
		
		// 4)저장된 경로가 숨김형태인지 검사
		System.out.println("숨김여부 : "+f1.isHidden());
		System.out.println("----------------");
		
		// 5)존재여부 검사
		System.out.println("존재여부 : "+ f1.exists());
		System.out.println("----------------");
		
		// 6)file 만들기
		try {
			f1.createNewFile();
			System.out.println("파일 생성 성공");
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			e.printStackTrace();
		}
		System.out.println("----------------");
		
		// 7)file 없애기
		f1.delete();
		System.out.println("존재여부 : "+ f1.exists());
		System.out.println("----------------");
		
		// 8) 폴더 정보 객체 생성
		File f2 = new File("a/b/c/target");
		System.out.println(f2);
		System.out.println("----------------");
		System.out.println("파일인가? "+f2.isFile());
		System.out.println("폴더인가? "+f2.isDirectory());
		System.out.println("숨김여부 : "+f2.isHidden());
		System.out.println("존재여부 : "+f2.exists());
		System.out.println("----------------");
		
		
		// 9)디렉토리 만들기
		f2.mkdirs();
		System.out.println("파일인가? "+f2.isFile());
		System.out.println("폴더인가? "+f2.isDirectory());
		System.out.println("숨김여부 : "+f2.isHidden());
		System.out.println("존재여부 : "+f2.exists());
		System.out.println("----------------");
		
		
		// 10)디렉토리 삭제
		f2.delete();
		System.out.println("존재여부 : "+f2.exists());
		System.out.println("----------------");
		
		// 11)마지막 "/" 이후 문자열 리턴
		 System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println("----------------");
		// 12)처음부터 마지막"/" 직전까지의 문자열 리턴
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
		System.out.println("----------------");
	}
}










