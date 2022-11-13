public class Question61{
	
	public static void order(int[] arr){
		if(isAscending(arr))
			System.out.println("Ascending");
		else if(isDescending(arr))
			System.out.println("Descening");
		else
			System.out.println("Random");
	}
	
	public static boolean isAscending (int[] arr){
		boolean flag = true;
		for(int i=arr.length; i>1; i--){
			if(arr[i-1]<arr[i-2])
				flag = false;
		}
		return flag;
	}
	
	public static boolean isDescending (int[] arr){
		boolean flag = true;
		for(int i=arr.length; i>1; i--){
			if(arr[i-1]>arr[i-2])
				flag = false;
		}
		return flag;
	}
	
	public static void main (String [] args){
		int [] arr = new int[]{5,14,35,90,139};
		order(arr);		
	}
}