package javapacket;
public class laptop
{
	private String company;
	private int price;
	public laptop(String pcompany)
	{
		this.company=pcompany;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
		public laptop(int sprice)
		{
		this.price=sprice;	
		}
		public int getPrice()
		{
			return price;
		}
		public void setPrice(int price)
		{
			this.price=price;
		}
		
		
		public static void main(String[]args)
		{
		laptop obj1=new laptop("dell");
		laptop obj2=new laptop(50000);
		System.out.println(obj1.getCompany());
		System.out.println(obj2.getPrice());
		}
	}
		
			


