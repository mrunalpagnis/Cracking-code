package DataStructure;
import java.util.Stack;
public class PostfixEvaluation {
	
	
	int evaluatePostfix(char exp[])
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(-1);
		int i=0;
		while(i<exp.length)
		{
			switch(exp[i])
			{
				case '+':
						if(!st.empty())
						{
							int a = st.pop();
							int b = st.pop();
							st.push(b+a);
						}
						break;
				case '-':
					if(!st.empty())
					{
						int a = st.pop();
						int b = st.pop();
						st.push(b-a);
					}
					break;
				case '*':
					if(!st.empty())
					{
						int a = st.pop();
						int b = st.pop();
						st.push(a*b);
					}
				case '/':
					if(!st.empty())
					{
						int a = st.pop();
						int b = st.pop();
						st.push(b/a);
					}
				default:
					st.push(exp[i]-'0');
			}
			i++;
		}
		return st.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "231*+9-";
		char []exp = input.toCharArray();
		System.out.println("answer: "+new PostfixEvaluation().evaluatePostfix(exp));
	}

}
