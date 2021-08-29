package javapacket;

import javamorning.StaticVariable;

public class keywordstatic {
	
			int rollno;
			String name;
			static String college ="mno";
			keywordstatic(int r, String n)
			{
				rollno=r;
				name=n;
			}
			void display()
			{
				System.out.println(rollno+""+name+""+college);
			}
			public class Test
			{
				public void main(String args[])
				{
				keywordstatic s1 = new keywordstatic(10,"rst");
				keywordstatic s2 = new keywordstatic(12,"xyz");
				s1.display();
				s2.display();
				}
			}
			}


