import java.util.*;

class Question15{
	
	static int k=1;
	
	static void christmas(int r, int q, int n){
		
		if(r==0){
			return ;
		}
		else{
			for(int i=1; i<=q; i++){
				for(int j=(r*2)+4-i; j>=1; j--){
					System.out.print(" ");
				}
			for(int k=n; k>=1; k--){
				System.out.print("* ");
			}
			n++;
			System.out.println();
			}
		}
		
		k=k+2;
		
		christmas(r-1,q,k);
	}
	
		
	public static void main (String [] args){
	System.out.println("Enter the number of rows : ");
	Scanner sc = new Scanner (System.in);
	int r = sc.nextInt();
	
	int q=5;
	int n=1;
	
			
		christmas(r,q,n);
		
		for(int i=1; i<=r; i++){
			for(int j=1; j<=r+3; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=r; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
			
		
	}
}