package prac3;

public class Test3 extends Sales{
	
	int amount; //품목에 대한 총액
	
	@Override
	public void input() {
		super.input();
	}
	
	void setProcess() {
		amount = getQty()*getCost();
	}
	void getDisplay() {
		System.out.println(getArticle()+"\t"+ (int)(amount-(amount*getDiscount()))+"원");
	}

}
