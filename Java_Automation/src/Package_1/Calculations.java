package Package_1;

public class Calculations {

	int a;
	int b;
	int c;
	public int Add() {
	 	
	 c= a-b ;
	//System.out.println("Value of C is :"+c);	
	return c;
		
	}
	public static void main(String[] args) {
		Calculations obj=new Calculations();
				obj.a=10;
		        obj.b=7;
		        obj.Add();
		        System.out.println("Value of C is :"+obj.c);
		        
		       
	}

}
