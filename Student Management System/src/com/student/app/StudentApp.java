package com.student.app;

import java.util.Scanner;


public class StudentApp  {
	public static void main(String[] args) {
		StudentMenu student=new StudentMenu();
		student.menu();

		boolean ordering = true;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Please select the option");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				student.addStudent();
				break;
			case 2:
				student.showAllStudent();
				break;
			case 3:
				student.studentBasedOnRollNo();
				break;
			case 4:
				student.deleteStudent();
				break;
			case 5:
				student.updateStudent();
				break;
			case 6:
				System.out.println("Thank you for your support");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}

		} while (ordering);
		
		scanner.close();
	}

}
