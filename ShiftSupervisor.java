public class ShiftSupervisor extends Employee
{
	// Created a double instance variable called annualSalary to hold the annual salary of the Shift Supervisor
	private double annualSalary;

	// Created a double instance variable called annualBonus to hold the annual production bonus of the Shift Supervisor
	private double annualBonus;

	// No-arg constructor
	public ShiftSupervisor()
	{
		super();
		annualSalary = 0.0;
		annualBonus = 0.0;
	}

	// Construtor with arguments to assign the values
	public ShiftSupervisor(String employeeNameGiven, String employeeNumberGiven, String hireDateGiven, 
		double annualSalaryGiven, double annualBonusGiven)
	{
		super(employeeNameGiven, employeeNumberGiven, hireDateGiven);
		setAnnualSalary(annualSalaryGiven);
		setAnnualBonus(annualBonusGiven);

	}

	// Setter method for the annual salary
	public void setAnnualSalary(double annualSalaryGiven)
	{
		annualSalary = annualSalaryGiven;
	}

	// Getter method for the annual salary
	public double getAnnualSalary()
	{
		return annualSalary;
	}

	// Setter method for the annual bonus
	public void setAnnualBonus(double annualBonusGiven)
	{
		annualBonus = annualBonusGiven;
	}

	// Getter method for the annual bonus
	public double getAnnualBonus()
	{
		return annualBonus;
	}

	// toString method
	public String toString()
	{
		String output;

		output = super.toString() + "\n";
		output += "The Shift Supervisor's annual salary is: $" + annualSalary + "\n";
		output += "The Shift Supervisor's annual bonus is: $" + annualBonus;

		return output;
	}
}