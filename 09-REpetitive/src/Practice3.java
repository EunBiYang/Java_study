import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		String a;
		

		while(true){
		
			System.out.print("몇 단을 출력할지 입력하세요 : ");
			num = sc.nextInt();
			
			for (int x=1; x<=9; x++) {
				System.out.printf("%d*%d=%s\n",x,num,x*num);
				}
			System.out.print("계속할지 선택하세요(y계속):");
			a=sc.next();
				
				if(!a.equals("y")) {
					break; 
				}
				System.out.println(); //1줄넘김
				
			}
		System.out.print("종료");
		sc.close();
		}
		
	
	
	
	}

