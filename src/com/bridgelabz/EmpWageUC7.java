/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class EmpWageUC7 extends EmployeeWage{
	
	 String company;
     int empRatePerHour;
   int numOfWorkingDays;
    int maxHoursPerMonth;

    public EmpWageUC7(String company, int empRatePerHour, int numOfWorkingDays,
	    int maxHoursPerMonth) {
	
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingDays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void totalEmpWage() {
	Random random = new Random();
	int totalWorkingDays = 0;
	int totalWorkingHours = 0;
	int empWage = 0;
	int totalEmpWage = 0;

	while (totalWorkingDays <= numOfWorkingDays && totalWorkingHours <= maxHoursPerMonth) {
	    totalWorkingDays++;
	    int empCheck = random.nextInt(3);
	    int empHrs = 0;
	    switch (empCheck) {

	    case IS_PART_TIME -> empHrs = 4;

	    case IS_FULL_TIME -> empHrs = 8;

	    default -> empHrs = 0;

	    }
	    totalWorkingHours = empHrs + totalWorkingHours;
	    empWage = empHrs * empRatePerHour;
	    System.out.println("day " + totalWorkingDays + " = " + empWage);
	    totalEmpWage = empWage + totalEmpWage;

	}
	System.out.println("Salary of " + company + " employee is " + totalEmpWage);

    }


}
