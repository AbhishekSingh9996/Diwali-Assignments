import java.util.Scanner;

class Question3{
	public static void main(String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		int k=1;
		
		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}