package Package_1;

public class Student_1 
{
	int roll_no;
	int age;
	
	public void R1()
	{
		System.out.println("Welcome to all of you ");
	}
	public void R2()
	{
		System.out.println("Automation is Very Easy");
	}
	public static void main(String[] args) 
	{
	   
		Student_1 s=new Student_1();
		s.age=26;
		System.out.println("Age is: "+s.age);
		s.roll_no=3;
		System.out.println("Roll No is: "+s.roll_no);
		s.R1();
		s.R2();
	}
	
	

}
