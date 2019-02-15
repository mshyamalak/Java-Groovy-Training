package com.tcs.ignio;

public class Student {
	// variable declaration
	private int studentId;
	private String studentName;
	private int englishMark;
	private int mathsMark;
	private int scienceMark;
	
	// default constructor
	public void Student(){
		//
	}
	
	// Parameterized constructor
	public Student(int studentId, String studentName, int englishMark,
			int mathsMark, int scienceMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.englishMark = englishMark;
		this.mathsMark = mathsMark;
		this.scienceMark = scienceMark;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getEnglishMark() {
		return englishMark;
	}

	public int getMathsMark() {
		return mathsMark;
	}

	public int getScienceMark() {
		return scienceMark;
	}

	private int totalMarks(int englishMark, int mathsMark, int scienceMark){
		int totalMarks = englishMark + mathsMark + scienceMark;
		return totalMarks;
	}
	
	
	}
	public int average(){
		int marks = totalMarks();
		int average = marks/3;
		return average;
	}

	public int rank(){
		switch()
	}
	}


