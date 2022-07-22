package Army;

public class Army extends Unit{
	//생성자
	public Army(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(getName()+">>지상 공격 실행함");
	}

	public void tank() {
		System.out.println(getName()+">>탱크 공격");
	}
}
