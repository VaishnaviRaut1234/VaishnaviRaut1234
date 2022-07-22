package myproject;

abstract class b
{
	final void fun()
	{
		System.out.println("Derived fun() called");
	}
}
class d extends b
{
	
}

class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b B= new d();
		B.fun();
	}

}
