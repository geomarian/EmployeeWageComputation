/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 */
	//UC3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

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
=======
		Random rand = new Random();
		System.out.println("Employee attendance is = ");
		int k = rand.nextInt(2);
		System.out.println(k);
	
	if(k==0) {
		System.out.println("Employee is Absent ");
		System.out.println("No salary because employee is absent");
	}
		else if(k==1){
			System.out.println("Employee is Present ");
			int empRatePerHr=20; 
			int	empHrs=8;
			int salary = empRatePerHr*empHrs;
			System.out.println(salary);
		}
 
	}
	}
>>>>>>> refs/heads/EmployeeWageUC2

<<<<<<< HEAD
}
	}}
=======

>>>>>>> refs/heads/EmployeeWageUC2
