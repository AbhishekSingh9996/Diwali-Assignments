/*
Note: a palindrome is a sequence of characters that reads the same forwards and
backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true
*/

public class Question91{
	public static void main (String [] args){
		String s = "A man, a plan, a canal: Panama.";
		if(isPalindrome(s))
			System.out.println("True");
		else
			System.out.println("False");
	}
			
		public static boolean isPalindrome(String s){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
				j--;
			}
			if(i<j && Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--))){
				return false;
			}
		}
		return true;
	}
}