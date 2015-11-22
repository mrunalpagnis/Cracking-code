package DynamicProgramming;

public class CoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ncoins = 4;
		int coins[] = {1,2,3,4};
		int total = 5;
		int matrix[][] = new int[ncoins][];
		for(int i = 0; i<ncoins; i++){
			matrix[i] = new int[total+1];
			for(int j = 0; j<total+1; j++){
				matrix[i][j] = 0;
			}
		}
		for(int j = 0; j<total+1; j++){
			matrix[0][j] = j/coins[0];
		}
		int i=0,j=0;
		for(i = 1; i<ncoins; i++){
			for(j = 1; j<total+1; j++){
				int a = j/coins[i];
				int b = j%coins[i];
				if(coins[i]>j)
					matrix[i][j] = matrix[i-1][j];
				else{
					matrix[i][j] = Math.min(a+matrix[i][b], matrix[i-1][j]);
				}
			}
		}
		i--;j--;
		System.out.println(matrix[i][j]);
		int result = matrix[i][j];
		int counter = 0;
		int []rcoins = new int[result];
		while(counter<result){
			if(matrix[i-1][j]==matrix[i][j]){
				i--;
			}
			else{
				j = j-coins[i];
				rcoins[counter++] = coins[i];
			}
		}
		
		for(int coin : rcoins){
			System.out.print(""+coin+" ");
		}
	}
}
