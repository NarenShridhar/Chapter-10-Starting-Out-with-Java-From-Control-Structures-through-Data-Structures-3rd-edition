import java.util.Scanner;

public class Chapter10Problem3
{
	public static void main (String[] args)
	{
		// Call the display method written below to display the objectives of this program
		display();

		// Call the getUserInputs method below to execute the bulk of this program
		getUserInputs();
	}

	public static void display()
	{
		System.out.println();
		System.out.println("Welcome User!");
		System.out.println("This program will demonstrate the uses of the Shift Supervisor class");
		System.out.println("Below is an example of what your final output will look like");
		System.out.println();
		TeamLeader teamLeader2 = new TeamLeader("Ranjini", "123-A", "October 2017", 1, 25.00, 1000.00, 40.00, 40.00);
		System.out.println(teamLeader2);
		System.out.println("Now it's your turn user!");
		System.out.println("I will need your help to input some values!");
		System.out.println("Here we go! :)");
		System.out.println();
	}

	public static void getUserInputs()
	{

		double test;
		// Created a String variable called userEmployeeName to hold the user's input for the team leader's name
		String userEmployeeName;

		// Created a String variable called userEmployeeNumber to hold the user's input for the team leader's number
		String userEmployeeNumber;

		// Created a String variable called userHireDate to hold the user's input for the team leader's hire date
		String userHireDate;

		// Created an integer variable called userShift to hold the user's input for the shift the team leader works
		int userShift;

		// Created a double variable called userHourlyPayRate to hold the user's input for the team leader's hourly pay rate
		double userHourlyPayRate;

		// Created a double variable called userMonthlyBonus to hold the user's input for the team leader's monthly bonus
		double userMonthlyBonus;

		// Created a double variable called userRequiredTrainingHours to hold the user's input for the TL's required training hours
		double userRequiredTrainingHours;

		// Created a double variable called userAttendedTrainingHours to hold the user's input for the TL's attended training hours
		double userAttendedTrainingHours;

		// Created a Scanner object called keyboard to take in the user's inputs
		Scanner keyboard = new Scanner(System.in);

		// Created a (no-arg) TeamLeader object called teamLeader1 to show the TeamLeader class
		TeamLeader teamLeader1 = new TeamLeader();

		// Get the team leader's name
		System.out.println("User, please enter the team leader's employee name");
		userEmployeeName = keyboard.nextLine();

		// Set the object's employee name argument with the team leader's name
		teamLeader1.setEmployeeName(userEmployeeName);

		// Get the team leader's employee number
		System.out.println("User, please enter a valid employee number for team leader " + teamLeader1.getEmployeeName());
		System.out.println("This means a number in the format XXX-L where the X's are digits between 0-9 and the L is a letter within A-M");
		userEmployeeNumber = keyboard.nextLine();

		// Set the object's employee number argument with the team leader's number
		teamLeader1.setEmployeeNumber(userEmployeeNumber);

		// Get the team leader's hire date
		System.out.println("User, please enter the hire date for team leader " + teamLeader1.getEmployeeName());
		userHireDate = keyboard.nextLine();

		// Set the object's hire date argument with the team leader's hire date
		teamLeader1.setHireDate(userHireDate);

		// Get the shift that the team leader works
		System.out.println("User, what shift does the team leader " + teamLeader1.getEmployeeName() + " work?");
		System.out.println("Enter 1 if " + teamLeader1.getEmployeeName() + " works the day shift");
		System.out.println("Enter 2 if " + teamLeader1.getEmployeeName() + " works the night shift");
		userShift = keyboard.nextInt();

		// Set the object's shift argument with the shift the team leader works
		teamLeader1.setShift(userShift);

		// Get the hourly pay rate for the team leader
		System.out.println("User, what is the hourly pay rate for team leader " + teamLeader1.getEmployeeName() + "?");
		userHourlyPayRate = keyboard.nextDouble();

		// Set the object's hourly pay rate argument with the hourly pay rate the user input for the team leader
		teamLeader1.setHourlyPayRate(userHourlyPayRate);

		// Get the team leader's monthly bonus from the user
		System.out.println("User, what is the the team leader " + teamLeader1.getEmployeeName() + "'s monthly bonus?");
		userMonthlyBonus = keyboard.nextDouble();

		// Set the object's monthly bonus argument to the monthly bonus the user just input
		teamLeader1.setMonthlyBonus(userMonthlyBonus);

		// Get the team leader's required training hours for this month
		System.out.println("User, what are " +  teamLeader1.getEmployeeName() + "'s required training hours for the month?");
		userRequiredTrainingHours = keyboard.nextDouble();

		// Set the object's required training hours argument with the user's input for the team leader's required training hours
		teamLeader1.setRequiredTrainingHours(userRequiredTrainingHours);

		// Get the team leader's attended training hours for this month
		System.out.println("User, what are " +  teamLeader1.getEmployeeName() + "'s actual training hours for the month?");
		userAttendedTrainingHours = keyboard.nextDouble();

		// Set the object's attended training hours argument with the user's input for the team leader's attended training hours
		teamLeader1.setAttendedTrainingHours(userAttendedTrainingHours);

		System.out.println("Calculating your results...");

		System.out.println(teamLeader1);

	}
}