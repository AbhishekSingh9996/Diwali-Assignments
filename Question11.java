import java.util.Scanner;

class Question11{
	public static void main (String [] args){
		
		System.out.println("Enter teh number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		//Upper triangle
		
		for(int i=1; i<=r; i++){
			char ch = 'A';
			for(int j=r; j>=i; j--){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		//Lower triangle
		
		for (int i=2; i<=r; i++){
			char ch = 'A';
			for (int j=1; j<=i; j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}