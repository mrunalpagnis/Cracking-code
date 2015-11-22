package BitManipulation;

import java.util.Stack;

public class IntegerToBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		Stack<Integer> st = new Stack();
		StringBuilder sb = new StringBuilder();
		while(num>0){
			int val = num%2;
			num = num/2;
			st.push(val);
		}
		while(!st.isEmpty())
			sb.append(st.pop());
		System.out.println(sb.toString());
	}

}
