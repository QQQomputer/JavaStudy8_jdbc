package com.gom.s1.start;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
		Scanner sc = new Scanner(System.in);

		FrontController fc = new FrontController();
		try {
			fc.mainStart();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("DB 연동 테스트 끝");
	}

}
