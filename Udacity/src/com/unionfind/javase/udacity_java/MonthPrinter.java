package com.unionfind.javase.udacity_java;

import java.util.Scanner;

//Write a class Month.




//A Month has a constructor that takes the month number as a parameter (1 for January, 2 for February and so forth)
//public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1

//And 2 methods
//public String getMonthName() Use if / else if /else if ...
//public int getNumberOfDays() Do NOT use a separate if / else branch for each month. Use Boolean operators (&&, ||, !).
//   You will have an if then else if then else.
//   For February return 28
//
//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user for a month number
//and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this
//June 30

//If the user enters an invalid month number print this error message: "Number must be 1 through 12"

//If the user enters a non-integer, give this error message: "Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified.

//For the draft:
//In Month, provide the constructor and the instance variable.

//In MonthPrinter, ask the user for a number 1 to 12 and create a month object with that number
class Month {
	// instance variables

	/**
	 * 
	 * 
	 * 
	 * Contructs a Month
	 * 
	 * @param the
	 *            month number. Must be 1 to 12. For any other number, the month
	 *            number is set to 1
	 */
	private static final String[] monthNames = { "January", "February",
			"March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	private static final int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };

	private int month;

	public Month(int theMonthNumber) {
		if (theMonthNumber > 0 && theMonthNumber <= 12) {
			month = theMonthNumber - 1;
		} else
			month = 0;
	}

	public String toString() {
		return getMonthName() + " " + getNumberOfDays();
	}

	/**
	 * Gets the name of this month
	 * 
	 * @return the name of this month
	 */
	public String getMonthName() {

		return monthNames[month];
	}

	/**
	 * Gets the number of days in this month
	 * 
	 * @return the number of days in this month in a non-leap year
	 */
	public int getNumberOfDays() {

		return monthDays[month];
	}
}

// Write a class Month.

// A Month has a constructor that takes the month number as a parameter (1 for
// January, 2 for February and so forth)
// public Month(int monthNumber)
// If monthNumber is not 1 to 12, set it to 1

// And 2 methods
// public String getMonthName() Use if / else if /else if ...
// public int getNumberOfDays() Do NOT use a separate if / else branch for each
// month. Use Boolean operators (&&, ||, !).
// You will have an if then else if then else.
// For February return 28
//
// These are implemented for you as stubs

// Now write a class MonthPrinter which will instantiate a Month object, ask the
// user for a month number
// and print the name of the month and the number or days.

// If the month is 6, the output should look exactly like this
// June 30

// If the user enters an invalid month number print this error message:
// "Number must be 1 through 12"

// If the user enters a non-integer, give this error message:
// "Not an integer. Terminating"

// To be considered correct, you must enter the message exactly as specified.

// For the draft:
// In Month, provide the constructor and the instance variable.

// In MonthPrinter, ask the user for a number 1 to 12 and create a month object
// with that number

/**
 * Exercises the methods in the Month class
 */
public class MonthPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a month number (1 through 12) ");

		Month month;

		if (in.hasNextInt()) {
			int val = in.nextInt();
			if (val > 12 || val < 1) {
				System.out.print("Number must be 1 through 12");
			} else {
				month = new Month(val);
				System.out.print(month.toString());
			}
		} else {
			System.out.print("Not an integer. Terminating");
		}

	}
}