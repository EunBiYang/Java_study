import helper.FileHelper;

public class Exam5 {
	public static void main(String[] args) {
		
		String encType = "utf-8";
		String filePath = "myfile.txt";
		String content = "안녕하세요. 자바 프로그래밍";
		
		boolean result = FileHelper.getInstance().writeString(filePath, content, encType);
		if(result) {
			System.out.println("파일 저장 성공");
		}else {
			System.out.println("파일 저장 실패");
			return;  //함수 강제 종료
		}
		
		String str_result = FileHelper.getInstance().readString(filePath, encType);
		System.out.println(str_result);

	}

}
