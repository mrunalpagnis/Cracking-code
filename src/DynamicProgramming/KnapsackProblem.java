package DynamicProgramming;
import java.util.*;

public class KnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {2,4,6,9};
		int weights[] = {2,2,4,5};
		
		int total = 8;
		
		System.out.println(""+optimalSolution(values, weights, total));
	}

	private static int optimalSolution(int[] values, int[] weights, int total) {
		// TODO Auto-generated method stub
		Map<Index,Integer> knapMap = new HashMap<Index, Integer>();
		
		return knapsack(values, weights, total, 0, knapMap);
		
	}

	private static int knapsack(int[] values, int[] weights, int total, int current,
			Map<Index, Integer> knapMap) {
		if(current>=values.length || total <= 0)
			return 0;
		Index item = new Index();
		item.items = values.length - current - 1;
		item.weights = total;
		if(knapMap.containsKey(item)){
			return knapMap.get(item);
		}
		
		int max;
		
		if(total < weights[current]){
			max = knapsack(values, weights, total, current + 1, knapMap);
		}
		else {
			max = Math.max(values[current] + knapsack(values, weights, total - weights[current], current + 1, knapMap), knapsack(values, weights, total, current + 1, knapMap));
		}
		knapMap.put(item, max);
		return max;
	}

}
