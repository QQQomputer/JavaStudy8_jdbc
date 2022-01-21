package com.gom.s1.start;

import java.util.Scanner;

public class FrontController {

	private Scanner sc;
//	private DepartmentController departMentController=null;
	// LocationController
	// EmployeeController

	public FrontController() {
		sc = new Scanner(System.in);
	}

	public void mainStart() {
		boolean flag = true;

		while (flag) {

			System.out.println("1. 직원 관리");// EMPLOYEES
			System.out.println("2. 부서 관리");// DEPARTMENTS
			System.out.println("3. 지역 관리");// LOCATIONS
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}

		}

	}

}
