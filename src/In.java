class A
{
	public void print()
	{
		System.out.println("Inside class A");
	}
}

public class In extends A
{
	public static void main(String[] args)
	{
		A a = new A();
		a.print();
	}
}
