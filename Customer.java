public class Customer extends Person
{
	// Created a String field called customerNumber to hold the customer's number
	String customerNumber;

	// Created a boolean field called mailingList to hold the customer's desire to be on the mailing list
	boolean mailingList;

	// No-arg constructor
	public Customer()
	{
		super();
		customerNumber = "No number yet";
		mailingList = false;
	}

	public Customer(String nameGiven, String addressGiven, String phoneNumberGiven, String customerNumberGiven, boolean mailingListGiven)
	{
		super(nameGiven, addressGiven, phoneNumberGiven);
		setCustomerNumber(customerNumberGiven);
		setMailingList(mailingListGiven);
	}

	// Setter method for the customerNumber
	public void setCustomerNumber(String customerNumberGiven)
	{
		customerNumber = customerNumberGiven;
	}

	// Getter method for the customer number
	public String getCustomerNumber()
	{
		return customerNumber;
	}

	// Setter method for the mailingList
	public void setMailingList(boolean mailingListGiven)
	{
		mailingList = mailingListGiven;
	}

	// Getter method for the mailingList
	public boolean getMailingList()
	{
		return mailingList;
	}

	// toString method
	public String toString()
	{
		String output; 

		output = super.toString();

		output += "Customer Number: " + customerNumber + "\nMailing List Status: " + mailingList + "\n";

		return output;
	}
}