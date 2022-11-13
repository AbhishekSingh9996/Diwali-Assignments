class Question59{
	public static void main (String [] args){
		int[] arr = new int []{5,14,35,89,140};
		int n = arr.length-2;
		int[] brr = new int[n];
		int avg=0;
		
		for(int i=0; i<arr.length; i++){
			if(i>arr.length-3)
				break;
			else
			avg = (arr[i]+arr[i+1]+arr[i+2])/3;	
			brr[i]=avg;
		}
		
		for(int i=0; i<brr.length; i++){
			System.out.print(brr[i]+" ");
		}
	}
}