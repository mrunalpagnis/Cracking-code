import java.util.Stack;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "nihar";
		Stack<Character> s = new Stack<Character>();
		for(int i =0;i < input.length(); i++){
			s.push(input.charAt(i));
		}
		while(!s.isEmpty()){
			System.out.print(s.pop());
		}
	}

}
