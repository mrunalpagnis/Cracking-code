package stacks;

public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue s = new StackUsingQueue();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		System.out.println(s.pop());
		s.push(6);
		s.push(7);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
