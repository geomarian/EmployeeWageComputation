/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class UC5_TotalWorkingHours {

	/**
	 * @param args
	 */

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empRatePerHr=20; 
		int numOfWorkingDays=20;
	
		int maxRateInHours=100;
		
		int totalWorkingDays=0;
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
			System.out.print("Employee attendance is Full Time, ");
			int fullSalary = empRatePerHr*maxRateInHours;
			int totalMonthlyFullSalary = fullSalary * numOfWorkingDays;
			System.out.println("So Monthly salary is = " + totalMonthlyFullSalary);	
				
					totalWorkingDays=k*empRatePerHr;
					System.out.println("totalWorkingDays is: " + totalWorkingDays);
				
			break;
				
		case 2:
			System.out.print("Employee attendance is Part Time, ");
			int halfSalary = empRatePerHr*maxRateInHours;
			int totalMonthlyHalfSalary = halfSalary * numOfWorkingDays;
			System.out.println(" So Monthly salary is = " + totalMonthlyHalfSalary);
			totalWorkingDays=k*empRatePerHr;
			System.out.println("totalWorkingDays is: " + totalWorkingDays);
			break;
		
		  default:
			    System.out.println("No Data available");
			    break;
		}
		
		
	
}

}
