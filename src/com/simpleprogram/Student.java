package com.simpleprogram;

public class Student {
	//create method
	private void stdName() {
		System.out.println("Student Name = Suhail");
	}
	public void stdAge() {
		System.out.println("Student Age = 26");
	}
	
	//create main method
	public static void main(String[] args) {
		//create object
		Student s = new Student();
		
		//call method
		s.stdName();
		s.stdAge();
			
		}
	}


