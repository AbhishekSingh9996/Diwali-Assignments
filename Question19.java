import java.util.Scanner;

class Question19{
	
	public static void main (String [] args){
	System.out.println("Enter the number of rows : ");
	Scanner sc = new Scanner (System.in);
	int r = sc.nextInt();
		
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			if(i>1){
			for(int k=i-1; k>=1; k--){
				System.out.print(k+" ");
			}
			}
			System.out.println();
		}
		
	}
}