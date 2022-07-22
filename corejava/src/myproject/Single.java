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

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj = new Two();
		obj.disp1();
		obj.disp2();
	}

}
