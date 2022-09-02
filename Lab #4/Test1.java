import java.util.Scanner;

class Ex1
{
	public static double calculateBMI(double weight, double height)
	{
		double BMI = (weight/height*height)*(703);
		return BMI;
	}

	public static String findStatus(double bmi)
	{

		if(bmi<18.5)
		{
			return "Underweight";
		}

		else if(bmi >= 18.5 && bmi <= 24.9)
		{
			return "Normal";
		}

		else if(bmi >= 25 && bmi <= 29.9 )
		{
			return "Overweight";
		}

		else if (bmi >= 30)
		{
			return "Obese";
		}

		else
		{
			return "An invalid input!";
		}
	}

}

class Test1
{
	public static void main(String[] args)
	{
		double height = 5.5, weight = 60, bmi;
		String report;
		bmi = Ex1.calculateBMI( 60.0, 5.5 );
		report = Ex1.findStatus(bmi);

		System.out.println("Height is: "+height);

		System.out.println("Weight is: "+weight);

		System.out.println("BMI is: "+bmi);

		System.out.println("Status is: "+report);
		
	}
}