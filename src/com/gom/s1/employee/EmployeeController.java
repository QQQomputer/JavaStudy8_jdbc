package com.gom.s1.employee;

import java.util.List;
import java.util.Scanner;

import com.gom.s1.department.DepartmentDTO;

public class EmployeeController {

	private EmployeeDAO eDAO;
	private EmployeeView eView;
	private Scanner sc;

	public EmployeeController() {
		eDAO = new EmployeeDAO();
		eView = new EmployeeView();
		sc = new Scanner(System.in);
	}

	public void estart() throws Exception {
		boolean flag = true;

		while (flag) {
			System.out.println("1. 사원 리스트 출력");
			System.out.println("2. 사원 번호  검색");
			System.out.println("3. 나   가   기 ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("1. 사원 리스트 출력을 선택하셨습니다.");
				List<EmployeeDTO> a = eDAO.getList();
				eView.view(a);
				break;
			case 2:
				System.out.println("2. 사원 번호 검색을 선택하셨습니다.");
				System.out.println("검색할 사원 번호 입력");
				EmployeeDTO eDTO = new EmployeeDTO();
				eDTO.setEmployee_id(sc.nextInt());
				eDTO = eDAO.getOne(eDTO);
				eView.view(eDTO);
				break;
			case 3:
				System.out.println("3. 나가기를 선택하셨습니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
