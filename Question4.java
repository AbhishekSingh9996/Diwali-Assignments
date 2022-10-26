import java.util.Scanner;

class Question4{
	
	static int factorial(int k){
		if (k==1 || k==0){
			return 1;
		}
		else{
		return k*factorial(k-1);
		}
	}
	
	public static void main(String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=0; i<r; i++){
			for(int j=i;j<r-1;j++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				//nCr for all points
				System.out.print(" "+(factorial(i)/(factorial(i-j)*factorial(j))));
			}
			System.out.println();
		}
	}
}