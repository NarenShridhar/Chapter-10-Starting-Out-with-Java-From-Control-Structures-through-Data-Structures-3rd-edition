public class TeamLeader extends ProductionWorker
{
	// Created an instance double variable called monthly bonus to hold the monthly bonus of the team leader
	private double monthlyBonus;

	/*
		Created an instance double variable called requiredTrainingHours to hold the required training hours
		of the team leader.
	*/

	private double requiredTrainingHours;

	/*
		Created an instance double variable called attendedTrainingHours to hold the amount of actual training hours
		that the team leader attended. 
	*/

	private double attendedTrainingHours;

	// No-arg constructor
	public TeamLeader()
	{
		super();
		monthlyBonus = 0.0;
		requiredTrainingHours = 0.0;
		attendedTrainingHours = 0.0;
	}

	// Constructor w/ arguments to assign values
	public TeamLeader(String employeeNameGiven, String employeeNumberGiven, String hireDateGiven, int shiftGiven, double hourlyPayRateGiven, 
		double monthlyBonusGiven, double requiredTrainingHoursGiven, double attendedTrainingHoursGiven)
	{
		super(employeeNameGiven, employeeNumberGiven, hireDateGiven, shiftGiven, hourlyPayRateGiven);
		setMonthlyBonus(monthlyBonusGiven);
		setRequiredTrainingHours(requiredTrainingHoursGiven);
		setAttendedTrainingHours(attendedTrainingHoursGiven);
	}

	// Setter method for the monthly bonus
	public void setMonthlyBonus(double monthlyBonusGiven)
	{
		monthlyBonus = monthlyBonusGiven;
	}

	// Getter method for the monthly bonus
	public double getMonthlyBonus()
	{
		return monthlyBonus;
	}

	// Setter method for the required training hours
	public void setRequiredTrainingHours(double requiredTrainingHoursGiven)
	{
		requiredTrainingHours = requiredTrainingHoursGiven;
	}

	// Getter method for the required training hours
	public double getRequiredTrainingHours()
	{
		return requiredTrainingHours;
	}

	// Setter method for the attended training hours
	public void setAttendedTrainingHours(double attendedTrainingHoursGiven)
	{
		attendedTrainingHours = attendedTrainingHoursGiven;
	}

	// Getter method for the attended training hours
	public double getAttendedTrainingHours()
	{
		return attendedTrainingHours;
	}

	/* Created a void method called differenceInHours to display whether the team leader attended enough hours of training
	public void calculateDifferenceInHours(double requiredTrainingHoursGiven, double attendedTrainingHoursGiven)
	{
		double differenceInHours;

		differenceInHours = requiredTrainingHoursGiven - attendedTrainingHoursGiven;


	}

	public void explainDifferenceInHours(double requiredTrainingHoursGiven, double attendedTrainingHoursGiven)
	{
		if(calculateDifferenceInHours(requiredTrainingHoursGiven, attendedTrainingHoursGiven) > 0.0)
		{
			System.out.println("I'm afraid there is a problem...");
			System.out.println("You are required to have attened training for " + requiredTrainingHoursGiven + " hours");
			System.out.println("Unfortunately, you only trained for " + attendedTrainingHoursGiven + " hours");
			System.out.println("This means you must attend training for " + 
				calculateDifferenceInHours(requiredTrainingHoursGiven, attendedTrainingHoursGiven) + " more hours this month");
		}

		else
		{
			System.out.println("Your attended training time checks out! Great Job this month!");
		}
	}*/

	// toString method
	public String toString()
	{
		String output;

		output = super.toString() + "\n";
		output += "The team leader montly bonus was: $" + monthlyBonus + "\n";
		output += "The team leader's required training hours were " + requiredTrainingHours + "\n";
		output += "The team leader's attended training hours were " + attendedTrainingHours;

		return output;
	}
}