class Question58{
	
	public static void concat(int[] larger, int[] smaller){
		for(int i=0; i<larger.length; i++){
			if(i<smaller.length){
				System.out.print(larger[i]+" "+smaller[i]+" ");
			}
			else{
				System.out.print(" "+larger[i]);
			}
				
		}
	}
	
	public static void main (String [] args){
		int[] arr1 = new int[]{23,60,94, 3, 102};
		int[] arr2 = new int[]{42,16,74};
		
		if(arr1.length>=arr2.length)
			concat(arr1,arr2);
		else
			concat(arr2, arr1);
	}
}