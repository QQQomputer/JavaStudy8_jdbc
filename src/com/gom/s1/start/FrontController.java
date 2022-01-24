package com.gom.s1.start;

import java.util.Scanner;

import com.gom.s1.department.DepartmentController;
import com.gom.s1.employee.EmployeeController;
import com.gom.s1.location.LocationController;

public class FrontController {

	private Scanner sc;
	private DepartmentController dc = null;
	private LocationController lc = null;
	private EmployeeController ec = null;

	public FrontController() {
		dc = new DepartmentController();
		lc = new LocationController();
		ec = new EmployeeController();
		sc = new Scanner(System.in);
	}

	public void mainStart() throws Exception {
		boolean flag = true;

		while (flag) {

			System.out.println("1. 직원 관리");// EMPLOYEES
			System.out.println("2. 부서 관리");// DEPARTMENTS
			System.out.println("3. 지역 관리");// LOCATIONS
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("1. 직원 관리 를 선택하셨습니다.");
				ec.estart();
				break;
			case 2:
				System.out.println("2. 부서 관리 를 선택하셨습니다.");
				dc.dstart();
				break;
			case 3:
				System.out.println("3. 지역 관리 를 선택하셨습니다.");
				lc.lstart();
				break;
			case 4:
				System.out.println("4. 프로그램 종료 를 선택하셨습니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
