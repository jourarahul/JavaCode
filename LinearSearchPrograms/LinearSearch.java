package LinearSearchPrograms;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] nums= {12,4,-1,4,5,7,9,2,1,5,0};
		int target=5;
		int ans=linearSearch(nums,target);
		System.out.println(ans);
	}
	
	// search in the array // return the index i item found
	// otherwise return -1
	
	static int linearSearch(int[] arr,int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for(int i=0;i<arr.length;i++)
		{
			// check for element at every index
			int element=arr[i];
			if(target==element)
			{
				return i;
			}
		}
		
		return -1;
	}

}
