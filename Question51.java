import java.util.Scanner;

public class Question51{
	public static void main (String [] args){
	byte a,b;
	int x,y,result;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter first byte value : ");
	a = sc.nextByte();
	x=(int)a;
	
	System.out.println("Enter second byte value : ");
	b = sc.nextByte();
	y=(int)b;
	
	result = x+y;
	System.out.println("The sum is : "+result);
	}
}