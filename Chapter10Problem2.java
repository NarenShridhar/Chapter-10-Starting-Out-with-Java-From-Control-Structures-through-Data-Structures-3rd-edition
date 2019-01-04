import java.util.Scanner;

public class Chapter10Problem2
{
	public static void main (String[] args)
	{
		// Call the display method written below to display the objectives of this program
		display();

		// Call the getUserInputs method below to execute the bulk of this program
		getUserInputs();
	}

	// Created a static void method called display to display the objectives of the program
	public static void display()
	{
		System.out.println();
		System.out.println("This program asks the user for several details in order to establish a shift supervisor's");
		System.out.println("annual salary and annual production bonus.");
		System.out.println("Processing, questions appearing, your input is required user :)");
		System.out.println();
	}

	// The getUserInputs method runs the bulk of the program
	public static void getUserInputs()
	{
		// Created a double variable called annualSalary to hold the annual salary of the Shift Supervisor
		double userAnnualSalary;

		// Created a double variable called annualBonus to hold the annual production bonus of the Shift Supervisor
		double userAnnualBonus;

		// Created a String variable called employeeName to hold the name of the employee
		String userEmployeeName; 

		// Created a String variable called employeeNumber to hold the employee number
		String userEmployeeNumber;

		// Created a String  varaible called hireDate to hold the employee hire date
		String userHireDate;

		// Created a Scanner object called keyboard to take in the user's inputs
		Scanner keyboard = new Scanner(System.in);

		// Created a ShiftSupervisor object called shiftSupervisor 1. Its' current state calls the no-arg constructor I set up via both classes
		ShiftSupervisor shiftSupervisor1 = new ShiftSupervisor();

		// Get the employee's name
		System.out.println("User, please enter the employee name: ");
		userEmployeeName = keyboard.nextLine();

		// Set the object's employee name w/ the name the user just entered
		shiftSupervisor1.setEmployeeName(userEmployeeName);

		// Get the employee's employee number
		System.out.println("User, please enter a valid employee number");
		System.out.println("This means a number in the format XXX-L where the X's are digits between 0-9 and the L is a letter within A-M");
		userEmployeeNumber = keyboard.nextLine();

		// Set the object's employee number w/ the number the user just entered
		shiftSupervisor1.setEmployeeNumber(userEmployeeNumber);

		// Get the employee's hire date
		System.out.println("User, please enter the hire date of " + shiftSupervisor1.getEmployeeName());
		userHireDate = keyboard.nextLine();

		// Set the object's hire date w/ the hire date the user just entered
		shiftSupervisor1.setHireDate(userHireDate);

		// Get the shift supervisor's annual salary
		System.out.println("User, what is " + shiftSupervisor1.getEmployeeName() + "'s + annual salary as shift supervisor?");
		userAnnualSalary = keyboard.nextDouble();

		// Set the object's annual salary w/ the annual salary the user just entered
		shiftSupervisor1.setAnnualSalary(userAnnualSalary);

		// Get the shift supervisor's annual bonus
		System.out.println("User, what is " + shiftSupervisor1.getEmployeeName() + "'s + annual bonus as shift supervisor?");
		userAnnualBonus = keyboard.nextDouble();

		// Set the object's annual bonus w/ the annual bonus the user just entered
		shiftSupervisor1.setAnnualBonus(userAnnualBonus);

		System.out.println("Based on the information you provided, this program has deduced the following...");

		// Print the toString method to produce the result
		System.out.println(shiftSupervisor1);
	}
}