package com.min1;

public class StudentView {

	
	public void view(Student [] student){
		
		for(int i=0;i<student.length;i++){
			System.out.println("�л� �̸� :"+student[i].name);
			System.out.println("�л� ��ȣ :"+student[i].num);
			System.out.println("���� :"+student[i].kor);
			System.out.println("���� :"+student[i].eng);
			System.out.println("���� :"+student[i].math);
			System.out.println("���� :"+student[i].total);
			System.out.println("��� :"+student[i].avg);
			System.out.println("------------------------------");
		} // for
	} // view
	
	
	public void scoreView(Student []student){
		
		for(int i=0;i<student.length;i++){
			
			System.out.println("���� :"+student[i].kor);
			System.out.println("���� :"+student[i].eng);
			System.out.println("���� :"+student[i].math);
			System.out.println("���� :"+student[i].total);
			System.out.println("��� :"+student[i].avg);
			System.out.println("------------------------------");
		} // for
		
		
	}
	
}
