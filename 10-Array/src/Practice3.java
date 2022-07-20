import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수
		int[] jumsu = new int[5];
		int[] rank = new int[5];
		
		//명령
		//점수 입력 및 순위 알고리즘 !! 
		//반복문을 통해rank[i]를 1으로 초기화 해주면서 jumsu[i]와 jumsu[j]값을 비교하고
		//결과에 맞춰 rank에 추가하는 알고리즘
		
		for(int i=0; i<jumsu.length;i++) {
			System.out.printf("%s번 점수 입력 : ",i+1);
			jumsu[i] = sc.nextInt();
			rank[i] = 1; 				
			for(int j =0; j<jumsu.length;j++) {
				if(jumsu[i]<jumsu[j]) {
					rank[i]++;					
				}
			}
		}
	
		//출력
		System.out.println("***결과***");
		for(int i=0; i<jumsu.length;i++) {
		System.out.printf("%s점 : %s등\n",jumsu[i],rank[i]);
		}
	}
}
