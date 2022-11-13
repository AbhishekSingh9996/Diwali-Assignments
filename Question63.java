public class Question63{
	
	public static void print (int [] arr){
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate(int[] arr, int idx, int n){
		int temp[] = new int[n];
		
		int k=0;
		for(int i=idx; i<arr.length; i++){
			temp[k] = arr[i];
			k++;
		}
		for(int i=0; i<idx; i++){
			temp[k] = arr[i];
			k++;
		}
		
		print(temp);
	}
	
	
	public static void main (String [] args){
		int[] arr = new int[]{1,2,3,4,5,6,7};
		int N=3;
		int n = arr.length;
		System.out.println("Rotate : ");
		rotate(arr,N,n);
		
	}
}