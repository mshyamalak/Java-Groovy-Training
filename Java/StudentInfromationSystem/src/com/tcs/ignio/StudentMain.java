package com.tcs.ignio;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student(1, "Ram", 89, 96, 63);
		Student s2 = new Student(2, "Sam", 56, 53, 45);
		Student s3 = new Student(3, "Bob", 85, 45, 79);
	
		
		System.out.println("TOTAL MARKS"+s1.totalMarks(s1.getEnglishMark(), s1.getMathsMark(), s1.getScienceMark()));
		System.out.println("TOTAL MARKS"+s2.totalMarks(s2.getEnglishMark(), s2.getMathsMark(), s2.getScienceMark()));
		System.out.println("TOTAL MARKS"+s3.totalMarks(s3.getEnglishMark(), s3.getMathsMark(), s3.getScienceMark()));
	}

}
