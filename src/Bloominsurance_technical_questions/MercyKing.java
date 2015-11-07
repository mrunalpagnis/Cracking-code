package Bloominsurance_technical_questions;


public class MercyKing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		try
		{
			input = Integer.parseInt(args[0]);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println(new MercyKing().josephus(input,2));
	}
	public int josephus(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return (josephus(n-1, k) + k - 1)%n + 1;
	}

}
