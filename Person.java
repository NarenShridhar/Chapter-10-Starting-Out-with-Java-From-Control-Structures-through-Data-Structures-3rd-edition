public class Person
{
	// Created an instance String variable called name to hold the person's name
	private String name;

	// Created an instance String variable called address to hold the person's address
	private String address;

	// Created an instance String variable called phoneNumber to hold the person's telephone number
	private String phoneNumber;

	// No-arg constructor;
	public Person()
	{
		name = "No name yet";
		address = "No address yet";
		phoneNumber = "No phone number yet";
	}

	// Constructor for assigning values
	public Person(String nameGiven, String addressGiven, String phoneNumberGiven)
	{
		setName(nameGiven);
		setAddress(addressGiven);
		setPhoneNumber(phoneNumberGiven);
	}

	// Setter method for the name
	public void setName(String nameGiven)
	{
		name = nameGiven;
	}

	// Getter method for the name
	public String getName()
	{
		return name;
	}

	// Setter method for the address
	public void setAddress(String addressGiven)
	{
		address = addressGiven;
	}

	// Getter method for the address
	public String getAddress()
	{
		return address;
	}

	// Setter method for the phone number
	public void setPhoneNumber(String phoneNumberGiven)
	{
		phoneNumber = phoneNumberGiven;
	}

	// Getter method for the phone number
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	// toString method
	public String toString()
	{
		String output = "";

		output = "Name: " + name +  "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\n";

		return output;
	}
}