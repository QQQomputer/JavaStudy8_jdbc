package com.gom.s1.department;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {

	private DepartmentDAO departmentDAO;
	private DepartmentView departmentView;
	private Scanner sc;
		
	
	
	public DepartmentController() {
		
		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
		sc = new Scanner(System.in);
		
	}

	
	public void start() {
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 번호  검색");
			System.out.println("3. 나   가   기 ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("1. 부서 리스트 출력을 선택하셨습니다.");
				List<DepartmentDTO> ar = departmentDAO.getList();
				departmentView.view(ar);				
				break;
			case 2:
				System.out.println("2. 부서 번호 검색을 선택하셨습니다.");
				System.out.println("검색할 부서 번호 입력");
				DepartmentDTO departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_id(sc.nextInt());
				departmentDTO = departmentDAO.getOne(departmentDTO);
				departmentView.view(departmentDTO);				
				break;
			case 3:
				System.out.println("3. 나가기를 선택하셨습니다.");
				flag=false;
				break;
			}
			
			
			
			
			
			
			
			
		}
	}
	
	
	
}

