package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class SelectTest{
	//1.드라이버 등록 확인
	public SelectTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//2.Connection 객체 생성 : DB접속
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String username = "C##dbexam";	
		String password = "m1234";
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	//3.SQL 처리
	public void selectArticle() {
		String sql = "select * from dbtest";
		
		//DB연결>보조프로그램실행>결과저장할 공간만들기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				String logtime = rs.getString("logtime");
				
				System.out.println(name+"\t"+age+"\t"+height+"\t"+logtime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Exam3 {
	public static void main(String[] args) {
		SelectTest selectTest = new SelectTest();
		
		selectTest.selectArticle();
	}
}









