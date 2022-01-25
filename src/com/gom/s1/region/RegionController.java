package com.gom.s1.region;

import java.util.Scanner;

public class RegionController {

	private Scanner sc;
	private RegionInput regionInput;
	
	public RegionController() {
		sc= new Scanner(System.in);
		regionInput= new RegionInput();
		
		
	}
	boolean flag = true;
	
	
	public void rstart() throws Exception {
		
		RegionDAO regionDAO = new RegionDAO();
		RegionView regionView = new RegionView();

		while(flag) {
			
			System.out.println("1. Region 추가");
			System.out.println("2. Region 수정");
			System.out.println("3. Region 삭제");
			System.out.println("4. 프로그램 종료");
		
			int select = sc.nextInt();
			
			RegionDTO regionDTO=null;
			int result=0;
			String message=null;
			switch(select) {
			case 1:
				regionDTO = regionInput.setInsert();
				result = regionDAO.setInsert(regionDTO);
				message="Fail";
				if(result>0) {
					message="Success";
				}
				regionView.view(message);
				break;
			case 2:				
				regionDTO = regionInput.setInsert();
				result = regionDAO.setUpdate(regionDTO);
				message = "Update Success";
				if(result>0) {
					message="Update Success";
				}
				regionView.view(message);
				break;
			case 3:
				regionDTO = regionInput.setDelete();
				result = regionDAO.setDelete(regionDTO);
				message = "Delete Fail";
				if(result>0) {
					message="Delete Success";
				}
				regionView.view(message);
				break;
			default:
				flag=false;			
			}
		
		}
		
	}
	
	
	
	
	
	

	
	
	
	
	
}
