package myproject;

class Eclipse extends Thread
{
public void run()
{
	System.out.println("hi");
}
}

class Notebook extends Thread
{
	
}

class Chrome extends Thread
{
	
}
public class Threadprog 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Eclipse obj=new Eclipse();
		obj.start();
		Notebook ob1= new Notebook();
		ob1.start();
		Chrome ob2= new Chrome();
		ob2.start();

}
}
