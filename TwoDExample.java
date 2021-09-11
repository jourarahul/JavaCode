package com.dsa.arrays;

import java.util.Scanner;

public class TwoDExample {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int arr[][]=new int[3][2];		
				
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=in.nextInt();
			}
			
		}
		
		/*
		 * for(int row=0;row<arr.length;row++) { for(int
		 * col=0;col<arr[row].length;col++) { System.out.print(arr[row][col]+ " "); }
		 * System.out.println();
		 * 
		 * }
		 */
		
		int arr1[][]= {
				{1,2,3,4},
				{2,1},
				{1,3,5},
				{3,5,6,7,6}
		};
		
		for(int row=0;row<arr1.length;row++)
		{
			for(int col=0;col<arr1[row].length;col++)
			{
				System.out.print(arr1[row][col]+ " ");
			}
			System.out.println();
			
		}
		
		
	}
	
}
