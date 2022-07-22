package score;
//인터페이스의 용도
//1. 상속받는 자식클레스에게 강제적으로 함수를 만들게 함
//2. 목차의 역활
public interface Score {
	public void input();		//입력기능
	public void print();		//출력기능
	public void printTitle();	//제목 출력
	public void searchHak();	//학점 검색
	public void searchName();	//이름 검색
	public void descSortTot();	//총점기준 내림차순 정렬
	public void ascSortHak();	//학번기준 오름차순 정렬
	public void file_write();		//파일쓰기
	public void file_read();			//파일 읽기

}
