import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Exam4 {
	public static void main(String[] args) {
		String path = "test3.txt";
		
		
		//읽은 내용이 저장될 byte배열 선언
		byte[] data = null;
		//byte 배열을 변환해 저장할 문자열 변수
		String result = null;
		//파일 읽기
		InputStream in = null;
		try {
			in = new FileInputStream(path);
			//변수 만들기
			//in.available() : 파일의 크기를 읽어오는 함수
			data = new byte[in.available()];
			//파일을 읽어서 배열에 저장
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >>"+path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패>>"+path);
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다."+path);
		}finally {
			try {
				if(in !=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//data 배열에 데이터가 있으면 ,문자열로 변환시킴
		if(data != null) {
			try {
				result = new String(data, "utf-8");
				System.out.println(result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] 인코딩 지정 에러.");
				e.printStackTrace();
			}
			
		}
	}

}
