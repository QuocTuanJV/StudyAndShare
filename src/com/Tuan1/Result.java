package com.Tuan1;

import java.util.ArrayList;

public class Result {
	
	private String nameSubject;
	private ArrayList<Student> students;
	
	public Result() {
		students = new ArrayList<Student>();
	}
	
	//this is copy Constructor
	public Result(Result result) {
		students = new ArrayList<Student>();
		for(Student s: result.students) {
			students.add(s);
		}
	}
	
	public void add() {
		
		
	}
	public void showResult() {
		
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
