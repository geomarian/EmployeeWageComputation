/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class UC1_EmployeeWage {

			
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Code
		//employeeIsPresentOrNot();
		
		//UC - 1
//		Random rand = new Random();
//		System.out.println("Employee attendance is: ");
//		int k = rand.nextInt(2);
//		System.out.println(k);
//		if(k==0) {
//			System.out.println("Employee is Absent: " + k);
//		}
//			else if(k==1){
//				System.out.println("Employee is Present: " + k );
//			}
//		}
//
//	UC -2
//		Random rand = new Random();
//		System.out.println("Employee attendance is: ");
//		int k = rand.nextInt(2);
//		System.out.println(k);
//	
//	if(k==0) {
//		System.out.println("Employee is Absent ");
//		System.out.println("No salary because employee is absent");
//	}
//		else if(k==1){
//			System.out.println("Employee is Present ");
//			int empRatePerHr=20; 
//			int	empHrs=8;
//			int salary = empRatePerHr*empHrs;
//			System.out.println(salary);
//		}
 
		// UC- 3
		Random rand = new Random();
		System.out.println("Employee attendance is= ");
		int k = rand.nextInt(3);
		System.out.println(k);

		if(k==0) {
			System.out.println("Employee is Absent ");
			System.out.println("No salary because employee is absent");
		}
		else if(k==1){
			System.out.println("Employee is Full Time Present ");
			int empRatePerHr=20; 
			int	empHrs=8;
			int salary = empRatePerHr*empHrs;
			System.out.println(salary);
		}
		else if(k==2) {
			System.out.println("Employee is Part Time Present");
			int empRatePerHr=20; 
			int	empHrs=4;
			int salary = empRatePerHr*empHrs;
			System.out.println(salary);
	
	}

}
}
