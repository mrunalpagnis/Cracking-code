package stringandarray;

import java.util.Arrays;
import java.util.HashSet;


public class UniqueCharacters {

	public static void main(String[] args) {
		
		String input = "Mrunalaul";
		char [] charArray = input.toCharArray();
		char [] charArray1 = input.toCharArray();
		Arrays.sort(charArray1);
//		without using extra space
		for( int i = 1; i<charArray1.length; i++){
			if(charArray1[i]==charArray1[i-1]){
				System.out.println("Not unique");
				break;
			}
		}
//		System.out.println("unique");		
	
//		using extra data structure
		HashSet<Character> uniq = new HashSet<Character>();
		for( char ch : charArray){
			uniq.add(ch);
		}
		if(uniq.size()!=charArray.length)
			System.out.println("not unique");
		else
			System.out.println("unique");
	}
}
