package vaishnavi;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1,j=1; i<10||j<10; i++,j++)
		{
			j++;
			System.out.println("i="+i+"and j="+j);
		}
		
		int i=1, j=1;
		while(i<10 || j<10 )
		{
			i++; j++;
			System.out.println("i="+i+"and j="+j);
		}
		int I=1, J=1;
		do {
			I++;
			J++;
			System.out.println("i="+I+"and j="+J);
		}while(I<10 || J<10);
		
	}

}
