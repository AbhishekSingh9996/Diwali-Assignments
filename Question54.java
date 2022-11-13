import java.util.Scanner;

public class Question54{
	public static void main (String [] args){
		
		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner (System.in);
		int size1 = sc.nextInt();
		
		int [] arr = new int[size1];
		
		System.out.println("Enter the elements of array : ");
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the sum value: ");
		int sum = sc.nextInt();
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j]==sum){
					System.out.println("The numbers are "+arr[i]+" & "+arr[j]);
				}
			}
		}
	}
}