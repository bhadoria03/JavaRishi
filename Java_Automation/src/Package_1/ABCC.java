package Package_1;

public class ABCC 
{
	static int a;
	public static void abc() 
	{
		System.out.println("This is static Method");
		a=55;
		System.out.println(a);
	}
	
 public static void main(String[] args) {
	
	 ABCC.abc();
	 ABCC.a=344;
	 System.out.println(ABCC.a);
	
}

}
