import java.util.ArrayList;
import java.util.List;

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

class Course {
	private List<Student> students;

	public Course()
	{
		students = new ArrayList<>();
	}

	public void addStudent(String index, String firstName, String lastName, ArrayList<Integer> labPoints)
	{
		Student student = new Student(index, firstName, lastName, labPoints);
		students.add(student);
	}

	public void addStudent(Student student)
	{
		students.add(student);
	}

	public void removeStudent(Student student)
	{
		students.remove(student);
	}

	public void printAllStudentsWithSignature()
	{
		for(Student s: students)
		{
			if(s.hasSignature())
			{
				System.out.println(s.getIndex() + "_" + s.getFirstName() + "_" + s.getLastName());
			}
		}
	}

	public void printStudentsWithAtLeast5AveragePoints()
	{
		for(Student s: students)
		{
			if(s.getAverage() >= 5)
			{
				System.out.println(s.getIndex() + "_" + s.getFirstName() + "_" + s.getLastName());
			}
		}
	}
}
