package myproject;

abstract class B
{
	void fun()
	{
		System.out.println("Base fun() called");
	}
}
class Deriv extends B
{
	
}

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deriv d = new Deriv();
		d.fun();
	}

}
