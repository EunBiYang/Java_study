
public class Character implements Action, Move, Fight {  //자바에서 implements만은 다중상속가능하다.
	private String name;
	
	public Character(String name) {
		this.name = name;
	}
	
	@Override
	public void attact() {
		System.out.println(name+" >> 공격");
	}

	@Override
	public void shield() {
		System.out.println(name+" >> 방어");
	}

	@Override
	public void walk() {
		System.out.println(name+" >> 걷다");
	}

	@Override
	public void run() {
		System.out.println(name+" >> 뛰다");
	}

	@Override
	public void jump() {
		System.out.println(name+" >> 점프");		
	}

	@Override
	public void pickup() {
		System.out.println(name+" >> 아이템을 줍다");
	}

}
