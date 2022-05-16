package myproject;

public class Example {

	Example()
	{
		System.out.println("Default constructor");
	}
	Example(int i,int j)
	{
		System.out.println("Constructor with Two parameter");
	}
	Example(int i,int j,int k)
	{
		System.out.println("Constructor with Three parameter");
	}
	Example(int i,String name)
	{
		System.out.println("Constructor with int and string");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		Example obj2 = new Example(12,12);
		Example obj3 = new Example(1,2,13);
		Example obj4 = new Example(1,"BeginnersBook");
	}

}
