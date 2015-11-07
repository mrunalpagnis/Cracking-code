/**
 * 
 */
package stringandarray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author mrunal
 * Given a string write a function to check if it is a permutation of a palindrome. A palindrome is a word or phase that is the same forwards and backwards. 
 */
public class PalindromePermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Tact Coa";
		input = input.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i<input.length(); i++){
			char key = input.charAt(i);
			if(key == ' ')
				continue;
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 0);
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<Character, Integer>> it = entrySet.iterator();
		boolean flag = false;
		
		while(it.hasNext()){
			Entry<Character, Integer> entry = it.next();
			if(entry.getValue()%2 == 1){
				if(flag){
					System.out.println("false");
					return;
				}
				else
					flag = true;
			}
		}
		
		System.out.println(true);
		map.clear();
	}

}
