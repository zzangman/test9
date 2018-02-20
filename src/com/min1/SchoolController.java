package com.min1;

import java.util.Scanner;

public class SchoolController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int select = 0;
		while (flag) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 성적 입력");
			System.out.println("3. 성적 조회");
			System.out.println("4. 전제 조회");
			System.out.println("5. 프로그램 종료");
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 등록입니다.");
				break;
			case 2:
				System.out.println("성적 입력입니다.");
				break;
			case 3:
				System.out.println("성적 조회입니다.");
				break;
			case 4:
				System.out.println("전체 조회입니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;

			} // switch

		} // while

	} // start

	// 메서드명은 start
	// return은 없다

	// 1. 학생 등록
	// 2. 성적 입력
	// 3. 성적 조회
	// 4. 전체 조회
	// 5. 프로그램종료

}
