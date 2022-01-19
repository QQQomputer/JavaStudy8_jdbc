package com.gom.s1.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gom.s1.util.DBConnector;

public class DepartmentDAO {

	//DAO: Data Access Object 데이터베이스에 로그인해서데이터를 주고받는 애들
	
	private DBConnector dbConnector;
	
	public DepartmentDAO() {
		dbConnector = new DBConnector();
	}
		
	public List<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> a = new ArrayList();
		
		//SELECT * FROM DEPARTMENTS;
		//1. DB로그인
		Connection con = dbConnector.getConnect();
		
		//2. SQL Query 문 작성
		// java에서는 ; 제외
		String sql = "SELECT * FROM DEPARTMENTS";
		
		//3. 작성한 SQL Query 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ?값을 세팅, 없으면 통과, 나중에 해줌
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		
		//cursor가 한줄 읽는 메서드 next() 리턴은 데이터가 있으면 true, 없으면 false
		while(rs.next()) {
			DepartmentDTO dDTO = new DepartmentDTO();
			dDTO.setDepartment_name(rs.getString("department_name"));
			dDTO.setDepartment_id(rs.getInt("department_id"));			
			dDTO.setManager_id(rs.getInt("manager_id"));			
			dDTO.setLocation_id(rs.getInt("location_id"));	
			a.add(dDTO);
		}
		
		//6. 외부 연결 해제
		// 연결된 순서의 역순, 닫아 줘야 다른 사람도 쓸 수 있음
		rs.close();
		st.close();
		con.close();	
		return a;
	}
	
}
