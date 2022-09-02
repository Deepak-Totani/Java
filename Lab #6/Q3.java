class Employee
{
	String firstName, lastName, cnic;
	
	Employee
	{
		firstName = "null";
		lastName = "null";
		cnic = "null";
	}
	Employee(String firstName, String lastName, String cnic)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnic = cnic;
	}
	
	void getData()
	{
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("CNIC: "+cnic);
	}
	
	void setData(String firstName, String lastName, String cnic)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnic = cnic;
	}
	
	String toString() 
	{  
		return firstName + “ ” + lastName + “ CNIC# ” + cnic ;  
	}
	
	double earning()
	{
		return 0.00;
	}
}

class SalariedEmployee extends Employee
{
	double weeklySalary;
	
	SalariedEmployee()
	{
		this.weeklySalary = 0.00;
	}
	SalariedEmployee(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
	
	void setData(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
	if(weeklySalary >= 0)
	{
		void getData()
		{
			System.out.println("Weekly Salary: "+weeklySalary);
		}
	}
	
	String toString()
	{
		return “\nSalaried employee: ” + super.toString();
	} 
	
	double earning()
	{
		return weeklySalary;
	}
}

class HourlyEmployee extends Employee
{
	double wage, hours;
	
	HourlyEmployee()
	{
		hours = 0.00;
		wage = 0.00;
	}
	HourlyEmployee(double wage, double hours)
	{
		this.hours = hours;
		this.wage = wage;
	}
	
	setData(double wage, double hours)
	{
		this.hours = hours;
		this.wage = wage;
	}
	
	if(wage >= 0 && hours >= 0)
	{
		getData()
		{
			System.out.println("Wage: "+wage);
			System.out.println("Hours: "+hours);
		}
	}
	
	String toString()
	{
		return “\nHourly employee: ” + super.toString();
	}
	
	double earnings()
	{
		if (hours <= 40)
		{
			return wage * hours;
		}
	}
}

class CommissionEmployee extends Employee
{
	
}