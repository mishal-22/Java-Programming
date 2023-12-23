package com.student.app;

public class Student {
	private int rollNo;
	private String name;
	private String collegeName;
	private String city;
	private float percentage;

	public Student(int rollNo, String name, String collegeName, String city, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.collegeName = collegeName;
		this.city = city;
		this.percentage = percentage;
	}
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", collegeName=" + collegeName + ", city=" + city
				+ ", percentage=" + percentage + "]";
	}


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
