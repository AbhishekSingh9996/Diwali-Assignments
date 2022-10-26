import java.util.Scanner;

class Question18{
	public static void main (String [] args){
		
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=r; i>=1; i--){
			for(int j=r; j>=i; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}