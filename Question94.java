/*
Given two binary strings (strings containing only 1s and 0s) return their sum (also as a
binary string).
*/



import java.util.Scanner;

public class Question94{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first binary string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second binary string : ");
		String s2 = sc.nextLine();
		int n1=Integer.parseInt(s1,2);
		int n2=Integer.parseInt(s1,2);
		System.out.println("The first number is "+n1);
		System.out.println("The second number is "+n2);
		
		int n3 = n1+n2;
		System.out.println("The addition is "+n3);
		System.out.println("The addition in binary form is "+(Integer.toBinaryString(n3)));
	}
}