package stringandarray;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "cat";
		String input2 = "tac";
		
		char []charIn1 = input1.toCharArray();
		char []charIn2 = input2.toCharArray();
		
		Arrays.sort(charIn1);
		Arrays.sort(charIn2);
		
		for(int i = 0; i<charIn1.length; i++){
			if(charIn1[i] != charIn2[i]){
				System.out.println(input1+ " is not a permutation of "+ input2);
				return;
			}
		}
		System.out.println(input1+ " is a permutation of "+ input2);

	}

}
