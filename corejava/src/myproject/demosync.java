package myproject;

class counter{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class demosync {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		counter c = new counter();
		
		Thread t = new Thread(new RunnableClass())
				{
			public void run()
			{
				for(int i =1;i<1000;i++)
				{
				c.increment();	
				}
			
		System.out.println("Count "+c.count);
			}
	}};


Thread t1 = new Thread(new RunnableClass()
{
	public void run()
	{
		for(int i =1;i<1000;i++)
		{
			c.increment();
		}
		System.out.println("count is"+c.count);
	}
};
t.start();
t1.start();
t.join();
t1.join();
System.out.println("count is "+c.count);
}
}
