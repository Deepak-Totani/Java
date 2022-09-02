class Alien
{
	int H;
	String N;

	
	Alien(int H,String N)
	{
		this.H=H;
		this.N=N;
	}
}

class SNAKE_ALIEN extends Alien
{
	int damage=0;
	SNAKE_ALIEN ()
	{
		super();
	}

	SNAKE_ALIEN(int H,String N)
	{
		super( H, N);
	}

	void Damage()
	{
		damage+=10;
	}
	
	int getDam()
	{
		return damage;
	}
}


class OGRE_ALIEN extends Aliens
{
	int damage=0;
	OGRE_ALIEN ()
	{
		super();
	}

	OGRE_ALIEN(int H,String N)
	{
		super( H, N);
	}

	void Damage()
	{
		damage+=6;
	}

	int getDam()
	{
		return damage;
	}
}

class MARSHMALLOW_MAN_ALIEN extends Aliens
{
	int damage=0;
	MARSHMALLOW_MAN_ALIEN ()
	{
		super();
	}
	
	MARSHMALLOW_MAN_ALIEN(int H,String N)
	{
		super( H, N);
	}
	
	void Damage()
	{
		damage+=3;
	}
	
	int getDam()
	{
		return damage;
	}
}

class Q5
{
	public static void main(String args[])
	{
		MARSHMALLOW_MAN_ALIEN obj= new MARSHMALLOW_MAN_ALIEN(6,"TOM");
		System.out.println("Alien name: "+ob1.N+"\nBefore Damage: "+obj.H);
		ob1.Damage();
		System.out.print("After Damage: "+(ob1.H-ob1.getDam()));
	}	
}