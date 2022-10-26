import java.util.Scanner;

class Question13{
	public static void main (String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		char ch = 'A';
		
		//Upper Triangle
		
		for(int i=0; i<r; i++){
			for(int j=i; j<r; j++){
				System.out.print(" ");
			}
			System.out.print(ch);
			for(int j=2*i; j>1; j--){
				System.out.print(" ");
			}
			if(i>0){
			System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
		
		//Lower Triangle
		
		ch=(char)(ch-2);
		for(int i=1; i<r; i++){
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			System.out.print(ch);
			for(int j=i*2; j<=(r-1)*2-2; j++){
				System.out.print(" ");
			}
			if(i<r-1){
			System.out.print(ch);
			}
			ch--;
			System.out.println();
		}
	}
}