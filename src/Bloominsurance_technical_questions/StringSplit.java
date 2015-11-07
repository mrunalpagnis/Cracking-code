package Bloominsurance_technical_questions;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2)
		{
			System.out.println("invalid input");
			return;
		}
        int input = 0;
        try{
        	input = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException ex)
        {
        	ex.printStackTrace();
        }
        String inputString = args[1];
        
        if(input<=0)
        {
        	System.out.print("input invalid");
        }
        String words[];
        try{
         words = inputString.split(" ");
        }
        catch(Exception ex)
        {
        	System.out.println("invalid input");
			return;
        }
        int count = words[0].length();
        int i=0;
        for(i=0;i<words.length-1;i++)
        {
        	if(count<input)
        	{
        		System.out.print(words[i]+" ");
        		count += words[i+1].length();
        	}
        	else
        	{
        		System.out.print("\n"+words[i]+" ");
        		count = words[i].length()+words[i+1].length();
        	}
        }
        System.out.print(words[i]);
	}

}
