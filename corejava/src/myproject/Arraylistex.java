package myproject;
import java.util.ArrayList;
import java.util.List;

public class Arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		System.out.println("Adding element to end of the list");
		
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("G");
		
		System.out.println("ArrayList insertion order"+list);
		
		System.out.println("Adding an element at specific index after B element");
		
		list.add(2,"c");
		
		System.out.println("ArrayList insertion order after adding C " +list);
		
		System.out.println("Adding an element at a specific index after E");
		
		list.add(5,"F");
		
		System.out.println("ArrayList insertion order after adding F: "+list);
		
	}

}
