package LinearSearchPrograms;

public class MaximumWealth {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(maximumWealth(arr));
	}
	
	public static int maximumWealth(int[][] accounts)
	{
		
		int ans=Integer.MIN_VALUE;;
		for(int person=0; person<accounts.length;person++ )		{
			// when  you start a new col,
			int sum=0;
			for(int account=0; account<accounts[person].length;account++) {
				sum=sum+accounts[person][account];
			}
			// check with main answer
			if(sum>ans)
			{
				ans=sum;
			}
		}
		return ans;
	}
}
