package com.gom.s1.start;

import java.util.Scanner;

import com.gom.s1.department.DepartmentController;
import com.gom.s1.employee.EmployeeController;
import com.gom.s1.location.LocationController;
import com.gom.s1.region.RegionController;

public class FrontController {

	private Scanner sc;
	private DepartmentController dc = null;
	private LocationController lc = null;
	private EmployeeController ec = null;
	private RegionController rc = null;

	public FrontController() {
		sc = new Scanner(System.in);
		//직원
		ec = new EmployeeController();		
		//부서
		dc = new DepartmentController();
		//지역
		lc = new LocationController();
		//대륙
		rc = new RegionController();
	
	}

	public void mainStart() throws Exception {
		boolean flag = true;

		while (flag) {

			System.out.println("1. 직원 관리");// EMPLOYEES
			System.out.println("2. 부서 관리");// DEPARTMENTS
			System.out.println("3. 지역 관리");// LOCATIONS
			System.out.println("4. 대륙 관리");// REGIONS
			System.out.println("5. 프로그램 종료");
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
				System.out.println("4. 대륙 관리 를 선택하셨습니다.");
				rc.rstart();
				break;
			case 5:
				System.out.println("5. 프로그램 종료 를 선택하셨습니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
