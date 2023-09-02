package Package_1;

public class Swift extends Maruti 
{

	public void Rishi() 
	{
		super.method1();
		System.out.println(" I am child method");
		super.method2(299);
	}
	public static void main(String[] args) 
	{
		Swift obj=new Swift();
		obj.Rishi();
	}
}
