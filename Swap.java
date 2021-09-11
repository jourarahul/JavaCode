package com.dsa.arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] arr= {1,3,4,6,7,2,5};
		swap(arr,1,3);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}
}
