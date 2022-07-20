package prac1;

public class ScoreTable {
	private String name;
	private int sol;	//맞은수
	private static int s;	//배점(20)
	private int score;		//점수 = 맞은*배점
	//생성자호출
	public ScoreTable() {}
	public ScoreTable(String name, int sol) {
		this.name = name;
		this.sol = sol;
	}
	//맴버함수
	public void calcScore() {
		score = sol*s;
	}
	public void printView() {
			System.out.println(name+"\t"+score);		
	}
//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSol() {
		return sol;
	}
	public void setSol(int sol) {
		this.sol = sol;
	}
	public static int getS() {
		return s;
	}
	public static void setS(int s) {
		ScoreTable.s = s;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
