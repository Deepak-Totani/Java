class Message
{
	String text;
	Message()
	{
		text=null;
	}

	Message(String text)
	{
		this.text=text;
	}

	void SetString(String text)
	{
		this.text=text;
	}
	
	public String toString()
	{
		return text;
	}

	public static boolean ContainsKeyword(Message messageObject,String keyword) 
	{
		if (messageObject.toString().indexOf(keyword,0) >= 0)
			return true;
		else
		return false;
	}


}
	class SMS extends Message
	{
		String recipientContactNo;
		SMS()
		{
			super("");
			recipientContactNo=null;
		}

	SMS(String sms,String recipientContactNo)
	{
		super.text=sms;
		this.recipientContactNo=recipientContactNo;
	}
	
	void setrecipientcontactno(String recipient)
	{
		this.recipientContactNo=recipient;
	}

	String getrecipientcontactno()
	{
		return recipientContactNo;
	}

	public String toString()
	{
		return super.text=(super.toString()+','+getrecipientcontactno());
	}
}

class Email extends Message
{
	String sender,receiver,subject;
	Email(String sms,String sender,String receiver,String subject)
	{
		super(sms);
		this.sender=sender;
		this.receiver=receiver;
		this.subject=subject;
	}
	
	void setter(String sender,String receiver,String subject)
	{
		this.sender=sender;
		this.receiver=receiver;
		this.subject=subject;
	}
	
	String getter()
	{
		return (sender+','+receiver+','+subject);
	}

	public String toString()
	{
		return super.text=(super.toString()+','+getter());
	}

	void encode(String text)
	{
		int i=0;
		char d;
	
		for(i=0;i<text.length();i++)
		{
			d=text.charAt(i);
			if(d=='z'||d=='Z'||d==' ')
			{
				if(d=='z')
					d='a';
				else if(d=='Z')
					d='A';
				else if(d==' ')
					
				continue;
			}
		else
			d++;

			System.out.print(d);
		}

	}


}

class Q4
{
	public static void main(String[] args)
	{
		Email e=new Email("This is Deepak","Deepak","Haseeb","Introducing");
		System.out.println(e.toString());
		System.out.println("Is there Haseeb:  "+Message.ContainsKeyword(e,"Haseeb"));
		SMS s=new SMS("This is haseeb","0323");
		System.out.println(s.toString());
		System.out.println("Is there abc: "+Message.ContainsKeyword(s,"abc"));
		System.out.print(" Email ");
		e.encode("I am java");
	}
}