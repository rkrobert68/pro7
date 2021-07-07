package org.emp;

import java.util.InputMismatchException;

public class Employee {

	public void EmpId() {
	System.out.println("The eEmployee id is 345");
	
	}
	public void empName() {
		System.out.println("The employee name is Vasanth");
		
	}
	private void empDob() {
		// TODO Auto-generated method stub
System.out.println("The employee date of birth is 30/06/1908");
	}
	
	private void empPhone() {
		// TODO Auto-generated method stub
System.out.println("The employee phone is 9566356473");
	}
	public void empEmail() {
		System.out.println("Employee mail id is rom@gmail.com");
	}
	public void empAddress() {
		System.out.println("The employee address is chennai");
	}
	
	public static void main(String[] args) throws ArithmeticException,InputMismatchException {
		
		
		Employee e=new Employee();
		e.empEmail();
		e.empAddress();
		e.empDob();
		e.EmpId();
		e.empPhone();
		e.empName();
		e.empAddress();
		throw new ArithmeticException();
		
	}
}
