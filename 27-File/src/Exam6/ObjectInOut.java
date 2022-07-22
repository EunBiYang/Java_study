package Exam6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectInOut {
	//1.파일 저장
	/**
	 * 파일 저장 : 리스트에 저장된 객체를 파일로 저장합니다.
	 * @param fileName	:파일 경로
	 * @param list		:객체를 저장한 리스트
	 * @return boolean	:저장 성공 true, 실패면 false
	 */
	public boolean write(String fileName, List<StudentVO> list) {
		boolean result = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);	//파일 생성 및 파일 오픈
			oos = new ObjectOutputStream(fos);		//
			//데이터 갯수를 파일로 출력
			oos.writeInt(list.size());//이건 아래 읽어올때 필요해서 집어 넣은 것
			//객체를 파일로 출력
			for(int i=0; i<list.size();i++) {
				StudentVO vo= list.get(i);
				oos.writeObject(vo);
			}
			//이곳까지 코드가 진행되면 성공!
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]:파일을 찾을 수 없습니다 >>"+fileName);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 저장 실패>>"+fileName);
			//e.printStackTrace();
		} catch(Exception e) {
			System.out.println("[ERROR] 알수 없는 에러 >>"+fileName);
		} finally {
			try {
				if(oos !=null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	//2.파일 읽기
	/**
	 * 파일 읽기 : 파일에 저장된 데이터를 리스트에 저장합니다.
	 * @param fileName	: 파일의 경로
	 * @return List		: 객체를 저장한 리스트 리턴
	 */
	public List<StudentVO> read(String fileName){
		List<StudentVO> list = new ArrayList<StudentVO>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;//보조 스트림 클래스
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			//데이터 갯수 읽어오기
			int num = ois.readInt();
			//객체 수 만큼 읽어와서, 리스트에 저장
			for(int i=0; i<num;i++) {
				StudentVO vo = (StudentVO)ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR]:파일을 찾을 수 없습니다 >>"+fileName);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패>>"+fileName);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 클래스가 없음 >>"+fileName);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알수 없는 에러 >>"+fileName);
			//e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}


















