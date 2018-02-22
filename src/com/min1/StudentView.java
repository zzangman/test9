package com.min1;

public class StudentView {

	// ���� �̸��� �޼��带 ������ �����ϴ� �� = �����ε�(Overloading)
	// condition : 
	// 1. �޼������ ���ƾ� �Ѵ�.
	// 2. �Ű������� Ÿ��, ������ �޶�� �Ѵ�.
	public void view(String message){
		System.out.println(message);
	}
	
	public void view(Student student){
		System.out.println("�л� �̸� :" + student.name);
		System.out.println("�л� ��ȣ :" + student.num);
		System.out.println("���� :" + student.kor);
		System.out.println("���� :" + student.eng);
		System.out.println("���� :" + student.math);
		System.out.println("���� :" + student.total);
		System.out.println("��� :" + student.avg);
	}
	
	
	public void view(Student[] student) {

		
		for (int i = 0; i < student.length; i++) {
			this.view(student[i]);
			System.out.println("------------------------");
			
		} // for
	} // view



}
