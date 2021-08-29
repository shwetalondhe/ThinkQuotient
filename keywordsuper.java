package javapacket;
class keywordsuper
{
	
		 int c;
		}
		class fun extends keywordsuper
		{
			int c;
			void display()
			{
				c=100;
				super.c=10;
				System.out.println("c:"+c);
				System.out.println("super.c:"+super.c);	
			}
		}
		class derived
		{
			public static void main(String args[])
			{
				fun obj=new fun();
				obj.display();
			}
		}

