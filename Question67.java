public class Question67{
	
	public static void print (int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void intersection (int[] larger, int[] smaller){
		
		
		
		int[] temp = new int[smaller.length];
		int k=0;
		
		for(int i=0; i<smaller.length; i++){
			
			for(int j=0; j<larger.length; j++){
				if(larger[j]==smaller[i]){
					temp[k]=smaller[i];
					k++;
				}
			}
		}
		print(temp);
	}
	
	public static void main (String [] args){
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[]{3,4,5,6,7};
		
		if(arr1.length>arr2.length){
			intersection(arr1, arr2);
		}
		else{
			intersection(arr2,arr1);
		}
		
	}
}