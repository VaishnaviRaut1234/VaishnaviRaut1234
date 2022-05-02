package myproject;

abstract class atm {
	
		abstract void withdraw();
	}

  class DataAbstraction extends atm()
	{
		void withdraw()
		{
			System.out.println("Withdraw successful");
		}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	DataAbstraction ob1 = new DataAbstraction();
	ob1.withdraw();
		}
	}

