package myproject;

abstract class Bas
{
	Bas()
	{
		System.out.println("Base constructor called");
	}
	abstract void fun();
}
class Derive extends Bas
{
	Derive()
	{
		System.out.println("Derived constructor class");
	}
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
public class Baseb {

	public static void main(String[] args) {
		Derive d = new Derive();
		// TODO Auto-generated method stub

	}

}
