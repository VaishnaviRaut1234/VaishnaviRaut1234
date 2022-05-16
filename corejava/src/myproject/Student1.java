package myproject;

class CFG {
	public int rollno;
	public String name;
	CFG(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	}
public class Student1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CFG[] arr;
		arr = new CFG[5];
		arr[0] = new CFG(1, "aman");
		arr[1] = new CFG(2, "vaibhav");
		arr[2] = new CFG(3, "shrikar");
		arr[3] = new CFG(4, "dharmesh");
		arr[4] = new CFG(5, "mohit");
		
		for(int i = 0; i<arr.length; i++)
			System.out.println("Element at"+i+":"+arr[i].rollno+" "+arr[i].name);

	}
}


