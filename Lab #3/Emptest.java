class Employee
{
	int salary = 340;
	
	Employee()
	{
		salary = 34000;
	}
	
	Employee(int salary)
	{
		this.salary = salary;
	}

	void empDisplay()
	{
		System.out.println("Salary is: "+salary);		
	}

	void Display()
	{
		System.out.println("Salary is: "+salary);		
	}
}

class Emptest
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		Employee emp = new Employee(2400);
		System.out.println(e.salary);
		e.Display();
		emp.Display();
	}
}