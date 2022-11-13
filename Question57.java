class Question57{
	public static void main (String [] args){
		int [] arr = new int[]{24,54,31,16,82,45,67};
		int max = 0;
		int smax = 0;
		int tmax = 0;
		int max1 = 0;
		int max2 = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				smax = max;
				max = arr[i];
			}
			if(arr[i]<max && arr[i]>smax){
				tmax = smax;
				smax = arr[i];
			}
		}
		
		System.out.println("Third largest number in array is "+tmax);
	}
}