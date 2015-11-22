package stringandarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SetOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfWords = Integer.parseInt(sc.nextLine());
		String listOfWords[] = new String[noOfWords];
		for(int i=0;i<noOfWords; i++){
			listOfWords[i] = sc.nextLine();
		}
		ArrayList<ArrayList<String>> AnagramSet = new ArrayList<ArrayList<String>>();
		Map<String,Integer> listNumber = new HashMap<String,Integer>();
		int listCount = 0;
		for(String word: listOfWords){
			char wordChar[] = word.toCharArray();
			Arrays.sort(wordChar);
			String sortWord = new String(wordChar);
			if(listNumber.containsKey(sortWord)){
				AnagramSet.get(listNumber.get(sortWord)).add(word);
			}
			else{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(word);
				listNumber.put(sortWord,listCount++);
				AnagramSet.add(temp);
			}				
		}
		System.out.println(AnagramSet);
		sc.close();
	}

}
