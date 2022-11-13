public class Question69{
	public static void main (String [] args){
		int[] arr = new int[]{1,0,2,0,3,0,4,0};
		int count = 0;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]==0){
				for(int j=i; j<arr.length-1; j++){
				arr[j]=arr[j+1];
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}