import java.util.Scanner;

class Score{
	int num;
	String name;
	int kor, eng, mat, tot, avg;
	
	void set1() {		//void set1(Score this)
		System.out.println("this = "+this);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번 : ");
		this.num = sc.nextInt();
		System.out.print("이름 : ");
		this.name = sc.next();
		System.out.print("국어 : ");
		this.kor = sc.nextInt();
		System.out.print("영어 : ");
		this.eng = sc.nextInt();
		System.out.print("수학 : ");
		this.mat = sc.nextInt();
		
		this.tot = this.kor + this.eng+ this.mat;
		this.avg = this.tot /3;
	}
	
	void set2() {		//void set2(Score this)
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 : ");
		num = sc.nextInt();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot /3;
	}
	
	void print_title() {		//void print_title(Score this)
		System.out.println(this);
		System.out.println("*** 성적 출력 ***");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
	}
	void print() { 		//void print(Score this)
		System.out.println(this);
		System.out.println(this.num + "\t" +this.name+"\t"
				+ this.kor+ "\t" +this.eng+ "\t" +this.mat+ "\t"+
				this.tot+ "\t" +this.avg);
	}
}

public class Exam6 {
	public static void main(String[] args) {
		Score s1 = new Score();
		Score s2 = new Score();
		System.out.println("s1 = "+s1+ ", s2 = "+s2);
	
		s1.set2();
		s2.set2();
		s1.print_title();
		s1.print();
		s2.print();
				
	}

}
















