package com.min1;

import java.util.Scanner;

public class StudentService {

	// �л��߰� �޼���
	// �޼���� : addStudent
	// �л��� �ο����� �Է��ϼ���
	// �л��� ��ŭ �̸�,��ȣ �Է�
	
	
	public Student[] addStudent(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�л����� �Է��ϼ���");
		int count=sc.nextInt();
		Student []student=new Student[count];
		
		for(int i=0;i<student.length;i++){
			Student stu=new Student();
			
			System.out.println("�л� �̸� :");
			stu.name=sc.next();
			System.out.println("�л� ��ȣ :");
			stu.num=sc.nextInt();
		
			student[i]=stu;
			
		} // for
		
		return student;
		
		
	}// addStudent
	
	
}
