
public class IsoTriangle extends DrawData {
		
	@Override
	void draw() {
		for(int x=1; x<=getHeight(); x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(getOutchar());
		}System.out.println();
		}
	}
}
