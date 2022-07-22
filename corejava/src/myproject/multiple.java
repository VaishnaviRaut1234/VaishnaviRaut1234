package myproject;

class one
{
	void disp1()
	{
		System.out.println("one");
	}
}
class Two extends one
{
	void disp2()
	{
		System.out.println("Two");
	}
}
class Three extends Two
{
	void disp3()
	{
		System.out.println("Three");
	}
}
class Four extends Three
{
	void disp4()
	{
		System.out.println("Four");
	}
}
public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj1 = new Four();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();

	}

}
