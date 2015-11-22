package DynamicProgramming;

import java.util.Stack;

public class YahooQuestion {
	static int length;
	static boolean matrix[][] = {
		{true,false,true,false},
		{true,false,true,true},
		{false,false,true,true},
		{true,true,true,true}
	};
	static int noOfIslands = 0;
	static int noVisited = 0;
	static int explored = matrix.length*matrix.length;
	static boolean visited[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length = matrix.length;
		visited = new boolean[matrix.length][];
		for(int i = 0; i<matrix.length; i++){
			visited[i] = new boolean[matrix.length];
			for(int j=0;j<length; j++){
				visited[i][j] = false;
			}
		}
		Stack<Coordinates> st = new Stack<Coordinates>();
		for(int i=0; i<matrix.length && noVisited < explored; i++){
			for(int j=0; j<matrix.length && noVisited < explored; j++){
				if(!visited[i][j] && matrix[i][j]==true){
					visited[i][j] = true;
					noVisited++;
					st.push(new Coordinates(i,j));
					noOfIslands++;
					while(!st.isEmpty() && noVisited < explored){
						Coordinates current = st.pop();
						Coordinates up = new Coordinates(current.x-1,current.y);
						Coordinates down = new Coordinates(current.x+1,current.y);
						Coordinates right = new Coordinates(current.x,current.y+1);
						Coordinates left = new Coordinates(current.x,current.y-1);
						if(isValid(up) && matrix[up.x][up.y] && !visited[up.x][up.y]){
							visited[up.x][up.y]= true; 
							noVisited++;
							st.push(up);
						}
						if(isValid(down) && matrix[down.x][down.y] && !visited[down.x][down.y]){
							visited[down.x][down.y]= true; 
							noVisited++;
							st.push(down);
						}
						if(isValid(left) && matrix[left.x][left.y] && !visited[left.x][left.y]){
							visited[left.x][left.y]= true; 
							noVisited++;
							st.push(left);
						}
						if(isValid(right) && matrix[right.x][right.y] && !visited[right.x][right.y]){
							visited[right.x][right.y]= true; 
							noVisited++;
							st.push(right);
						}
					}
				}
					
			}
		}
		System.out.println(noOfIslands);
	}

	private static boolean isValid(Coordinates up) {
		// TODO Auto-generated method stub
		if(up.getX()<0 || up.getX()>=length || up.getY()<0 || up.getY()>=length)
			return false;
		return true;
	}

}
