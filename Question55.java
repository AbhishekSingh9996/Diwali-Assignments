class Question55{
	
	public static int[] reverse(int[] arr,int idx, int n){
		if(idx>n){
			return arr;
		}
		int temp = arr[n];
		arr[n]=arr[idx];
		arr[idx]=temp;
		return reverse(arr,idx+1,n-1);
	}
	
	public static void main (String [] args){
		int[] arr = new int[]{1,2,3,4,5};
		int n = arr.length-1;
		int rev[]=reverse(arr,0,n);
		
		for(int i=0; i<rev.length; i++){
			System.out.print(rev[i]);
		}
	}
}