package com.min1;

import java.util.Scanner;

public class StudentService {

	// �л��߰� �޼���
	// �޼���� : addStudent
	// �л��� �ο����� �Է��ϼ���
	// �л��� ��ŭ �̸�,��ȣ �Է�
	Scanner sc = new Scanner(System.in);

	Scanner sc2;
	// ������ ����
	// ���������� Ŭ������(){}
	
	public StudentService(){
		sc2=new Scanner(System.in);
	}
	
	
	public Student search(Student [] students){
		
		System.out.println("�л� ��ȣ�� �Է��ϼ��� :");
		int num=sc.nextInt();
		Student student=null;
		for(int i=0;i<students.length;i++){
			if(num==students[i].num){
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	
	public Student[] addStudent() {

		System.out.println("�л����� �Է��ϼ���");
		int count = sc.nextInt();
		Student[] student = new Student[count];

		for (int i = 0; i < student.length; i++) {
			Student stu = new Student();

			System.out.println("�л� �̸� :");
			stu.name = sc.next();
			System.out.println("�л� ��ȣ :");
			stu.num = sc.nextInt();

			student[i] = stu;

		} // for

		return student;

	}// addStudent

	// �޼���� : addPoint
	// �� �л��� ���� �Է�

	public Student[] addPoint(Student[] student) {

		for (int i = 0; i < student.length; i++) {

			System.out.println("���� ���� :");
			student[i].kor = sc.nextInt();
			System.out.println("���� ���� :");
			student[i].eng = sc.nextInt();
			System.out.println("���� ���� :");
			student[i].math = sc.nextInt();

			student[i].total = student[i].kor + student[i].eng + student[i].math;
			student[i].avg = student[i].total / 3;

			System.out.println("----------------------");

		} // for

		return student;

	}// add Point

	// search �޼����
	// ��ȣ�� �Է� �޾Ƽ� �л� �Ѹ��� ã�Ƽ�
	// �ش� ����� StudentView class�� viewStudent�޼��� ���

	
}
