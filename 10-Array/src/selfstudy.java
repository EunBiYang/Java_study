import java.util.Random;

public class selfstudy {
	public static void main(String[] args) {
		int[][] jumsu = new int[3][3];
		String[] name = {"홍길동","김철수","이영희"};
		
		Random random = new Random();
		
		for(int i=0;i<jumsu.length;i++) {
			for(int j=0; j<jumsu[i].length;j++) {
				jumsu[i][j]=random.nextInt(99)+1;
			}
		}
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.print(name[i]+" :");
			for(int j=0; j<jumsu[i].length;j++) {
				System.out.print(" "+jumsu[i][j]);
			}
			System.out.println();
		}
		
	}
}


