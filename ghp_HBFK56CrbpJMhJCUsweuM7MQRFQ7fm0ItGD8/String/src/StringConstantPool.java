
public class StringConstantPool 
{
	public static void main(String args[])   
	{  
	    //it will get stored in the string pool      
	    String str1 = "Java";  
	    String str2 = "C++";  
	    //it returns the reference of the pooled instance i.e. str1  
	    //str3 will not be created in the string pool
	    String str3 = "Java";    
	    //stored in Java heap  
	    String str4 = new String ("Java");  
	    //stored in Java heap  
	    String str5 = new String ("C++");   
	    //str6 it will not get stored in Java heap  
	    //it will be stored in string pool  
	    String str6 = new String ("Java").intern();  
	    //returns false  
	    System.out.println(str1 == str4);  
	    //returns false 
	    //str2 occupies space in string pool and str7 occupies space in Java heap  
	    System.out.println(str2 == str5);   
	    //it returns true
	    //address of both strings are the same
	    System.out.println(str1 == str3);   
	}  
	}  

