package com.yahoo.puzzle;

import java.util.Stack;

/**
 * @author mrunal
 *	The solution takes O(n^2) time and O(n^2) extra space 
 *  Here I try to traverse like a DFS pushing all true adjacent nodes to the stack. Every Node I visit I mark it visited to avoid multiple traversals
 *  Then repeat this till my stack is empty. Once my stack is empty I know that One Island has been traversed.
 *  Now I go to the next unvisited True node and repeat process till all nodes are visited.
 *	Each node is visited only once. The Extra 2d matrix is used for keeping the track of visited nodes.
 */
public class Solution {

	public int findNoOfIslands(boolean matrix[][]){
		
		//Error on matrix input empty
		if(matrix == null)
			return -1;
		
		int matlen = matrix.length; 
		int noOfIslands = 0;
		
		int explored = matlen*matlen; //number of nodes to be visited
		int noVisited = 0;
		boolean visited[][];	//keep track of visited nodes
		
		//check number of false values in input
		for(int i = 0; i<matlen; i++){
			for(int j = 0; j<matlen; j++){
				if(!matrix[i][j])
					noVisited++;					
			}
		}
		
		//check if only one island or no island
		if(noVisited >= explored-1){
			return (explored - noVisited);
		}
		
		noVisited = 0;
		//initialize visited matrix with false values
		visited = new boolean[matlen][];
		for(int i = 0; i<matlen; i++){
			visited[i] = new boolean[matlen];
			for(int j=0;j<matlen; j++){
				visited[i][j] = false;
			}
		}
		
		Stack<Coordinates> st = new Stack<Coordinates>();
				
		//traverse till all nodes are not visited
		for(int i=0; i<matlen && noVisited < explored; i++){
			for(int j=0; j<matlen && noVisited < explored; j++){
				
				//New Island is found
				if(!visited[i][j] && matrix[i][j]==true){
					visited[i][j] = true;
					noVisited++;
					st.push(new Coordinates(i,j));
					noOfIslands++;
					
					//explore island till island is completely traversed
					while(!st.isEmpty() && noVisited < explored){
						Coordinates current = st.pop();
						
						//explore node to its top
						Coordinates up = new Coordinates(current.getX()-1,current.getY());
						
						//explore node to its bottom
						Coordinates down = new Coordinates(current.getX()+1,current.getY());
						
						//explore node to its right
						Coordinates right = new Coordinates(current.getX(),current.getY()+1);
						
						//explore node to its left
						Coordinates left = new Coordinates(current.getX(),current.getY()-1);
						
						//push to stack if explored nodes are unvisited and a part of current island.
						if(up.isValid(matlen) && matrix[up.getX()][up.getY()] && !visited[up.getX()][up.getY()]){
							visited[up.getX()][up.getY()]= true; 
							noVisited++;
							st.push(up);
						}
						if(down.isValid(matlen) && matrix[down.getX()][down.getY()] && !visited[down.getX()][down.getY()]){
							visited[down.getX()][down.getY()]= true; 
							noVisited++;
							st.push(down);
						}
						if(left.isValid(matlen) && matrix[left.getX()][left.getY()] && !visited[left.getX()][left.getY()]){
							visited[left.getX()][left.getY()]= true; 
							noVisited++;
							st.push(left);
						}
						if(right.isValid(matlen) && matrix[right.getX()][right.getY()] && !visited[right.getX()][right.getY()]){
							visited[right.getX()][right.getY()]= true; 
							noVisited++;
							st.push(right);
						}
					}
				}
					
			}
		}

		return noOfIslands; //answer
	}	
	
}
