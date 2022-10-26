import java.util.Scanner;

class Question7{
	public static void main (String [] args){
		
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r =sc.nextInt();
		
		for(int i =0; i<r; i++){
			for(int j=0; j<r; j++){
				if(i%2==0 && j%2==0){
					System.out.print("1");
				}
				else if (i%2==0 && j%2!=0){
					System.out.print("0");
				}
				else if(i%2!=0 && j%2==0){
					System.out.print("0");
				}
				else 
					System.out.print("1");
			}
			System.out.println();
		}
	}
}