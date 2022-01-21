package com.gom.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gom.s1.util.DBConnector;

public class LocationDAO {

	private DBConnector dbc;

	public LocationDAO() {
		dbc = new DBConnector();
	}

	public List<LocationDTO> getList() throws Exception {
		ArrayList<LocationDTO> a = new ArrayList<>();
		// 1. DB에 로그인
		// 2. Sql Query문 작성
		// 3. Query문 미리 전송
		// 4. ? 세팅 통과
		// 5. 최정 전송 후 결과 처리
		// 6. 자원 해제

		Connection con = dbc.getConnect();

		String sql = "SELECT * FROM LOCATIONS";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			LocationDTO lDTO = new LocationDTO();
			lDTO.setLocation_id(rs.getInt("location_id"));
			lDTO.setStreet_address(rs.getString("street_address"));
			lDTO.setPostal_code(rs.getString("postal_code"));
			lDTO.setCity(rs.getString("city"));
			lDTO.setState_province(rs.getString("state_province"));
			lDTO.setCountry_id(rs.getString("country_id"));
			a.add(lDTO);
		}
		rs.close();
		st.close();
		con.close();
		return a;
	}
}
