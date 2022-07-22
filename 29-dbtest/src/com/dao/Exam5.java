package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//delete dbtest where name = '김길동'
class DeleteTest {
	// 1.드라이버 등록작업
	public DeleteTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공!>0<");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패! ㅠ0ㅠ");
			e.printStackTrace();
		}
	}

	// 2. Connection
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

	// 3. sql 처리
	public int DeleteArticle() {

		// 이름입력
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름 : ");
		String name = sc.next();

		int result = 0;
		String sql = "delete dbtest where name = ?";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}

public class Exam5 {
	public static void main(String[] args) {
		DeleteTest dt = new DeleteTest();

		int result = dt.DeleteArticle();
		if (result > 0)
			System.out.println("삭제 성공!>0<");
		else
			System.out.println("삭제 실패 ㅠ0ㅠ!");

	}

}
