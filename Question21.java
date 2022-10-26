import java.util.Scanner;

class Question21{
	public static void main (String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++){
				if(j%2==0){
					System.out.print("0");
				}
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}