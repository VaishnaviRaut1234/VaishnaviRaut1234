package myproject;
import java.util.Scanner;

public class library {

		int ACC_No;
		String Title;
		String Author;
		
		void input() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE Title OF BOOK:-");
			Title=sc.nextLine();
			System.out.println("ENTER THE Author OF BOOK:-");
			Author=sc.nextLine();
			System.out.println("ENTER THE ACCESS NO OF BOOK:-");
			ACC_No=sc.nextInt();
		}
		
		void compute() 
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the No Of Days Late:-");
			int days=sc1.nextInt();
			int fine=days*5;
			System.out.println("Your Fine Is RS.:-"+fine);
			
		}
		
			
		void display () 
			{
				System.out.println("ACC_NO :::"  + " AUTHOR :::"  +  " Title");
				System.out.println( ACC_No + " ::: "  + Author  + " ::: "+  Title);
			}
			

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			library ob=new library();
			ob.input();
			ob.compute();
			ob.display();
			
		}

	}


