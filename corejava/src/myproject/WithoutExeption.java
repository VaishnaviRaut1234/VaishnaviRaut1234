package myproject;

public class WithoutExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =0 , a;
		try {
			a = 55/d;
		}catch(ArithmeticException e)
		{
			System.out.println("Div by zero");
		}
		System.out.println("will not print");
	}

}
