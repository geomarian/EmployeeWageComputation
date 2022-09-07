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

	
		public static void main(String[] args) {
			// Driving Code
			Random rand = new Random();
			System.out.println("Employee attendance is: ");
			int k = rand.nextInt(2);
			System.out.println(k);
			if(k==0) {
				System.out.println("Employee is Absent: " + k);
			}
				else if(k==1){
					System.out.println("Employee is Present: " + k );
				}
			}


}
