package com.dao;

public class Exam1 {
	public static void main(String[] args) {
		try {
			//Class. = 프로젝트 안에 특정 클래스가 등록되어있는지 검사한다
			//만일, 클래스가 없으면 예외를 발생시킨다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			e.printStackTrace();
		}
	}
}
