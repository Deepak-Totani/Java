class Product
{
	String title;
	int q;
	double price;
	Product(String title, int q , double price )
	{
		this.title=title;
		this.q=q;
		this.price=price;
	}
  
	String getTitle()
	{
		return title;
	}
	
	int getQuantity()
	{
	   return q;
	}
	
	double getPrice()
	{
		return price;
	}	
	public String toString()
	{
		return "\t Product \n Title : "+title+"\n Quantity :"+q+"\n Price :"+price;
	}

}


class Store
{
	String name;
	String location;
	public Product productList[] = new Product[100];
	public int nbProduct;
	
	
	Store(String name , String location)
	{
		this.name=name;
		this.location=location;
	}

	String getTitle()
	{
		return name;
	}
	
	void addProduct(Product ob)
	{
		
	   productList[nbProduct]=ob;
	   nbProduct++;
	}
	
	
	boolean searchProduct(String productName)
	{
		boolean b=false;
		for(int i = 0 ; i<nbProduct ; i++)
		{
		if(productList[i].getTitle().equals(productName))
			b=true;
		}	
		
		 return	b;	
	}
	
	Product deleteProduct(String productName)
	{
		Product p =null;
		for(int i = 0 ; i<nbProduct ;i++)
		{
			if(productList[i].getTitle().equals(productName))
			{
				p = productList[i];
				for(int j = i ; j<nbProduct ;j++)
				{
					productList[j] = productList[j+1];
					
				}
				nbProduct--;
				break;
			
			}		
		}		
		return p;
	}
	
	void displayAll()
	{
		for( int i = 0 ; i<nbProduct; i++)
		{
			System.out.println(" Product "+productList[i].getTitle());
		}
	}	
}

class Company
{
	String name;
	Store arrayStore[]= new Store[10];
	int nbStore;
	
	Company(String name)
	{
		this.name=name;
	}
	
	
	String getTitle()
	{
		return name;
	}
	
	void addStore(Store s)
	{
		arrayStore[nbStore]=s;
		nbStore++;
	}
	
	 int searchNbstore(String name)
	{
		int c =  0;
		for(int i =0 ; i<nbStore ; i++)
		{
			for(int j = i ; j<arrayStore[i].nbProduct ; j++)
			{
				if(arrayStore[i].productList[j]!=null)
				{
					if(arrayStore[i].productList[j].getTitle().equals(name))
					{
						c++;
						break;
					}	
				}	
			}
		}
		if(c==0)
		System.out.println(" There is no Product");
		return c;	
	}
	
	void displayAll()
	{
		for(int i = 0 ; i<nbStore ; i++)
		{
			System.out.println(" Name of Store "+ (i+1) +" is " + arrayStore[i].getTitle());
		}
		
	}
}

class TestCompany
{
	public static void main(String args[])
	{
		Product p1 = new Product(" TV ",5,56000);
		Product p2 = new Product(" Bicycle ",3,36000);
		Product p3 = new Product(" LED ",4,14000);
		
		Store s1 = new Store("Makro", "Karachi"); 
        
        Store s2 = new Store("Hypermart"," Sukkur "); 
		
		System.out.println(" Products in Store 1");
		s1.addProduct(p1);
		s1.addProduct(p2);
		s1.addProduct(p3);
		s1.displayAll();

		boolean  temp = s1.searchProduct(" Bicycle ");
		System.out.println(" Do You  have product  "+temp);
		Product tempProctuct = s1.deleteProduct(" Bicycle ");
		if(tempProctuct!=null)
		{
			System.out.println(" Delete Product "+tempProctuct.getTitle());
		}
		else
			System.out.println(" There is no product for Delete ");
		s1.displayAll();
		
		System.out.println(" Products in Store 2");
		s2.addProduct(p1);
		s2.addProduct(p2);
		s2.addProduct(p3);
		s2.displayAll();
		
		System.out.println(" \t COMPANY ");
		Company c1 = new Company(" Universal ");
		c1.addStore(s1);
		c1.addStore(s2);
		c1.displayAll();
		int n = c1.searchNbstore(" Tv ");
		System.out.println(" Number of stores have TV "+n);
		
		
	}
}

