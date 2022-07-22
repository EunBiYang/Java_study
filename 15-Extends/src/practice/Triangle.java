package practice;

public class Triangle  extends Area{
	
    public Triangle() {
		super();
	}

	public double getArea() {
    	return getBase() * getHeight() / 2;
    }
}