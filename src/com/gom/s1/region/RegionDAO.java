package com.gom.s1.region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gom.s1.util.DBConnector;

public class RegionDAO {

	private DBConnector dbConnector;
	
	public RegionDAO() {
		dbConnector = new DBConnector();
	}
	
	
	//INSERT, DELETE
	public int insert(RegionDTO regionDTO) throws Exception{
		
		Connection con = dbConnector.getConnect();
		
		String sql = "INSERT INTO REGIONS (REGION_ID, REGION_NAME)"
					+ "VALUES (REGIONS_SEQ.NEXTVAL, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, regionDTO.getRegion_name());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
				
		return result;							
	}
	
	
	public int delete(RegionDTO regionDTO) throws Exception{
		
		Connection con = dbConnector.getConnect();
		
		String sql = "DELETE REGIONS WHERE REGION_ID =REGIONS_SEQ.NEXTVAL";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, regionDTO.getRegion_name());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
				
		return result;							
	}
	
	//대륙정보 수정 setUpdate
	public int setUpdate(RegionDTO regionDTO) throws Exception{
		
		Connection con = dbConnector.getConnect();
		
		String sql = "UPDATE REGIONS SET REGION_NAME= ? WHERE REGION_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, regionDTO.getRegion_name());
		st.setLong(2, regionDTO.getRegion_id());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
				
		return result;							
	}
	
	
	
	
	//대륙정보 삭제 setDelete
	public int setDelete(RegionDTO regionDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		
		String sql = "DELETE REGIONS WHERE REGION_ID= ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, regionDTO.getRegion_id());
		
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
				
		return result;
	}
	
	
	//대륙정보 추가
	public int setInsert(RegionDTO regionDTO) throws Exception {
		//1. DB 연결
		Connection con = dbConnector.getConnect();
		
		//java는 기본으로 auto commit 임
		//auto commit 해제
		//con.setAutoCommit(false);
		
		
		//2. SQL Query문 생성
		String sql = "INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES(?,?)";
///				+ "VALUES((SELECT MAX(REGION_ID) FROM REGIONS)+1, 'NORTH POLE')";
				
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 세팅
		st.setLong(1, regionDTO.getRegion_id());
		st.setString(2, regionDTO.getRegion_name());
		//5. 최종 전송 후 결과 처리
		int result = st.executeUpdate();
		
		//auto commit 으로 재설정
		//con.setAutoCommit(true);
		
		//6. 자원 해제
		st.close();
		con.close();
		
		return result;
		
	}
	
	//검색조회
	//전체조회
	
	
}
