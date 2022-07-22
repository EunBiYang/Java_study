package school;

//Java Beans
public class SchoolDTO {
	private String name;
	private String value;
	private int code; // 1이면 학생, 2이면 교수, 3이면 관리자

	public SchoolDTO() {
	}

	public SchoolDTO(String name, String value, int code) {
		super();
		this.name = name;
		this.value = value;
		this.code = code;
	}
	public String toString() {
	      String strVal = "";
	      if(code==1) strVal = "학번";
	      else if(code==2) strVal = "과목";
	      else if(code==3) strVal = "부서";
	      String str = String.format("이름=%s\t%s=%s", name, strVal, value);
	      return str;
	   }


	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
