package com.min1;

import java.util.Scanner;

public class SchoolController {

	public void start() {
		Scanner sc = new Scanner(System.in);

		StudentService stuService = new StudentService();
		Student[] st = null;

		StudentView sv = new StudentView();

		boolean flag = true;
		int select = 0;
		while (flag) {
			System.out.println("1. �л� ���");
			System.out.println("2. ���� �Է�");
			System.out.println("3. �л� ��ȸ");
			System.out.println("4. ���� ��ȸ");
			System.out.println("5. ���α׷� ����");
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("�л� ����Դϴ�.");
				st = stuService.addStudent();
				break;
			case 2:
				System.out.println("���� �Է��Դϴ�.");
				stuService.addPoint(st);
				break;
			case 3:
				if (st != null) {

					Student student = stuService.search(st);

					if (st != null) {
						sv.view(student);
					} else {
						sv.view("�ش� �л��� �����ϴ�.");
					}
				}
				break;
			case 4:
				System.out.println("��ü ��ȸ�Դϴ�.");
				sv.view(st);
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
				break;

			} // switch

		} // while

	} // start

	// �޼������ start
	// return�� ����

	// 1. �л� ���
	// 2. ���� �Է�
	// 3. ���� ��ȸ
	// 4. ��ü ��ȸ
	// 5. ���α׷�����

}
