import java.util.Scanner;

class Question5{
	public static void main(String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r= sc.nextInt();
		
		//Upper triangle
		
		for(int i=1; i<=r; i++){
			for(int j=0; j<r-i; j++){
				System.out.print(" ");
			}
			for(int j=i; j>0; j--){
				System.out.print(j);
			}
			for(int j=2;j<=i;j++ ){
				System.out.print(j);
			}
			System.out.println();
		}
		
		//Lower triangle
		
		for(int i=r-1;i>=1;i--){
			for(int j=r-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--){
				System.out.print(j);
			}
			for(int j=2; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}