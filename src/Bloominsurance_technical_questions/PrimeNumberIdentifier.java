package Bloominsurance_technical_questions;
import java.util.*;

class PrimeNumberIdentifier{
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        try
        {
            input = sc.nextInt();
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        if(input<=0)
        {
        	System.out.print("input invalid");
        }
        for(int i=3;i*i<=input;i=i+2)
        {
            if(input%i==0)
            {
            	System.out.println("Not prime");
            	sc.close();
            	return;
            }
        }
        System.out.println("prime");
        sc.close();
    }
}