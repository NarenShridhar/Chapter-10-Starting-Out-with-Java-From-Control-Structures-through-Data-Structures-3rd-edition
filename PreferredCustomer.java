public class PreferredCustomer extends Customer
{
	// Created a double field called amountPuchased to hold the amount the customer purchased
	private double amountPurchased;

	// Created a double field called discountLevel to hold the customer's discount
	private double discountLevel;

	// No-arg constructor
	public PreferredCustomer()
	{
		super();
		amountPurchased = 0.0;
		discountLevel = 0.0;
	}

	// Constructor to assign values
	public PreferredCustomer(String nameGiven, String addressGiven, String phoneNumberGiven, String customerNumberGiven, boolean mailingListGiven,
		double amountPuchasedGiven)
	{
		super(nameGiven, addressGiven, phoneNumberGiven, customerNumberGiven, mailingListGiven);
		setAmountPurchased(amountPuchasedGiven);

		// If statements set the discount level based on the customers purchase totals
		if(amountPurchased < 500.00)
		{
			setDiscountLevel(0.0);
		}

		else if(amountPurchased >= 500.00 && amountPurchased < 1000.00)
		{
			setDiscountLevel(5.0);
		}

		else if(amountPurchased >= 1000.00 && amountPurchased < 1500.00)
		{
			setDiscountLevel(6.0);
		}

		else if(amountPurchased >= 1500.00 && amountPurchased < 2000.00)
		{
			setDiscountLevel(7.0);
		}	

		else if(amountPurchased >= 2000.00)
		{
			setDiscountLevel(10.0);
		}			
	}

	// Setter method for the amountPurchased
	public void setAmountPurchased(double amountPuchasedGiven)
	{
		amountPurchased = amountPuchasedGiven;
	}

	// Getter method for the amountPurchased
	public double getAmountPurchased()
	{
		return amountPurchased;
	}

	// Setter method to set the discount
	public void setDiscountLevel(double discountLevelGiven)
	{
		discountLevel = discountLevelGiven;
	}

	// Getter method to get the discount
	public double getDiscountLevel()
	{
		return discountLevel;
	}

	// toString method

	public String toString()
	{
		String output; 

		output = super.toString();

		output += "Amount Purchased: $" + amountPurchased + "\nDiscount Rate: " + discountLevel + "%";

		return output;
	}

	//WHY DIDN"T THE BELOW WORK BEFORE I JUST COPIED THE CODE FROM PREVIOUS SUPERCLASS?! 
	/*public String toString()
	{
		String output;

		String output = super.toString();

		output += "Amount Purchased: $" + amountPurchased + "\nDiscount Rate: " + discountLevel + "%";

		return output;
	}*/
}