
public interface Practice3 {
	public static void main(String[] args) {
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		System.out.println("이름 = "+name);
		System.out.printf("부서 = %s\n",department);
		System.out.print("직위 = "+position+"\n급여 = "+sal+"원\n");
		System.out.printf("급여 : %,d원", sal);  //천단위 구분기호
		

	}

}

