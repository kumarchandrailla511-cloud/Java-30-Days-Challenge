package com;

public class StudentGrade {
	
	public static void main(String[] args) {
		int marks = 82;
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid marks");
		}else if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=75) {
			System.out.println("Grade B");
		}else if(marks>=60) {
			System.out.println("Grade C");
		}else if(marks>=35) {
			System.out.println("Grade D");
		}else {
			System.out.println("Failed");
		}

}
	
	
}
