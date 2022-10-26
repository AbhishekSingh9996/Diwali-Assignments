import java.util.*;

class Question6{
	public static void main(String [] args){
		System.out.println("Enter teh number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++){
			for(int j=i; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}