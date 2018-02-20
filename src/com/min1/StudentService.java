package com.min1;

import java.util.Scanner;

public class StudentService {

	// 학생추가 메서드
	// 메서드명 : addStudent
	// 학생의 인원수를 입력하세요
	// 학생수 만큼 이름,번호 입력
	
	
	public Student[] addStudent(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요");
		int count=sc.nextInt();
		Student []student=new Student[count];
		
		for(int i=0;i<student.length;i++){
			Student stu=new Student();
			
			System.out.println("학생 이름 :");
			stu.name=sc.next();
			System.out.println("학생 번호 :");
			stu.num=sc.nextInt();
		
			student[i]=stu;
			
		} // for
		
		return student;
		
		
	}// addStudent
	
	
}
