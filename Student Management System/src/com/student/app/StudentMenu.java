package com.student.app;

import java.util.HashSet;
import java.util.Scanner;

public class StudentMenu {
	int rollNo;
	String name, collegeName, city;
	float percentage;
	
	Scanner scanner = new Scanner(System.in);
	HashSet<Student> studset = new HashSet<Student>();

	public  void menu() {
		System.out.println("Welcome to the Student Management System");
		System.out.println("-----------------------------------------");
		System.out.println("1 - Add student");
		System.out.println("2 - Show All student");
		System.out.println("3 - Get student based on roll no");
		System.out.println("4 - Delete student");
		System.out.println("5 - Update student");
		System.out.println("6 - Exit");
	}

	public  void addStudent() {
		boolean flag=true;
		System.out.println("Enter the rollNo");
        rollNo=scanner.nextInt();
        for(Student stud:studset ) {
        	if(stud.getRollNo()==rollNo) {
        	    flag=false;
        	    break;
        	}
        }
        if(!flag) {
        	System.out.println("Student with rollNo "+rollNo+" is already exist");
        }
        else {
			System.out.println("Enter the name");
			name=scanner.next();
			System.out.println("Enter the college name");
			collegeName=scanner.next();
			System.out.println("Enter the city");
			city=scanner.next();
			System.out.println("Enter the percentage");
			percentage=scanner.nextFloat();
			
			Student student=new Student(rollNo, name, collegeName, city, percentage);
			studset.add(student);
			System.out.println("Student added successfully");
		}
	}
	public void showAllStudent() {
		for(Student stud:studset) {
			System.out.println(stud);
		}
		if(studset.isEmpty()) {
			System.out.println("Students are not found!");
		}
	}
	public void studentBasedOnRollNo() {
		boolean flag=false;
		System.out.println("Enter the roll no");
		rollNo=scanner.nextInt();
		for(Student stud:studset) {
			if(stud.getRollNo()==rollNo) {
				System.out.println(stud);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("There is no student with roll no "+rollNo);
		}
		
	}
	public void deleteStudent() {
		boolean flag=false;
		System.out.println("Enter the roll no");
		rollNo=scanner.nextInt();
		for(Student stud:studset) {
			if(stud.getRollNo()==rollNo) {
				studset.remove(stud);
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Student with roll no "+rollNo+" removed successfully");
		}
		else {
			System.out.println("Student with roll no "+rollNo+" is not found");
		}
	}
	public void updateStudent() {
		boolean flag=false;
		System.out.println("Enter the roll no");
		rollNo=scanner.nextInt();
		for(Student stud:studset) {
			if(stud.getRollNo()==rollNo) {
				flag=true;
				System.out.println("Enter the name");
				name=scanner.next();
				System.out.println("Enter the college name");
				collegeName=scanner.next();
				System.out.println("Enter the city");
				city=scanner.next();
				System.out.println("Enter the percentage");
				percentage=scanner.nextFloat();
				stud.setName(name);
				stud.setCity(city);
				stud.setCollegeName(collegeName);
				stud.setPercentage(percentage);
				break;
			}
		}
		if(flag) {
			
			System.out.println("Student details successfully updated");
		}
		else {
			System.out.println("Student with roll no "+rollNo+" is not found");
		}
	}

}
