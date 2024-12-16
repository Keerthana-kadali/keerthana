package org.tnsif.capgemini.c2tc.Interface;

public class Student implements Registrable {
	private int id;
	private String name;
	private double fees;
	private String Course;
	
	
	

	public Student(int id, String name, double fees, String course) {
		
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.Course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public static void main(String[] args) {
	

	}

}
