package parc1;

public class CircleArea extends Circle{

	CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		setSize(getR()*getR()*PI);
	}

	@Override
	public void output() {
		System.out.println("원의넓이 : "+getSize());	
	}
	
}

