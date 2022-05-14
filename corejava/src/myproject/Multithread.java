package myproject;

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b =new ThreadB();
		b.start();
		System.out.println("Hello");
		synchronized(b)
		{
			try
			{
				System.out.println("Waiting for b to complete..");
				b.wait();
				System.out.println("Welcome");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Total is"+b.total);
		}
	}
	}
		
		
		class ThreadB extends Thread
		{
			int total;
			@Override
			public void run()
			{
				synchronized(this)
				{
					for(int j=0; j<100; j++)
					{
						total+=j;
					}
					System.out.println("hi");
					notify();
				}
			}

	}

