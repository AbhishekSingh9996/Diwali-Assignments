import java.util.*;

public class Question60{
	public static void main (String [] args){
		System.out.println("Enter the number of elements in the string : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			if(i%2!=0){
				System.out.print((int)Math.pow(i,3)+" ");
			}
			else{
				System.out.print((int)Math.pow(i,2)+" ");
			}
		}
		
	}
}