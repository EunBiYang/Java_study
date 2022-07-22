package Exam2;

public class FileArticle extends Article{
	private String fileName;

	@Override
	public String toString() {
		return "자료실 [첨부파일=" + fileName + ", 번호=" + getNum() + ", 제목="+ getTitle() + "]";
	}
	//getter setter
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

}
