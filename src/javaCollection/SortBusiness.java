package javaCollection;
import java.util.*;
public class SortBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> business = new HashMap<String,Integer>();
		business.put("B1", 4);
		business.put("B2", 5);
		business.put("B3", 1);
		business.put("B4", 3);
		business.put("B5", 2);
		
		BusinessComparator bc = new BusinessComparator(business);
		Map<String, Integer> ranking = new TreeMap<String, Integer>(bc);
		ranking.putAll(business);
		System.out.println(ranking.toString());
	}

}
