package yodle;
import java.io.*;
import java.util.*;
public class TriangleProblem {

	    private long cell;
	    private long weight;
		private boolean check;
	    
	    TriangleProblem(){
			cell=0;
	        weight = 0;
			check=false;
		}
	    
		public long getCellValue() {
			return cell;
		}

		public void setCellValue(long c) {
			cell = c;
		}
	    public long getWeight() {
			return weight;
		}

		public void setWeight(long weight) {
			this.weight = weight;
		}

		public boolean isCheck() {
			return check;
		}

		public void setCheck(boolean chk) {
			check = chk;
		}

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc;
			try {
				sc = new Scanner(new FileInputStream("triangle.txt"));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				System.out.println("searches triangle.txt file in default /src folder");
				return;
			}
			int n = 100;
			TriangleProblem[][] mat = new TriangleProblem[n][n]; //#rows in traingle
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					mat[i][j] = new TriangleProblem();
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					mat[i][j].setCellValue(0);
					mat[i][j].setCellValue(sc.nextLong());
				}
			}
			long sum = maxSum(0, 0, mat);
			
            System.out.println(""+sum);
            sc.close();
	    }
	    private static long maxSum(int i, int j, TriangleProblem[][] mat) {
			if (i == mat.length - 1){
				return mat[i][j].getCellValue();
			}
			else if (mat[i][j].isCheck()) {
				return mat[i][j].getWeight();
			} else {
				mat[i][j].setCheck(true);
				long sum = mat[i][j].getCellValue() + Math.max(maxSum(i + 1, j, mat), maxSum(i + 1, j + 1, mat));
				mat[i][j].setWeight(sum);
				return sum;	
			}

		}   
}
