package Package_1;

public class Employe {
public Employe() 
{
	System.out.println("Default constructor....");
}
public Employe(int a)
{
	System.out.println("One Parameterized Constructor...");
}
public Employe(int a,int b)
{
	System.out.println("Two Parameterized Constructor");
}
public Employe(int a, int b, int c) 
{
	System.out.println("Three Parameterized Constructor");
}
     int a; int b ; int c ; int d ;
public Employe(int a1,int b1 , int c1, int d1)
{

	a=a1;
	b=b1;
	c=c1;
	d=d1;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}

public static void main(String[] args) {
	{
		Employe ob= new Employe(2,3,4);
		Employe ob1=new Employe(2,5);
		Employe ob2=new Employe();
		Employe ob3=new Employe(2);
		Employe ob4=new Employe(31,45,56,78);
	}
}
}


