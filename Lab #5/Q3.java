//package Lab5

class Person
{
	private String Fname, Lname;
	
	Person(String Fname, String Lname)
	{
		this.Fname = Fname;
		this.Lname = Lname;
	}
	
	void setValue(String Fname, String Lname)
	{
		this.Fname = Fname;
		this.Lname = Lname;
	}
	
	String Fname()
	{
		return Fname;
	}
	
	String Lname()
	{
		return Lname;
	}
	
	void Display()
	{
		System.out.println("First Name: "+Fname);
		System.out.println("Last Name: "+Lname);
	}
}

class Student extends Person
{
	String id, course, teacherName;
	
	Student(String Fname, String Lname, String id, String course, String teacherName)
	{
		super(Fname, Lname);
		this.id = id;
		this.course = course;
		this.teacherName = teacherName;
	}
	
	void Display()
	{
		super.Display();
		System.out.println("ID: "+id);
		System.out.println("Course: "+course);
		System.out.println("teacherName: "+teacherName);
	}
}

class Teacher extends Person
{
	String subName, salary;
	
	Teacher(String Fname, String Lname, String subName, String salary)
	{
		super(Fname, Lname);
		this.subName = subName;
		this.salary = salary;
	}
	
	void Display()
	{
		super.Display();
		System.out.println("Subject Name: "+subName);
		System.out.println("Salary: "+salary);
	}
}

class Q3
{
	public static void main(String args[])
	{
		Student s1 = new Student("Deepak", "Totani", "023-21-0128", "BSCS", "Sehar Gul");
		Student s2 = new Student("Ali", "Khan", "013-19-5128", "BSSE", "Faheem Akhtar");
		Teacher t1 = new Teacher("Deepak", "Totani","OOP", "140000");
		Teacher t2 = new Teacher("Ali", "Khan","C++", "120000");
		
		s1.Display();		
		s2.Display();		
		t1.Display();		
		t2.Display();		
	}
}