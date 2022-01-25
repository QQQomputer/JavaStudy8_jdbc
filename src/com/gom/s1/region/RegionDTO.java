package com.gom.s1.region;

public class RegionDTO {

	//DTO 기본
	//멤버변수의 접근지정자는 모두 private
	//Setter와 Getter는 모두 생성
	//멤버변수의 Datatype과 변수명은 Table의 컬럼과 일치
	
	//생성자는 여러개 만들어도 상관 없지만 기본 생성자는 있어야 함
	
	private long region_id;
	private String region_name;
	
	public long getRegion_id() {
		return region_id;
	}
	public void setRegion_id(long region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
	
}
