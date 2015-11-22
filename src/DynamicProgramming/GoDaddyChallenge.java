package DynamicProgramming;
import java.util.*;
public class GoDaddyChallenge {
	 static int[] wiggleArrangeArray(int[] intArr) {
	        int output[] = new int[intArr.length];
	        boolean flag = true;
	        PriorityQueue<Integer> minpq = new PriorityQueue<Integer>(intArr.length, new Comparator<Integer>(){
	            public int compare(Integer a, Integer b){
					if(a<b)
						return -1;
					else if(a>b)
						return 1;
					return 0;
				}
	        });
	        PriorityQueue<Integer> maxpq = new PriorityQueue<Integer>(intArr.length, new Comparator<Integer>(){
	            public int compare(Integer a, Integer b){
					if(a>b)
						return -1;
					else if(a<b)
						return 1;
					return 0;
				}
	        });
	        
	        for(int a : intArr){
	            minpq.add(a); maxpq.add(a);
	        }
	        int i = 0;
	        while(!minpq.isEmpty() && !maxpq.isEmpty()){
	            if(flag){
	                output[i] = (int) maxpq.poll();
	                minpq.remove(output[i]);
	                flag = false;
	            }
	            else{
	                output[i] = (int) minpq.poll();
	                maxpq.remove(output[i]);
	                flag = true;
	            }
	            i++;
	        }
	        return output;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5};
		int arr2[] = {1,2,3,4,-5,-3};
//		Set<Integer> hs = new HashSet<Integer>();
//		for(int a : arr){
//			hs.add(a);
//		}
//		for(int b : arr2){
//			if(hs.contains(b))
//				System.out.println(b+" ");
//		}
		
		for(int a : wiggleArrangeArray(arr2)){
			System.out.println(a+" ");
		}
	}

}
