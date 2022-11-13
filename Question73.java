public class Question73{
	public static void main (String [] args){
		int[] arr = new int[] {8,7,3,2,1};
		int max = 0;
		int smax = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
			smax = max;	
			max = arr[i];
			}
			if(arr[i]<max && arr[i]>smax){
				smax = arr[i];
			}
		}
		System.out.println("The second largest element is "+smax);
	}
}