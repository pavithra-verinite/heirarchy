//human being hierarchy

package hirarachy;

import java.util.Scanner;

class Human
{
	public void show()
	{
		System.out.println("u are human being");
	}
}
class Girl extends Human
{
	public void show()
	{
		super.show();
		System.out.println("comes under female catagory");
	}
}
class Boy extends Human
{
	public void show()
	{
		super.show();
		System.out.println("comes under male catagory");
	}
}
class Others extends Human
{
	public void show()
	{
		super.show();
		System.out.println("comes under others catagory");
	}
}
class people
{
	public static void main(String args[])
	{

		System.out.println("select ur gender 1.female 2.male 3.others");
    	Scanner ac=new Scanner(System.in);
    	int a=ac.nextInt();
    	
    	if(a==3)
    	{
	        Others t=new Others();
	        t.show();
    	}
    	else if(a==2)
    	{
	        Boy h=new Boy();
	        h.show();
    	}
    	else if(a==1)
    	{
	        Girl h=new Girl();
	        h.show();
    	}
    	
    	
    	else
    	{
    		System.out.println("wrong number");
    	}
    	
    
	}
}



