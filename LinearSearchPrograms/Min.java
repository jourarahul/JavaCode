package LinearSearchPrograms;

public class Min {

	public static void main(String[] args) {
		int a[]= {18,12,2,3,14,28};
		System.out.println(searchMin(a));
	}
	
	//assume arr.length!=0
	 static int searchMin(int[] arr)
	 {
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<min)
			 {
				 min=arr[i];
			 }
		 }
		return min;
		 
	 }
}
