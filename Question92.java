/*
This question is asked by Google. Given a string, return whether or not it uses
capitalization correctly. A string correctly uses capitalization if all letters are capitalized,
no letters are capitalized, or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/

public class Question92{
	
	public static boolean order (String str){
		int count =0;
		for(int i=0; i<str.length(); i++){
			if(Character.isUpperCase(str.charAt(i)))
				count++;				
		}
		return (count == str.length() || count==0 || (count==1 && Character.isUpperCase(str.charAt(0))));
	}
	
	public static void main(String [] args){
		String str = "Coding";
		int n = str.length();
		
		System.out.println(order(str));
		
	}
}