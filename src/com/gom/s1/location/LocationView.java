package com.gom.s1.location;

import java.util.List;

public class LocationView {

	public void view(List<LocationDTO> a) {
		LocationDAO ao = new LocationDAO();
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i).getLocation_id() + "\t");
			System.out.print(a.get(i).getStreet_address() + "\t");
			System.out.print(a.get(i).getPostal_code() + "\t");
			System.out.print(a.get(i).getCity() + "\t");
			System.out.print(a.get(i).getState_province() + "\t");
			System.out.println(a.get(i).getCountry_id() + "\t");
			System.out.println("=============================");
		}
	}

	public void view(LocationDTO lDTO) {

		System.out.print(lDTO.getLocation_id() + "\t");
		System.out.print(lDTO.getStreet_address() + "\t");
		System.out.print(lDTO.getPostal_code() + "\t");
		System.out.print(lDTO.getCity() + "\t");
		System.out.print(lDTO.getState_province() + "\t");
		System.out.println(lDTO.getCountry_id() + "\t");
		System.out.println("=============================");

	}

}
