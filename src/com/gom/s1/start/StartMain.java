package com.gom.s1.start;

import java.util.Scanner;

import com.gom.s1.comparison.DepartMentController;
import com.gom.s1.department.DepartmentController;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
		Scanner sc = new Scanner(System.in);

		// location start
//		LocationDAO lDAO = new LocationDAO();
//		LocationView lView = new LocationView();
//		List<LocationDTO> a;
//		try {
//			a = lDAO.getList();
//			lView.view(a);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// department start
//		DepartmentDAO ao = new DepartmentDAO();
//		DepartmentView departmentView = new DepartmentView();
//		DepartmentDTO dDTO = new DepartmentDTO();
//		int input = sc.nextInt();		
//		try {
//			List<DepartmentDTO> b = ao.getList();
//			departmentView.view(b);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		

		// department getone version
//		DepartmentDAO ao = new DepartmentDAO();
//		DepartmentView departmentView = new DepartmentView();
//		DepartmentDTO dDTO = new DepartmentDTO();		
//		dDTO.setDepartment_id(20);
//		try {
//			dDTO = ao.getOne(dDTO);
//			departmentView.view(dDTO);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();			
//		}	
//		System.out.println("DB 연동 테스트 끝");		

		DepartmentController dc=null;
		try {
			dc = new DepartmentController();
			dc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


//		FrontController fc= new FrontController();
//		fc.mainStart();

	}

}
