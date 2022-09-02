class JavaException3 
{
	static void age(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not elgible!");
		}

		else
		{
			System.out.println("You are eligible.");
		}
	}

	public static void main(String args[])
	{
		age(20);
	}
}