package school;
//JDBC 처리

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// 1. Driver 등록 확인
	public SchoolDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			e.printStackTrace();
		}
	}

	// 2. 접속하기 함수
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##dbexam";
		String password = "m1234";

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("접속실패");
			e.printStackTrace();
		}
		return conn;
	}

	// 3.접속 닫기
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

	// 4. SQL 처리
	// 1)insert
	public int insert(SchoolDTO dto) {
		int result = 0;
		String sql = "insert into school values(?,?,?)";

		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getValue());
			pstmt.setInt(3, dto.getCode());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert 실패");
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// 2)select
	// 2-1)전체 데이터
	public List<SchoolDTO> selectAll() {
		List<SchoolDTO> list = new ArrayList<SchoolDTO>();
		String sql = "select * from school";

		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				SchoolDTO dto = new SchoolDTO();
				dto.setName(rs.getString("name"));
				dto.setValue(rs.getString("value"));
				dto.setCode(rs.getInt("code"));
				// 리스트에 저장
				list.add(dto);
				
			}
		} catch (SQLException e) {
			System.out.println("selectAll 실패");
			e.printStackTrace();
		}
		return list;
	}

	// 2-2)한명 데이터
	public List<SchoolDTO> selectOne(String name) {
		List<SchoolDTO> list = new ArrayList<SchoolDTO>();
		String sql = "select * from school where name like ?";

		conn = getConnection();// 서버랑 접속
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				SchoolDTO dto = new SchoolDTO();
				dto.setName(rs.getString("name"));
				dto.setValue(rs.getString("value"));
				dto.setCode(rs.getInt("code"));
				// 리스트에 저장
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("selectOne 실패");
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	// 3)delete
	public int delete(String name) {
		int result = 0;
		String sql = "delete school where name =?";

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
