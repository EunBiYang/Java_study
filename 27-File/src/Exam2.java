import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) {
		String str = "가나다라마바사abcdefg";
		String path = "test2.txt";
		
		//파일 출력
		try {
			//1.파일 만들기 2.파일을 오픈함
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.write(str); //3.쓰기
			fileWriter.close();		//4.파일 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//파일 입력
		try {
			//1.파일을 오픈함
			FileReader fileReader = new FileReader(path);
			//2. 파일 읽기
			int data = 0;
			String result = "";
			// EOF(End Of File) : -1, 모든 파일의 제일 끝 데이터를 말한다.
			while((data = fileReader.read()) != -1) {
				result += (char)data; //char로 형변환을 해야 한글로 보인다.
			}
			System.out.println(result);
			//3.파일 닫기
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
