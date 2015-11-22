
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Nihair";
		char rep = 'i';
		
		StringBuilder out = new StringBuilder();
		for(int i = 0;i<input.length();i++){
			if(input.charAt(i)==rep){
				out.append("bob");
			}
			else{
				out.append(input.charAt(i));
			}
		}
		System.out.println(out.toString());
	}

}
