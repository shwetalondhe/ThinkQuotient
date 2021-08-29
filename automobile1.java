package javapacket;

public class automobile1 {
	private int speed;
	private String company;
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	
	
	static class car extends automobile1{
		
		
	}
	 static class twowheeler extends car{
		
	}
	
	public static void main(String args[])
	{
	twowheeler obj1=new twowheeler ();
	obj1.setSpeed(60);
    obj1.setCompany("honda");
		System.out.println(obj1.getSpeed());
		System.out.println(obj1.getCompany());
		System.out.println("this is twowheeler class");
	}
	
	
	
	}
	




