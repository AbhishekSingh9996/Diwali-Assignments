import java.util.Scanner;

class Question25{
	public static void main (String [] args){
		
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++){
			for(int j=i; j<=r; j++){
				System.out.print(j);
			}
			if(i>1){
			for(int j=1; j<i; j++){
				System.out.print(j);
			}
			}
			System.out.println();
		}
	}
}