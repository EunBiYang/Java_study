import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Exam3 {
	public static void main(String[] args) {
		String str = "가나다라마바사abcdefg";
		String path = "test3.txt";
		
		//특정 인코딩 적용
		byte[] buffer = null;
		try {
			// 문자열을 byte 배열로 전환 시킴. 
			buffer = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//파일 출력
		OutputStream out = null;
		try {
			//1. 파일 생성 및 파일 오픈
			out = new FileOutputStream(path);
			//2. 파일 쓰기
			out.write(buffer);
			System.out.println("[INFO] 파일이 저장됨 >>" +path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 저장에 실패했습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다.");
		} finally {
			try {
				//3.파일 닫기
				if(out !=null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
