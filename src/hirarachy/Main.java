//Employ hierarchy


package hirarachy;

import java.util.Scanner;

class Employ {
	public static String Name;
	public static int age;
	
	Employ(String Name,int age)
	{
		this.Name =Name;
		this.age=age;
		
	}
	public void display()
	{
		System.out.println("name of employee : "+Name);
		System.out.println("age of employee : "+age);
		
		
	}
	
}
class Teacher extends Employ
{
	public int T_id;
	//public String Designation;

    Teacher(int T_id)
    {
	   super(Name, age);
	   this.T_id=T_id;
	   }
    public void designation()
    {
    	super.display();
    	System.out.println("Teaching");
    }
}
class Hr extends Employ
{
	public int H_id;
	Hr(int H_id)
	{
		super(Name,age);
		this.H_id=H_id;
		
	}
	public void designation()
    {
    	super.display();
    	System.out.println("recruting");
    }
	
}
class Main
{
	public static void main(String args[])
	{
		System.out.println("select whose details u want 1.teacher 2.hr");
    	Scanner ac=new Scanner(System.in);
    	int a=ac.nextInt();
    	Employ em=new Employ("pavi",23);
    	if(a==1)
    	{
	        Teacher t=new Teacher(6);
	        t.designation();
    	}
    	else if(a==2)
    	{
	        Hr h=new Hr(90);
	        h.designation();
    	}
    	else
    	{
    		System.out.println("wrong number");
    	}
    	
    }
	
}
