import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Chapter10Problem1
{
	// Created a final static variable called dateFormat to hold how the date should be formatted
	final static String dateFormat = "dd/MM/yyyy";

	// Main method throws Parse Exception
	public static void main (String[] args) throws ParseException
	{
		// Created a Scanner object called keyboard to take in the user's input
		Scanner keyboard = new Scanner(System.in);

		// Created a char variable called repeat to hold the user input of whether or not they want to repeat the program
		char repeat = 'n';

		// Created a String variable employeeNumber to hold the user input for the employee number
		String employeeNumber;

		// Created a String variable hireDate to hold the user input for the employee hire date
		String hireDate;

		do
		{
			System.out.println("Enter the employee number: ");
			employeeNumber = keyboard.nextLine();

			System.out.println("Enter the employee hire date: ");
			hireDate = keyboard.nextLine();

			SimpleDateFormat hireDateObject = new SimpleDateFormat ("dd/MM/yyyy");

		} while(repeat == 'y' || repeat  == 'Y');
	}
}