class Question65{
	
	public static void equal(int[] arr1, int[] arr2){
		boolean flag=false;
		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				flag = true;
				if(arr1[i]!=arr2[i]){
					flag = false;
					break;
				}
			}
		
		}

	if(flag)
		System.out.println("true");
	else
		System.out.println("false");
	}
	
	public static void main (String [] args){
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,2,3,4};
		equal(arr1 , arr2);
	}
}