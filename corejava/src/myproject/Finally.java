package myproject;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data = 100/0;
	System.out.println(data);
	
}
catch(Exception e)
{
	System.out.println("Can't divide integer by 0!");

}finally
{
	System.out.println("The 'try catch' is finished" );

}
	}

}
