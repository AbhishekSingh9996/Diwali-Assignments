import java.util.Scanner;

class Question20{
	public static void main (String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		//Upper triangle
		
		for(int i=1; i<=r; i++){
			for(int j=i; j>1; j--){
				System.out.print(" ");
			}
			for(int j=i; j<=r; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Lower triangle
		for(int i=1; i<r; i++){
			for(int j=1; j<r-i; j++){
				System.out.print(" ");
			}
			for(int j=r-i; j<=r; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}