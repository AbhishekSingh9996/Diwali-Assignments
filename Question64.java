public class Question64{
	
	public static void print(int [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] bsort (int[] arr, int n){
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main (String [] args){
		int[] arr = new int[]{3,2,4,1};
		
		int[] org = bsort(arr,arr.length);
		print(org);
	}
}