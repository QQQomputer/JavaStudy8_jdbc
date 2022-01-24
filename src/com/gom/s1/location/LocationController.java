package com.gom.s1.location;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class LocationController {

	private BufferedReader br;
	private LocationDAO lDAO;
	private LocationView lView;

	public LocationController() {
		br = new BufferedReader(new InputStreamReader(System.in));
		lDAO = new LocationDAO();
		lView = new LocationView();
	}

	boolean flag = true;

	public void lstart() throws Exception {

		while (flag) {

			System.out.println("1. 지역 리스트 출력");
			System.out.println("2. 지역 번호  검색");
			System.out.println("3. 나   가   기 ");
			int select = Integer.parseInt(br.readLine());

			switch (select) {
			case 1:
				System.out.println("1. 지역 리스트 출력을 선택하셨습니다.");
				List<LocationDTO> a = lDAO.getList();
				lView.view(a);
				break;
			case 2:
				System.out.println("2. 지역 번호 검색을 선택하셨습니다.");
				System.out.println("검색할 지역 번호 입력");
				LocationDTO lDTO = new LocationDTO();
				lDTO.setLocation_id(Integer.parseInt(br.readLine()));
				lView.view(lDAO.getOne(lDTO));
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
