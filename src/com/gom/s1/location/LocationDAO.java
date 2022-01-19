package com.gom.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gom.s1.util.DBConnector;

public class LocationDAO {

	private DBConnector dbc;
	
	public LocationDAO(){
		dbc = new DBConnector();
	}
	
	public void getList() throws Exception {
		//1. DB에 로그인
		//2. Sql Query문 작성
		//3. Query문 미리 전송
		//4. ? 세팅 통과
		//5. 최정 전송 후 결과 처리
		//6. 자원 해제
		
		Connection con = dbc.getConnect();
		
		String sql = "SELECT * FROM LOCATIONS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			LocationDTO lDTO= new LocationDTO();
			lDTO.setLocation_id(rs.getInt("location_id"));
			//street, postal, city, state, county
		}
		
	}
	
	
	
}
