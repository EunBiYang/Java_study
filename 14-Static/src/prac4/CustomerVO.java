package prac4;

public class CustomerVO {
	private String cnumber;
	private String cname;
	private String ctel;
	
	public CustomerVO() {}

	@Override
	public String toString() {
		return cnumber +"\t"+ cname + "\t" + ctel;
	}


	public String getCnumber() {
		return cnumber;
	}

	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
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
