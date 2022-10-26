import java.util.*;

class Question1{
	public static void main(String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i=1; i<=r;i++){
			
		for(int j=5;j>=i;j--){
			System.out.print(" ");
		}
		
		if(i==r){
			for(int j=1; j<=2*r+3; j++){
			System.out.print("*");
			}
		}
		else{
		
		System.out.print("*");
		for(int j=(2*i)-2;j>1;j--){
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