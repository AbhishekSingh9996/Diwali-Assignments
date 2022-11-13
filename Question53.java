import java.util.Scanner;

public class Question53{
	
	public static boolean equal(int[] arr1, int[] arr2){
		if (arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
			return true;
		}
		else return false;
	}
	
	public static void main (String [] args){
		
		System.out.println("Enter the size of array1 and array2 : ");
		
		Scanner sc = new Scanner (System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size1];
		
		System.out.println("Enter the elements for array1:");
		
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements for array2:");
		
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		
		if(equal(arr1,arr2)){
			System.out.println("The arrays are equal.");
		}
		else{
			System.out.println("The arrays are not equal.");
		}
			
	}
}