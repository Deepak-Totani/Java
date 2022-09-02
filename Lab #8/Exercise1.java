import java.util.Scanner;
import java.util.InputMismatchException;
class Exercise1
{
	public static void main(String args[])
	{
		
		while(true)
		{
			Scanner scan = new Scanner(System.in);

			int n1, n2;
			double r;

	
			try
			{
				System.out.print("Enter number one: ");
				n1 = scan.nextInt();
				System.out.print("Enter number two: ");
				n2 = scan.nextInt();

				r = n1 / n2;

				System.out.println("Resul of division is: "+r);
			}
		

			catch(InputMismatchException e)
			{
				System.out.println("There is an exception: "+e);
			}
		
			catch(ArithmeticException e)
			{
				System.out.println("There is an exception: "+e);
			}
	
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("There is an exception: "+e);
			}

			catch(Exception e)
			{
				System.out.println("There is an exception: "+e);
			}
		
		}
	}
}