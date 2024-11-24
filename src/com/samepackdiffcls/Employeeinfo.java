package com.samepackdiffcls;

public class Employeeinfo {
	private void empCollegename() {
		System.out.println("Employee College name = SRM");
	}
	private void empLocation() {
		System.out.println("Employe Location = Salem");
	}
	
	public static void main(String[] args) {
		//create object for this cls
		Employeeinfo empinfo = new Employeeinfo();
		empinfo.empCollegename();
		empinfo.empLocation();
		//create object for befor cls
		Employee emp = new Employee();
		emp.empName();
		emp.empID();
	}

}
