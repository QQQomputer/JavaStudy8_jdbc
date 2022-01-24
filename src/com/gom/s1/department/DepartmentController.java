package com.gom.s1.department;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {

	private DepartmentDAO dDAO;
	private DepartmentView dView;
	private Scanner sc;

	public DepartmentController() {
		dDAO = new DepartmentDAO();
		dView = new DepartmentView();
		sc = new Scanner(System.in);
	}

	public void dstart() throws Exception {
		boolean flag = true;

		while (flag) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 번호  검색");
			System.out.println("3. 나   가   기 ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("1. 부서 리스트 출력을 선택하셨습니다.");
				List<DepartmentDTO> a = dDAO.getList();
				dView.view(a);
				break;
			case 2:
				System.out.println("2. 부서 번호 검색을 선택하셨습니다.");
				System.out.println("검색할 부서 번호 입력");
				DepartmentDTO dDTO = new DepartmentDTO();
				dDTO.setDepartment_id(sc.nextInt());
				dDTO = dDAO.getOne(dDTO);
				dView.view(dDTO);
				break;
			case 3:
				System.out.println("3. 나가기를 선택하셨습니다.");
				flag = false;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
