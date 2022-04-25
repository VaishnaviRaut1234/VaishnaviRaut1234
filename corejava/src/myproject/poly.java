package myproject;

public class poly {
	void add(int x,int y)
	{
		System.out.println("Add two Numbers"+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("Add three Numbers"+(x+y+z));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		poly obj1 = new poly();
		obj1.add(3, 4);
		obj1.add(5,6,7);
	}

}
