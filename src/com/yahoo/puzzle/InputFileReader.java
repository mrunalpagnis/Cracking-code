package com.yahoo.puzzle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFileReader {

	public boolean[][] getInput() {
		
		//default matrix if the input from file is invalid or file not found
		boolean matrix[][] = {
				{true,false,true,false},
				{true,false,true,true},
				{false,true,false,true},
				{true,false,true,true}
			};
		
		
		Scanner sc = null;
		int matSize = -1;
		boolean input[][] = null;
		try {
			sc = new Scanner(new FileInputStream(new File("input.txt")));
			
			matSize = Integer.parseInt(sc.next());
			if(matSize<=0)
			{
				sc.close();
				return matrix;
			}
			else{
				input = new boolean[matSize][];
				for(int i =0; i<matSize; i++){
					input[i] = new boolean[matSize];
				}
			}
			for(int i = 0; i<matSize; i++){
				for(int j = 0; j<matSize; j++){
					if(sc.hasNext())
						input[i][j] = Boolean.parseBoolean(sc.next());
					else{
						System.out.println("Missing values in input matrix. Please input n*n values");
						matSize = -1;
						break;
					}
				}
				if(!sc.hasNext())
				{
					sc.close();
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("input.txt not found.");
			matSize = -1;
			//e.printStackTrace();
		} catch (NumberFormatException ex){
			System.out.println("Please enter integer value in first line of input.txt which indicates the size of input matrix (Enter n in n*n).");
			matSize = -1;
			//ex.printStackTrace();
		} 
		finally{
			try{
				if(sc!=null)
					sc.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		if(matSize<0){
			System.out.println("Running on default input: ");
			for(int i =0; i<matrix.length; i++){
				for(int j=0; j<matrix.length; j++)
					System.out.print(""+matrix[i][j]+" ");
				System.out.println();
			}
			return matrix;
		}
		else{
			System.out.println("Running on given input: ");
			for(int i =0; i<input.length; i++){
				for(int j=0; j<input.length; j++)
					System.out.print(""+input[i][j]+" ");
				System.out.println();
			}
			return input;
		}

	}
}
