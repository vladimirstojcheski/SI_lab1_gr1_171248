import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints;
	//TODO constructor

	public Student(String index, String firstName, String lastname, ArrayList<Integer> labPoints)
	{
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastname;
		this.labPoints = labPoints;
	}

	//TODO seters & getters

	public String getIndex()
	{
		return index;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
		int suma=0;
		for(int poeni: labPoints)
		{
			suma+=poeni;
		}
		return (double) suma/labPoints.size();

	}

	public boolean hasSignature() {
		//TODO
		return labPoints.size()>8;
	}
}
