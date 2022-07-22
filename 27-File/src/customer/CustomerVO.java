package customer;

import java.io.Serializable;

public class CustomerVO implements Serializable{
	//고객번호, 이름, 전화 =>문자열로
	private String cnum,cname,ctel;
	

	@Override
	   public String toString() {
	      if (cnum == null || cname == null || ctel == null) return null;
	      String str = String.format("%s\t%s\t%s", cnum, cname, ctel);
	      return str;
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
