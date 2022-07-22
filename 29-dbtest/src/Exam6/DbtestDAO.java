package Exam6;
//DB처리 클래스

//DAO : Data Access Object

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbtestDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// 1. Driver 등록 확인
	public DbtestDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. 접속하기 함수
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##dbexam";
		String password = "m1234";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 3.접속 끊기
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 4. sql 처리
	// 1)insert
	public int insert(DbtestDTO dto) {
		int result = 0;
		String sql = "insert into dbtest values(?, ?, ?, sysdate)";

		conn = getConnection();
		try {// 물음표의 갯수에 맞게 셋팅 해주면 된다
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setDouble(3, dto.getHeight());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();// 함수로 만들어 놨기때문에 호출만 해줌됨!
		}
		return result;
	}

	// 2)select
	// 2-1)전체 데이터
	public List<DbtestDTO> selectAll() {
		List<DbtestDTO> list = new ArrayList<DbtestDTO>();
		String sql = "select * from dbtest";

		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DbtestDTO dto = new DbtestDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getDouble("height"));
				dto.setLogtime(rs.getString("logtime"));
				// 리스트에 저장
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 2-2)한명 데이터
	public DbtestDTO selectOne(String name) {
		DbtestDTO dto = null;
		String sql = "select *from dbtest where name= ?";

		conn = getConnection();//서버랑 접속
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery(); 
			if (rs.next()) {
				dto = new DbtestDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getDouble("height"));
				dto.setLogtime(rs.getString("logtime"));
				// 한명 데이터이기때문에 리스트 필요없음
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		// 검색한 데이터가 없으면 여기서 null을 리턴받는다
		return dto;
	}

	// 3)update
	public int update(int age, String name) {
		int result = 0;
		String sql = "update dbtest set age = ? where name =?";//미완성된 SQL문

		conn = getConnection();		//DB서버에 접속시도 성공하면 Connection 객체 리턴
		try {
			//Connection 객체가 SQL상태를 준비하고, 준비가 다 되면 PraparedStatement 객체 리턴
			pstmt = conn.prepareStatement(sql); //미완성된 SQL문을 사용할 준비 완료!
			pstmt.setInt(1, age);
			pstmt.setString(2, name);//위에 불러온 미완성 SQL완성!
			result = pstmt.executeUpdate();
			//executeUpdate() 3가지 동작
			//1.DB서버에게 완성시킨 SQL문 실행 요청
			//2.응답대기
			//3.응답 온 데이터 처리
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// 4)delete
	public int delete(String name) {
		int result = 0;
		String sql = "delete dbtest where name = ?";

		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

}
