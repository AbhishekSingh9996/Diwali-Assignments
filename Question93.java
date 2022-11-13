/*
This question is asked by Amazon. Given a string representing the sequence of moves a
robot vacuum makes, return whether or not it will return to its original position. The
string will only contain L, R, U, and D characters, representing left, right, up, and down
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

public class Question93{
	
	public static boolean origin(String str){
		int count=0;
		for (int i=0; i<str.length(); i++){
		if(str.charAt(i)=='R'||str.charAt(i)=='D'|| str.charAt(i)=='U'||str.charAt(i)=='L'){
			if (str.charAt(i)=='R'||str.charAt(i)=='U')
			count++;
			else
			count--;
		}
		else return false;
		}
		return count==0;
	}
	
	public static void main (String [] args){
		String str = "RUULLDRDL";
		System.out.println(origin(str));
	}
}