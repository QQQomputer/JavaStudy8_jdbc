package com.gom.s1.region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.gom.s1.util.DBConnector;

public class RegionInput {

	DBConnector dbConnector = new DBConnector();
	Scanner sc = new Scanner(System.in);
	
	//대륙정보 삭제 setDelete
	public RegionDTO setDelete() throws Exception {
		
		RegionDTO regionDTO = new RegionDTO();
		System.out.println("삭제할 Region_ID 입력");
		regionDTO.setRegion_id(sc.nextInt());
		//regionDTO.setRegion_name(sc.next());
				
		return regionDTO;
	}
	
	
	
	
	
	//대륙정보 추가
	public RegionDTO setInsert() throws Exception {
		
		RegionDTO regionDTO = new RegionDTO();		
		System.out.println("Region ID를 입력");
		regionDTO.setRegion_id(sc.nextLong());
		System.out.println("Region Name을 입력");
		regionDTO.setRegion_name(sc.next());	
		
		return regionDTO;
		
	}
	
	public RegionDTO setUpdate() throws Exception {		
		RegionDTO regionDTO = new RegionDTO();		
		System.out.println("Region ID를 입력");
		regionDTO.setRegion_id(sc.nextLong());
		System.out.println("Region Name을 입력");
		regionDTO.setRegion_name(sc.next());	
		
		return regionDTO;
		
	}
}
