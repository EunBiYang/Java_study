package prac1;

public class Practice1 {
	public static void main(String[] args) {
		ScoreTable[] st = new ScoreTable[3];
		//입력
		st[0] = new ScoreTable("민들래",5);
		st[1] = new ScoreTable("진달래",3);
		st[2] = new ScoreTable("개나리",0);
		
		//배점입력
		ScoreTable.setS(20);
		
		//연산&출력
		System.out.println("이름\t점수");
		System.out.println("-------------");
		for(int i=0; i<3;i++) {
			st[i].calcScore();
			st[i].printView();
		}
	}

}
