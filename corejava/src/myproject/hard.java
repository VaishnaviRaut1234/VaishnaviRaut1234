package myproject;
import java.util.Scanner;
public class hard {
	String hard(String str)
	{
		String pattern = null;
		int patternCount;
		
		for(int i = 0; i< str.length() - 1; i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				String subStr = str.substring(i, j+1);
				patternCount = 1;
				
				for(int k =0; k<str.length()-subStr.length()+1; k++)
				{
					if(k==i) continue;
					if(subStr.equals(str.substring(k , k+subStr.length())))
					{
						patternCount++;
					}
				}
				if(patternCount >= 2 && (pattern == null || pattern.length()< subStr.length()))
				{
					pattern = subStr;
				}
			}
		}
		return pattern;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		hard c = new hard();
		System.out.println(c.hard(s.nextLine()));
		
	}

}
