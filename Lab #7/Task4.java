import java.util.*;

abstract class Marks
{
	abstract double getPerct();
}

class A extends Marks
{
	int eng , math , calc;
	
	A(int a , int b ,int c)
	{
		eng = a;
		math = b;
		calc = c;
	}

	double getPerct()
	{
		return ((eng+math+calc)*100)/300;
	}
}

class B extends Marks
{
	int eng , math , calc , ict;

	B(int a , int b ,int c , int d)
	{
		eng = a;
		math = b;
		calc = c;
		ict = d;
	}
	
	double getPerct()
	{
		return ((eng+math+calc+ict)*100)/400;
	}
}

class Task4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of student A!");
		System.out.println("=========================");
		System.out.print("Subject 1: ");
		int w = sc.nextInt();
		System.out.print("Subject 2: ");
		int x = sc.nextInt();
		System.out.print("Subject 3: ");
		int y = sc.nextInt();

		A ob = new A(w , x, y);

		System.out.println("Enter marks of student B!");
		System.out.println("=========================");
		System.out.print("Subject 1: ");
		int l = sc.nextInt();
		System.out.print("Subject 2: ");
		int m = sc.nextInt();
		System.out.print("Subject 3: ");
		int n = sc.nextInt();
		System.out.print("Subject 4: ");
		int o = sc.nextInt();
		
		B ob1 = new B(l, m, n, o);
	
		System.out.println("percetntage of student A = "+ob.getPerct()+"%");
		System.out.println("percetntage of student B = "+ob1.getPerct()+"%");
	}
}