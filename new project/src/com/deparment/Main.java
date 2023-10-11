package com.deparment;

public class Main {

	public static void main(String[] args) {
		
		
		Admindeparment AdminDepartment=new Admindeparment();
		System.out.println("Welcome to the" + AdminDepartment.departmentName());
		System.out.println(Admindeparment.getTodaysWork());
		System.out.println(AdminDepartment.getWorkDeadLine());
		System.out.println(AdminDepartment.isTodayHoliday());
		System.out.println();
		
		HrDepartment HrDepartment=new HrDepartment();
		System.out.println("Welcome to the"+ HrDepartment.departmentName());
	    System.out.println(HrDepartment.doActivity());
		System.out.println(HrDepartment.getTodaysWork());
		System.out.println(HrDepartment.getWorkdeadline());
		System.out.println();
		
		TechDepartment TechDepartment=new TechDepartment();
		System.out.println("Welcome to the"+ TechDepartment.departmentName());
	    System.out.println(TechDepartment.getTodaysWork());
		System.out.println(TechDepartment.getWorkDeadline());
		System.out.println(TechDepartment.isTodayHoliday());
		System.out.println();
	
		
		}
		
}