package Package_1;

public class Sample {

	public Sample() {
		System.out.println("Default constructor ");
	}
	
	public Sample(int a) {
		this();
		System.out.println("One parameterized constructor ");
	}
	
	public Sample(int a, int b) {
		
		System.out.println("Two parameterized constructor ");
	}
	
	public Sample(int a, int b, int c ) {
		
		System.out.println("Three parameterized constructor ");
		
	}

	public Sample(int a, int b, int c ,int d) {
		this(3,5);
		System.out.println("Four parameterized constructor ");
	}
	public static void main(String[] args) {
		//System.out.println("Break point");
		Sample obj1=new Sample(3,5,6);
		Sample obj2=new Sample(9);
		Sample obj3=new Sample(3,7,5,3);
	
		
		
		
		
	}
}

