/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class EmployeeWageUC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.println("Employee attendance is: ");
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


