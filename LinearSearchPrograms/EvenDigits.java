package LinearSearchPrograms;

public class EvenDigits {

	// find number that have even no of digits 
	// [18,124,9,1765,98,1]
	// ans =3
	public static void main(String[] args) {
		int arr[]= {18,124,9,1765,98,1,2121,-2132};
		System.out.println(findNumbers(arr));
		
	}
	static int findNumbers(int [] nums)
	{
		int count=0;
		for(int num : nums)
		{
			if(even(num))
			{
				count ++;
			}
		}
		return count;
	}
	
	// function to check whether number contains even no of digits or not
	private static boolean even(int num) {
		
		int  noOfDigits=digits(num);
		if(noOfDigits % 2==0)
		{
			return true;
		}
		
		// TODO Auto-generated method stub
		return false;
	}
	
	static int digits(int num)
	{
		if(num<0)
		{
			num=num*-1;
		}
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
}
