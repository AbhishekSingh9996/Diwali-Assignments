import java.util.Scanner;

class Question2{
	public static void main(String [] args){
		
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=r; i>0; i--){
			for(int j=r; j>i; j--){
				System.out.print(" ");
			}
			if(i==r){
				for(int j=0; j<=r*2; j++){
				System.out.print("*");
				}
				System.out.println();
			}
			else{
			System.out.print("*");
			for(int j=(i*2)-3;j>=1;j--){
				System.out.print(" ");
			}
			if(i>1){
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
}