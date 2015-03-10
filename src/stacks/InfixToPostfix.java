package stacks;

import java.util.Stack;

public class InfixToPostfix {
	boolean isOperand(char ch)
	{
		return ((ch>='a' && ch <='z') || (ch>='A' && ch <='Z'));
	}
	int precedence(char i)
	{
		switch(i)
		{
			case '+':
			case '-':
						return 1;
			case '*':
			case '/':
						return 2;
			case '^':
						return 3;
			default:
						return -1;
		}
	}
	void infixToPostfix(char []exp)
	{
		int i;
		java.util.Stack<Character> st = new Stack<Character>();
		st.push('$');
		String result = "";
	    for (i = 0; exp[i]!='\0'; ++i)
	    {
	         // If the scanned character is an operand, add it to output.
	        if (isOperand(exp[i]))
	            result += exp[i];
	         
	        // If the scanned character is an ‘(‘, push it to the stack.
	        else if (exp[i] == '(')
	            st.push(exp[i]);
	        
	        //  If the scanned character is an ‘)’, pop and output from the stack 
	        // until an ‘(‘ is encountered.
	        else if (exp[i] == ')')
	        {
	            while (!st.isEmpty() && (char) st.peek() != '(')
	                result += (char) st.pop();
	            if (st.isEmpty() && (char) st.peek() != '(')
	                return; // invalid expression                
	            else
	                st.pop();
	        }
	        else // an operator is encountered
	        {
	            while (!st.isEmpty() && precedence(exp[i]) <= precedence((char)st.peek()))
	                result += (char) st.pop();
	            st.push(exp[i]);

	        }
	    }
	    while (st.peek() != '$')
	        result += (char) st.pop();
	 
	    System.out.println( result );
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []exp = new char[100];
		String input = "a+b*(c^d-e)^(f+g*h)-i";
		int i=0;
		for(i=0;i<input.length();i++)
		{
			exp[i] = input.charAt(i);
		}
		new InfixToPostfix().infixToPostfix(exp);
	}

}
