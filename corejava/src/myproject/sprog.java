package myproject;
import java.util.*;

public class sprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> obj = new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(40);
		System.out.println(obj);
		obj.remove();
		
	
		System.out.println(obj);
		
		//System.out.println(obj.peek());
		obj.remove();
		System.out.println(obj);
	}

}
