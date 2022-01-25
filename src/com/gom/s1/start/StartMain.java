package com.gom.s1.start;

import java.util.Scanner;

import com.gom.s1.region.RegionDAO;
import com.gom.s1.region.RegionDTO;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
		Scanner sc = new Scanner(System.in);

		FrontController fc = new FrontController();
		try {
			//fc.mainStart();
			RegionDAO regionDAO = new RegionDAO();
			RegionDTO regionDTO = new RegionDTO();
//			regionDTO.setRegion_id(6L);
//			regionDTO.setRegion_name("South Pole");
			regionDTO.setRegion_id(6L);
			regionDTO.setRegion_name("South Pole");			
			
//			int result = regionDAO.setInsert(regionDTO);
			int result = regionDAO.setDelete(regionDTO);
			
			if(result > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("DB 연동 테스트 끝");
	}

}
