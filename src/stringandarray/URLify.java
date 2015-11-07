package stringandarray;

public class URLify {

	public static void main(String[] args) {
		
		String strInput = "Mr John Smith    ";
		int trueLength = 13;
		char []input = strInput.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<trueLength; i++){
			if(input[i] == ' '){
				sb.append("%20");
			}
			else
				sb.append(input[i]);
		}
		
		System.out.println(sb.toString());
	}

}
