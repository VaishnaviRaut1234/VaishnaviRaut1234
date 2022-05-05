package myproject;

public class Withoutexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int mynum[]= {10 , 1 , 2 , 3 , 4 ,11};
			System.out.println(mynum[10]);
		}catch(Exception e)
		{
			System.out.println("Element does not exit");
		}
		
	}

}
