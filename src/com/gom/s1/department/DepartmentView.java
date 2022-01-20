package com.gom.s1.department;

import java.util.List;

public class DepartmentView {

	public void view(List<DepartmentDTO> a) {
		for(int i =0;i<a.size();i++) {
		//	System.out.print(a.get(i).getDepartment_name()+"\t");
			System.out.print(a.get(i).getDepartment_isd()+"\t");
		//	System.out.print(a.get(i).getManager_id()+"\t");
		//	System.out.println(a.get(i).getLocation_id()+"\t");
			System.out.println("===========================");	
		}
	}	
}
