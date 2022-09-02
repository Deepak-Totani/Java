import java.util.Scanner;

class ex1
{
	public static double calculateBMI(double weight, double height)
	{
	
		double bmi = (weight/height*height)*703;
		return bmi;
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

		else if(bmi > 24.9 && bmi <= 29.9 )
		{
			return "Overweight";
		}

		else
		{
			return "Obese";
		}
	}

}

class Test
{
	public static void main(String []args)
	{
		double weight = 60.0, height = 5.5,BMI;
		String report;
		BMI=ex1.calculateBMI(weight,height);
		report=ex1.findStatus(BMI);
		System.out.println("Your final report is : "+report);
	}
}