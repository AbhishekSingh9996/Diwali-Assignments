import java.util.Scanner;

class Question10{
	public static void main (String [] args){
		System.out.println("Enter teh number of rows : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		char ch = 'A';
		
		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}