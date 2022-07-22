package practice;
public class Rectangle extends Area {
	public Rectangle() {
		super();		//부모 클래스 생성자 호출
	}
	
	public double getArea() {
		return getBase() * getHeight();
	}
	@Override
	public String toString() {
		return "Rectangle [getArea()=" + getArea() + ", getBase()=" + getBase() + ", getHeight()=" + getHeight()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
