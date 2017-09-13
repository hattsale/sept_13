class B
{
	public void print()
	{
		System.out.println("Class B");
	}
}

public class A extends B
{	
	public void print()
	{
		System.out.println("Class A");
	}
	public static void main(String[] args)
	{
		A a = new A();
		a.print();
		B b = new B();
		b.print();
		
		//A ab = new B();
		//ab.print();
		B ba = new A();
		ba.print();
	}
}
	
