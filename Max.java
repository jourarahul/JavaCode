package com.dsa.arrays;

public class Max {

	public static void main(String[] args) {
		int[] arr= {2,6,3,66,4};
		System.out.println(max(arr));
		
		System.out.println(maxRange(arr,1,2));
		
		
	}



	private static int max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
		// TODO Auto-generated method stub
		
	}

	private static int maxRange(int[] arr,int start,int end) {
		int max=arr[start];
		for(int i=start;i<end;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
		// TODO Auto-generated method stub
		
	}

	

}
