interface Animal
{
	abstract void legs();
	abstract void eat();
}

class Spider implements Animal
{
	public void legs()
	{
		System.out.println("Spider has 8 legs");
	}
	public void eat()
	{
		System.out.println("Spider eats insects");
	}
}

class Caterpiller implements Animal
{
	public void legs()
	{
		System.out.println("Spider has 6 legs");
	}
	public void eat()
	{
		System.out.println("Catepiller eats grass");
	}
}

class Cat implements Animal
{
	public void legs()
	{
		System.out.println("Spider has 4 legs");
	}
	public void eat()
	{
		System.out.println("Cats eat mouse");
	}
}

class Task3
{
	public static void main(String args[])
	{
		Spider ob = new Spider();
		Caterpiller ob1 = new Caterpiller();
		Cat ob2 = new Cat();
		
			ob.legs();
			ob.eat();

			ob1.legs();
			ob1.eat();

			ob2.legs();
			ob2.eat();
	}
}