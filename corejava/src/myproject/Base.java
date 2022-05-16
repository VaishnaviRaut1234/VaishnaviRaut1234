package myproject;

abstract class Ba
{
	abstract void fun();
}
class Derived extends Ba
{
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ba b = new Derived();
		b.fun();
	}

}
