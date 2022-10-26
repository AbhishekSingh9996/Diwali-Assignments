import java.util.Scanner;

class Question24{
	public static void main (String [] args){
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		int k=4;
		
		for(int i=1; i<=r; i++){
			int l=3;
			
			for(int j=i,p=i,a=4; j>=1; j--,p=p+a,a--){
				System.out.print(p+" ");
			}
			
			System.out.println();
		}
	}
}