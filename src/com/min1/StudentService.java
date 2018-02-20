package com.min1;

import java.util.Scanner;

public class StudentService {

	// 학생추가 메서드
	// 메서드명 : addStudent
	// 학생의 인원수를 입력하세요
	// 학생수 만큼 이름,번호 입력
	Scanner sc=new Scanner(System.in);
	
	public Student[] addStudent(){
		
		
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
	
	
	// 메서드명 : addPoint
	// 각 학생의 점수 입력
	
	public Student[] addPoint(Student []student){
	
		
		
		for(int i=0;i<student.length;i++){
			
		
		System.out.println("국어 점수 :");
		student[i].kor=sc.nextInt();
		System.out.println("영어 점수 :");
		student[i].eng=sc.nextInt();
		System.out.println("수학 점수 :");
		student[i].math=sc.nextInt();
		
		student[i].total=student[i].kor+student[i].eng+student[i].math;
		student[i].avg=student[i].total/3;
		
		System.out.println("----------------------");
		
		}//for
		
		return student;
		
		
	}// add Point
	
	
}
