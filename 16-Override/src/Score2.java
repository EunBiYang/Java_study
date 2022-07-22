
public class Score2 extends Score {
	int mus, com;

	public Score2(String name, int kor, int eng, int mat,int mus,int com) {
		super(name, kor, eng, mat);
		this.mus = mus;
		this.com = com;
	}
	
	@Override
	public int calc_tot() {
		tot = super.calc_tot() + mus + com;
		return tot;
	}
	
	@Override
	public double calc_avg() {
		avg = (double)tot/5;
		return avg;
	}

}
