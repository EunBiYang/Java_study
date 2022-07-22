package customer;

public class CustomerVO {
	//고객번호, 이름, 전화 =>문자열로
	private String cnum,cname,ctel;
	
	

	@Override
	public String toString() {
		return cnum +"\t"+ cname + "\t"+ ctel;
	}

	public String getCnum() {
		return cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtel() {
		return ctel;
	}

	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	
	
	

}
