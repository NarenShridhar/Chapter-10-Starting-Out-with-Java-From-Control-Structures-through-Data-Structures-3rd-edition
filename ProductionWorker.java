public class ProductionWorker extends Employee
{
	// Created a final integer variable called noShift to indicate that the employee does not work a shift
	private final int noShift = 0;

	// Created a final integer variable called dayShift to indicate that the employee works a day shift
	private final int dayShift = 1;

	// Created a final integer variable called nightShift to indicate that the employee works a night shift
	private final int nightShift = 2;

	// Created an integer instance variable called shift to hold the employee shift
	private int shift;

	// Created a double instance variable called hourlyPayRate to hold the employee hourly pay rate
	private double hourlyPayRate;

	// No-arg constructor
	public ProductionWorker()
	{
		super();
		shift = noShift;
		hourlyPayRate = 0.0;
	}

	// Constructor with arguments to assign values
	public ProductionWorker(String employeeNameGiven, String employeeNumberGiven, String hireDateGiven, int shiftGiven, double hourlyPayRateGiven)
	{
		super(employeeNameGiven, employeeNumberGiven, hireDateGiven);
		setShift(shiftGiven);
		setHourlyPayRate(hourlyPayRateGiven);
	}

	// Setter method for the employee shift
	public void setShift(int shiftGiven)
	{
		shift = shiftGiven;
	}

	// Getter method for the employee shift
	public int getShift()
	{
		return shift;
	}

	// Setter method for the employee hourly pay rate
	public void setHourlyPayRate(double hourlyPayRateGiven)
	{
		hourlyPayRate = hourlyPayRateGiven;
	}

	// Getter method for the employee hourly pay rate
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}

	// toString method
	public String toString()
	{
		String output;

		output = super.toString() + "\n";
		if(shift == dayShift)
		{
			output += "Shift: Day\n";
		}

		else if(shift == nightShift)
		{
			output += "Shift: Night\n";
		}

		else
		{
			output += "Invalid Shift\n";
		}

		output += "Hourly Pay Rate: " + String.format("$%.2f", hourlyPayRate);

		return output;
	}
}