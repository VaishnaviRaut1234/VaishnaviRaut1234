package myproject;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =0;
			System.out.println("a="+a);
			int b= 45/a;
			int c[] = {1};
			c[45] = 99;
		}catch(ArithmeticException e)
		{
			System.out.println("div by 0"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("div by 0"+e);
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);
		}
		System.out.println("exc");
	}

}
