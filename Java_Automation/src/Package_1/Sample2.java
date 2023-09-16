package Package_1;

public class Sample2 {
 public void m1() {
	 System.out.println("Default parameterized method");
 }
 public void m2(int a) {
	 System.out.println("One parameterized method"); 
 }
 public void m3(int a , int b) {
	 System.out.println("Two parameterized method");
 }
 public void m4(int a , int b , int c) {
	 System.out.println("Three parameterized method");
	 this.m3(7, 9);
	 this.m5(5, 2, 6, 0);
	 this.m1();
	 this.m2(6);
 }
 public void m5(int a , int b , int c ,int d) {
	 System.out.println("Four parameterized method");
 }
 public static void main(String[] args) {
	Sample2 obj1=new Sample2();
	obj1.m4(3,6,7);
}
}
