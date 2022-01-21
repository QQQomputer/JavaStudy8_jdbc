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
	public DepartmentDTO getOne(DepartmentDTO dep) throws Exception {
		DepartmentDTO dDTO =null;
		//1. DB에 로그인
		Connection con = dbConnector.getConnect();
		//2. Sql Query문 작성
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 세팅 통과
		//st.set데이터타입(int index, 값);
		//index는 ?의 순서번호
		//그러나 oracle은 1번부터 시작
		st.setInt(1, dep.getDepartment_id());		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dDTO = new DepartmentDTO();
			dDTO.setDepartment_id(rs.getInt("department_id"));
			dDTO.setDepartment_name(rs.getString("department_name"));
			dDTO.setManager_id(rs.getInt("manager_id") );
			dDTO.setLocation_id(rs.getInt("location_id"));
		}		
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();		
		return dDTO;
	}
	
	
	public List<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> a = new ArrayList();
		
		//SELECT * FROM DEPARTMENTS;
		//1. DB로그인
		Connection con = dbConnector.getConnect();
		
		//2. SQL Query 문 작성
		// java에서는 ; 제외						+department_id	 방법 구식 인젝션 문제 보안에 취약
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
