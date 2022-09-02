//Write a program by creating an 'EmployeeInfo' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

import java.util.Scanner;

class EmployeeInfo
{
	double salary;
	int hours;

	
	
	void GetInfo(double salary, int hours)
	{
		this.salary = salary;
		this.hours = hours;
	}

	void AddWork(int hours)
	{
		if (hours > 6)
		{
			salary = salary +5;
		}
	}

	void Display()
	{
		System.out.println("Salary is as per work = "+salary);
	}
}

class Q2
{
	public static void main(String args[])
	{
		EmployeeInfo obj = new EmployeeInfo();

		Scanner sc = new Scanner(System.in);

		double salary;
		int hours;

		System.out.print("Enter the Salary: ");
		salary = sc.nextDouble();

		System.out.print("Enter the number of hours of work per day: ");
		hours = sc.nextInt();

		obj.GetInfo(salary, hours);
		obj.AddWork(hours);
		obj.Display();
		
		
	}

}