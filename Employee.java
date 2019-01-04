public class Employee
{
	// Created a String instance variable called employeeName to hold the name of the employee
	private String employeeName; 

	// Created a String instance variable called employeeNumber to hold the employee number
	private String employeeNumber;

	// Created a String instance varaiblle called hireDate to hold the employee hire date
	private String hireDate;

	// No-arg Constructor
	public Employee()
	{
		employeeName = "No name yet";
		employeeNumber = "No number yet";
		hireDate = "No hire date yet";
	}

	// Constructor with arguments to assign the values
	public Employee(String employeeNameGiven, String employeeNumberGiven, String hireDateGiven)
	{
		setEmployeeName(employeeNameGiven);
		setEmployeeNumber(employeeNumberGiven);
		setHireDate(hireDateGiven);
	}

	// Setter method for the employee name
	public void setEmployeeName(String employeeNameGiven)
	{
		employeeName = employeeNameGiven;
	}

	// Getter method for the employee name
	public String getEmployeeName()
	{
		return employeeName;
	}

	// Setter method for the employee number
	public void setEmployeeNumber(String employeeNumberGiven)
	{
		/* 
			If statement serves as input validation. If the employeeNumberGiven (the argument) is 5 characters long, with the 
			first three characters being numbers, followed by a dash, and then a letter within the range of A-M, then the 
			input validation will accept the employee number. Otherwise, it will not. 
		*/

		if(employeeNumberGiven.length() == 5 &&
			Character.isDigit(employeeNumberGiven.charAt(0)) &&
			Character.isDigit(employeeNumberGiven.charAt(1)) &&
			Character.isDigit(employeeNumberGiven.charAt(2)) &&
			employeeNumberGiven.charAt(3) == '-' &&
			(employeeNumberGiven.charAt(4) >= 'A' &&
			employeeNumberGiven.charAt(4) <= 'M'))
		{
			employeeNumber = employeeNumberGiven;
		}

		else
		{
			System.out.println("Invalid number");
		}

	}

	// Getter method for the employee number
	public String getEmployeeNumber()
	{
		return employeeNumber;
	}

	// Setter method for the hire date
	public void setHireDate(String hireDateGiven)
	{
		hireDate = hireDateGiven;
	}

	// Getter method for the hire date
	public String getHireDate()
	{
		return hireDate;
	}

	// toString method
	public String toString()
	{
		String output = "";

		output = "Employee Name: " + employeeName + "\nEmployee Number: " + employeeNumber + "\nEmployee Hire Date: " + hireDate;

		return output;
	}
}