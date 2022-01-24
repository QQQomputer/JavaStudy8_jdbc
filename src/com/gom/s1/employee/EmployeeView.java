package com.gom.s1.employee;

import java.util.List;

public class EmployeeView {

	public void view(EmployeeDTO eDTO) {
		System.out.print(eDTO.getEmployee_id() + "\t");
		System.out.print(eDTO.getFirst_name() + "\t");
		System.out.print(eDTO.getLast_name() + "\t");
		System.out.print(eDTO.getEmail() + "\t");
		System.out.print(eDTO.getPhone_number() + "\t");
		System.out.print(eDTO.getHire_date() + "\t");
		System.out.print(eDTO.getJob_id() + "\t");
		System.out.print(eDTO.getSalary() + "\t");
		System.out.print(eDTO.getCommission_pct() + "\t");
		System.out.print(eDTO.getManager_id() + "\t");
		System.out.print(eDTO.getDepartment_id() + "\t");
		System.out.println("===========================");
	}

	public void view(List<EmployeeDTO> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i).getEmployee_id() + "\t");
			System.out.print(a.get(i).getFirst_name() + "\t");
			System.out.print(a.get(i).getLast_name() + "\t");
			System.out.print(a.get(i).getEmail() + "\t");
			System.out.print(a.get(i).getPhone_number() + "\t");
			System.out.print(a.get(i).getHire_date() + "\t");
			System.out.print(a.get(i).getJob_id() + "\t");
			System.out.print(a.get(i).getSalary() + "\t");
			System.out.print(a.get(i).getCommission_pct() + "\t");
			System.out.print(a.get(i).getManager_id() + "\t");
			System.out.println(a.get(i).getDepartment_id() + "\t");
			System.out.println("===========================");
		}
	}
}
