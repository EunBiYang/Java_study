package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertTest{
	//1. 드라이버 등록확인
	public InsertTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			e.printStackTrace();
		}
	}
	
	
	//2. connection : DB에 접속하는 함수
	//Connection class 는 Oracle DB와의 커넥션을 관리하는 클래스
	public Connection getConnecton() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 디비 접속 주소
		String username = "C##dbexam";	//계정명
		String password = "m1234";		//계정 비밀 번호
		try {
			//oracle DB와 접속을 시도하고, 성공하면 Connection 객체를 리턴함
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	//3. SQL 작업처리 함수
	public int insertArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble(); 
		
		//DB처리
		String sql = "insert into dbtest values(?, ?, ?, sysdate)";
		int result = 0;
		
		Connection conn = getConnecton();
		PreparedStatement pstmt = null; //DB와 데이터를 주고받는 보조 스트림 클래스 위에 ???가 가능한 이유
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);//앞에 1,2,3숫자는 위에 ?의 index number
			
			result = pstmt.executeUpdate();
			//pstmt.executeUpdate()의 역활
			//1.db에 sql을 실행하라고 요정함
			//2.응답을 기다림
			//3.db로부터 응답이 오면 ,그값을 리턴함
			//4.리턴받은 값을 result에 저장함(sql에서 행삽입하면"1 행 이(가) 삽입되었습니다."뜨는것중에 앞에 1을 리턴 받아 저장)
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}


//메인
public class Exam2 {
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		
		int result = it.insertArticle();
		if(result > 0) System.out.println("저장 성공");
		else System.out.println("");
	}

}


















