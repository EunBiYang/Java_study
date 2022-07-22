
public abstract class Unit {
	private String name;
	
	public Unit(String name) {
		this.name = name;
	}

	//자식 클래스들이 재정의 할 매소드를 abstract 매소드로 명시
	public abstract void attack();
	public abstract void move();
	
	
	//g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
