package com.gom.s1.start;


import java.util.ArrayList;
import java.util.List;

import com.gom.s1.department.DepartmentDAO;
import com.gom.s1.department.DepartmentDTO;
import com.gom.s1.department.DepartmentView;
import com.gom.s1.location.LocationDAO;
import com.gom.s1.location.LocationDTO;
import com.gom.s1.location.LocationView;
import com.gom.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {		
		System.out.println("DB 연동 테스트 시작");
		
		//location start
		LocationDAO lDAO = new LocationDAO();
		LocationView lView = new LocationView();
		List<LocationDTO> a;
		try {
			a = lDAO.getList();
			lView.view(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//department start
		DepartmentDAO ao = new DepartmentDAO();
		DepartmentView departmentView = new DepartmentView();
		DepartmentDTO dDTO = new DepartmentDTO();

		try {
			List<DepartmentDTO> b = ao.getList();
			departmentView.view(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("DB 연동 테스트 끝");		
	}

}
