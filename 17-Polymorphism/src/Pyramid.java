
public class Pyramid extends DrawData {
	
	@Override
	void draw() {
		for(int i=1; i<=getHeight(); i++) {				//층수  : 5 층
			for(int j=1; j<=getHeight()-i; j++) {			// 공백문자 출력
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1 ;j++) {			// 별문자 출력
				System.out.print(getOutchar());
			}System.out.println();
		}
	}
}

