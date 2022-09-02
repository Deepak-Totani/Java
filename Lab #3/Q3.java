//Create a class Vehicle.The class should have two fields-no_of_seats and no_of_wheels.
//Create two objects-Motorcycle and Car for this class. Your output should show the descriptions for Car and Motorcycle. 
import java.util.Scanner;

class Vehicle
{
	int num_of_seats;
	int num_of_wheels;

	
	void MyVehicle(int wheels, int seats)
	{
		this.num_of_seats = seats;
		this.num_of_wheels = wheels;
	}
	
	void ShowVehicle()
	{
		if (this.num_of_seats == 4 && this.num_of_wheels == 4)
		{
			System.out.print("Car has four seats four and wheels");
		}

		else if (this.num_of_seats == 2 && this.num_of_wheels == 2)
		{
			System.out.print("Bike has two seats and two wheels");
		}

		else
		{
			System.out.print("Invalid input");
		}
	}
}

class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);

		Vehicle Motorcycle = new Vehicle(), Car = new Vehicle();
		
		int seats, wheels;

		System.out.print("Enter number of wheels: ");
		wheels = sc.nextInt();
		System.out.print("Enter number of Seats: ");
		seats = sc.nextInt();

		Motorcycle.MyVehicle(wheels, seats);
		Car.MyVehicle(wheels, seats);
		
		Car.ShowVehicle();
	
		
	}

}