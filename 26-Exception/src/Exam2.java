
public class Exam2 {
	//배열의 크기를 초과하는 인덱스 처리시 에러가 발생하는 예제
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for (int i =0;i<=3; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("---------프로그램을 종료합니다.---------");
	}
}
