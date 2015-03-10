package stringandarray;
import java.util.*;

public class MultipleofSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = "";
		try
		{
			input = sc.nextLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		int len = input.length();
		HashSet unique = new HashSet();
		for(int i=input.length()/2;i>0;i++)
		{
			if(input.length()%i==0)
			{
				String sub = input.substring(0, i-1);
				
			}
		}
					
	}

}
