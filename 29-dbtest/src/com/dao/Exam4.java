package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class UpdateTest {
	// 1.드라이버 등록작업
	public UpdateTest() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2.Connection
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

	// 3. sql처리
	public int updateArticle() {

		// 이름입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();

		int result = 0;
		String sql = "update dbtest set age = age+1 where name = ?";

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

public class Exam4 {
	public static void main(String[] args) {
		UpdateTest updateTest = new UpdateTest();

		int result = updateTest.updateArticle();
		if (result > 0)
			System.out.println("수정성공!");
		else
			System.out.println("수정실패");
	}

}
