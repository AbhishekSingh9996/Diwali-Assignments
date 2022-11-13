class Question56{
	public static void main (String [] args){
		int[] arr = new int[]{1,2,3,4,5};
		int min = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("The minimum value of array is "+min);
		System.out.println("The maximum value of array is "+max);
	}
}