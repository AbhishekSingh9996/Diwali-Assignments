import java.util.Scanner;

class Question33{
	static int k=0;
	int c;

	Question33(){
		k++;
	}
	Question33(int c){
		k++;
	}
	
	public static void main (String [] args){
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++){
			new Question33();
		}
		
		
		
		System.out.println("The number of objects created are : "+k);
	}
}