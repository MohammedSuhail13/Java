package org.scanner;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		//scanner
		Scanner s = new Scanner(System.in);
		
		//nextbyte
		
		byte age = s.nextByte();
		System.out.println("Age="+age);
		
		//next short
		short year = s.nextShort();
		System.out.println("Year="+year);
		
		//next int
		int pincode = s.nextInt();
		System.out.println("Pincode="+pincode);
		
		//next long
		long phone = s.nextLong();
		System.out.println("Phone="+phone);
		
		//next float
		float weight = s.nextFloat();
		System.out.println("Weight="+weight);
		
		//next double
		double height = s.nextDouble();
		System.out.println("Height="+height);
		
		//next char
		String firstname = s.next();
		System.out.println("Name="+firstname);
		
		//next boolean
		boolean status = s.nextBoolean();
		System.out.println("Marriage="+status);
		
		// next line
		String lastname = s.nextLine();
		System.out.println("Lastname="+lastname);
		
	}

}
