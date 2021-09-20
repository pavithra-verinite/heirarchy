//operating system hierarchy

package hirarachy;


class Os
{
	public void show()
	{
		System.out.println("it is one type of operating System");
	}
	
}
class Windows extends Os
{
	public void show()
	{
		System.out.println("windows");
		super.show();
	}
	
}
class Ubuntu extends Os
{
	public void show()
	{
		System.out.println("Ubuntu");
		super.show();
	}
	
}
public class operating_system {
	public static void main(String args[])
	{
		Ubuntu u=new Ubuntu();
		u.show();
	}

}
