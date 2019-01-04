public class GradedActivity
{
	// Created an instance double variable to hold the score
	private double score;

	// No-arg constructor
	public GradedActivity()
	{
		score = 0;
	}

	// Constructor with an argument for assigning values
	public GradedActivity(double scoreGiven)
	{
		setScore(scoreGiven);
	}

	// Setter method for the score
	public void setScore(double scoreGiven)
	{
		score = scoreGiven;
	}
	

	// Getter method for the score
	public double getScore()
	{
		return score;
	}

	// Getter method to return the letter grade determined from the score field
	public char getGrade()
	{
		// Created a char variable letterGrade to hold the char return value of a grade based on the score
		char letterGrade;

		if (score >= 90)
		{
			letterGrade = 'A';
		}

		else if (score >= 80)
		{
			letterGrade = 'B';
		}

		else if (score >= 70)
		{
			letterGrade = 'C';
		}

		else if (score >= 60)
		{
			letterGrade = 'D';
		}

		else
		{
			letterGrade = 'F';
		}

		return letterGrade;
	}

	// toString method
	public String toString()
	{
		String output; 

		output = "Score: " + score + "\nGrade: " + getGrade() + "\n";

		return output;
	}
}