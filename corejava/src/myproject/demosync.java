package myproject;

class counter{
	int count;
	public void increment()
	{
		count++;
	}
}

public class demosync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c = new counter();
		c.increment();
		System.out.println("Count "+c.count);
	}

}
