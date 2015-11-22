package DynamicProgramming;

public class LongestPalindromeSubstringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abccba";
		int len = input.length();
		boolean matrix[][] = new boolean[len][];
		for(int i = 0; i < len; i++){
			matrix[i] = new boolean[len];
			matrix[i][i] = true;
		}
		
	}

}
