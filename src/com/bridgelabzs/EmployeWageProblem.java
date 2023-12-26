package com.bridgelabzs;
import java.util.Random;
public class EmployeWageProblem {


	private static final int EMPLOYEE_RATE_PER_HOUR =20;
	private static final int FULL_TIME_HOURS=8;
	private static final int PART_PART_HOURS =4;
	private static final int WORKING_DAYS_PER_MONTH = 20;
	private static final int MAX_WORKING_HOURS= 100;

	public static void main(String[]args){
		int totalWorkingHours=0;
		int totalWorkingsDays=0;
		int dailyWage;
		While (totalWorkingHours<MAX_WORKING_HOURS && totalWorkingDays < WORKING_DAYS_PER_MONTH){
			int attendance = getRandomAttendance();



			switch (attendance) {
			case 1:
				dailyWage = calculateWage(FULL_TIME_HOURS);
				break;
			case 2:
				dailyWage = calculateWage(PART_TIME_HOURS);
				break;
			default:
				dailyWage=0;
			}

			totalWorkingHours += (attendance == 1|| attendance == 2)?FULL_TIME_HOURS : 0;
			totalWorkingsDays += (attendance == 1 || attendance == 2)? 1:0;

			System.out.println("Day " + totalWorkingDays + ":Daily Wage = $" + dailyWage);
		}

		int totalWages = totalWorkingHours * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("\nTotal Working Hours: " + totalWorkingHours);
		System.out.println("Total Working Days: " + totalWorkingDays);
		System.out.println("Total Wages for the Month : $" + totalWages);
	}

		private static int calculateWage(int hoursWorked) {
			return hoursWorked * EMPLOYEE_RATE_PER_HOUR;
		}
		private static int getRandomAttendance() {
			return new Random().nextInt(3);

		}
	}


