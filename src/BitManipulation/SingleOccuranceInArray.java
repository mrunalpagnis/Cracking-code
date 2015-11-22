/**
 * 
 */
package BitManipulation;

/**
 * @author mrunal
 * http://www.geeksforgeeks.org/find-the-element-that-appears-once/
 */
public class SingleOccuranceInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,8,8,8,4,4,4,4,3};
		int x = 0, sum = 0, result = 0;
		for(int i =0; i<Integer.SIZE; i++){
			sum = 0;
			x = 1 << i;
			for(int j =0; j<arr.length; j++){
				if((arr[j] & x) > 0) sum++;
				
			}
			if(sum % 3 != 0)
				result = result | x;
		}
		System.out.println(result);
	}

}
