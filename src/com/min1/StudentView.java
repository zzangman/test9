package com.min1;

public class StudentView {

	// 같은 이름의 메서드를 여러개 생성하는 것 = 오버로딩(Overloading)
	// condition : 
	// 1. 메서드명이 같아야 한다.
	// 2. 매개변수나 타입, 갯수가 달라야 한다.
	public void view(String message){
		System.out.println(message);
	}
	
	public void view(Student student){
		System.out.println("학생 이름 :" + student.name);
		System.out.println("학생 번호 :" + student.num);
		System.out.println("국어 :" + student.kor);
		System.out.println("영어 :" + student.eng);
		System.out.println("수학 :" + student.math);
		System.out.println("총점 :" + student.total);
		System.out.println("평균 :" + student.avg);
	}
	
	
	public void view(Student[] student) {

		
		for (int i = 0; i < student.length; i++) {
			this.view(student[i]);
			System.out.println("------------------------");
			
		} // for
	} // view



}
