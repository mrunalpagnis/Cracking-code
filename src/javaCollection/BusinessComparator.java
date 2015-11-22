/**
 * 
 */
package javaCollection;

import java.util.*;

/**
 * @author mrunal
 *
 */
public class BusinessComparator implements Comparator<String>{

	Map<String,Integer> business;
	BusinessComparator(Map<String, Integer> business2){
		business = business2;
	}
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		if(business.get(arg0)<business.get(arg1))
			return -1;
		else if(business.get(arg0)>business.get(arg1))
			return 1;
		else
			return 0;
	}
	
}
