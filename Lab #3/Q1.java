class Employee
{
	String name;
	int year;
	String address;
	
	Employee(String name, int year, String address)
	{
		this.name = name;
		this.year = year;
		this.address = address;
	}

	void Display()
	{
		System.out.println(name+"\t\t"+year+"\t\t\t"+address);
	}
	
}

class Q1
{
	public static void main (String args[])
	{
		System.out.println("Name\t\tYear of Joining\t\tAddress");

		Employee obj1 = new Employee("Robert", 1994 , "64C- WallsStreat");
		Employee obj2 = new Employee("Sam", 2000 , "68C- WallsStreat");
		Employee obj3 = new Employee("John", 1990, "26B- WallsStreat");

		obj1.Display();

		obj2.Display();

		obj3.Display();
		
	}
}