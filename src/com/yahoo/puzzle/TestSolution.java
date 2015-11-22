package com.yahoo.puzzle;

public class TestSolution {

	public static void main(String[] args) {
		
		//Reads file input.txt and returns input boolean matrix
		InputFileReader ifr = new InputFileReader();
		boolean input[][] = ifr.getInput();
		
		Solution solution = new Solution();
		
		//accepts input boolean values and returns the number of islands in ocean. 
		int answer = solution.findNoOfIslands(input);
		if(answer==-1)
			System.out.println("The Input was empty. Please try again.");
		else
			System.out.println("Number of islands found: "+solution.findNoOfIslands(input));
	}

}
