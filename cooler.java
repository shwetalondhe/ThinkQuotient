package javapacket;
public class cooler
 {
	private String company;
	private int price;
	private String colour;
	public  cooler(String pcompany)
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
	 public  cooler(int sprice)
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
	public void cooler(String rcolour)
	{
		this.colour=rcolour;
	}
	
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	


public static void main(String args[]) {
	cooler obj1=new cooler("bajaj");
	 cooler obj2 =new cooler(10000);
	 cooler obj3 =new cooler("white");
	System.out.println( obj1.getCompany());
	System.out.println(obj2.getPrice());
	System.out.println(obj2.getColour());
	
	
}
}


