/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class UC4_MontlyWage {

	/**
	 * @param args
	 */


		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empRatePerHr=20; 
		int numOfWorkingDays=20;
		int	empHrsFullTime=8;
		int	empHrsPartTime=4;

		Random rand = new Random();

		int k =rand.nextInt(3);

		if(k==0) {
			System.out.println("Employee is Absent ");
			System.out.println("No salary because employee is absent");
		}
		else if(k==1){
			System.out.println("Employee is Full Time Present ");

		}
		else if(k==2) {
			System.out.println("Employee is Part Time Present");

		}

		switch(k) {
		case 1:
			System.out.print("Employee attendance is Full Time ");
			int fullSalary = empRatePerHr*empHrsFullTime;
			int totalMonthlyFullSalary = fullSalary * numOfWorkingDays;
			System.out.println("So Monthly salary is = " + totalMonthlyFullSalary);

			break;
		case 2:
			System.out.print("Employee attendance is Part Time ");
			int halfSalary = empRatePerHr*empHrsPartTime;

			int totalMonthlyHalfSalary = halfSalary * numOfWorkingDays;

			System.out.println(" So Monthly salary is = " + totalMonthlyHalfSalary);
			break;
		}


	}}
