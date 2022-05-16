package myproject;
import java.util.*;

public class sprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> obj = new Stack();
		obj.push(10);
		obj.push(20);
		obj.push(40);
		System.out.println(obj);
		
	
		System.out.println(obj);
		
		System.out.println(obj.peek());
		obj.remove(2);
		System.out.println(obj);
	}

}
