public class Essay extends GradedActivity
{
	/*
		Created an instance final double variable called maximumEssayScore to hold the total max points for a student essay
		grade, which in this case is 100.0 points.
	*/

	private final double maximumEssayScore = 100.0;

	// Created an instance double variable grammarPoints to hold the maximum points a student can score for grammar
	private double grammarPoints = 30.0;

	// Created an instance double variable spellingPoints to hold the maximum points a student can score for spelling
	private double spellingPoints = 20.0;

	// Created an instance double variable lengthPoints to hold the maximum points a student can score for length
	private double lengthPoints = 20.0;

	// Created an instance double variable contentPoints to hold the maximum points a student can score for content
	private double contentPoints = 30.0;

	// No-arg Constructor
	public Essay()
	{
		super();
		grammarPoints = 0.0;
		spellingPoints = 0.0;
		lengthPoints = 0.0;
		contentPoints = 0.0;
	}

	// Constructor with arguments to assign values
	public Essay(double scoreGiven, double grammarPointsGiven, double spellingPointsGiven, double lengthPointsGiven, double contentPointsGiven)
	{
		super(scoreGiven);
		setGrammarPoints(grammarPointsGiven);
		setSpellingPoints(spellingPointsGiven);
		setLengthPoints(lengthPointsGiven);
		setContentPoints(contentPointsGiven);
	}

	// Setter method for the grammarPoints
	public void setGrammarPoints(double grammarPointsGiven)
	{
		grammarPoints = grammarPointsGiven;
	}

	// Getter method for the grammarPoints
	public double getGrammarPoints()
	{
		return grammarPoints;
	}

	// Setter method for the spellingPoints
	public void setSpellingPoints(double spellingPointsGiven)
	{
		spellingPoints = spellingPointsGiven;
	}

	// Getter method for the spellingPoints
	public double getSpellingPoints()
	{
		return spellingPoints;
	}

	// Setter method for the lengthPoints
	public void setLengthPoints(double lengthPointsGiven)
	{
		lengthPoints = lengthPointsGiven;
	}

	// Getter method for the lengthPoints
	public double getLengthPoints()
	{
		return lengthPoints;
	}

	// Setter method for the contentPoints
	public void setContentPoints(double contentPointsGiven)
	{
		contentPoints = contentPointsGiven;
	}

	// Getter method for the contentPoints
	public double getContentPoints()
	{
		return contentPoints;
	}

	// toString method
	public String toString()
	{
		String output;

		output = super.toString();

		output += "Grammar Points: " + grammarPoints;
		output += "\nSpelling Points: " + spellingPoints;
		output += "\nLength Points: " + lengthPoints;
		output += "\nContent Points: " + contentPoints;

		return output;
	}
}