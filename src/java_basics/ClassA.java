package java_basics;

public class ClassA {

	int a=40;
	void run(){
		System.out.println("In class A value is "+a);
	}
	
	
	
}
class B extends ClassA{
	
	int b=32;
	public static void main(String a[])
	{
		ClassA ab=new B();
		ab.run();
		
	}
	void run(){
		System.out.println("This is class b with value="+b);
	}
	
}
