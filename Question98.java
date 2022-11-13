import java.util.*;

class Question98{
	public static String decodeString (String s){
		Stack<Integer> intstack = new Stack<> ();
		Stack<String> charstack = new Stack<> ();
		int ptr=0;
		String res = "";
		while (ptr<s.length()){
			char curr =  s.charAt(ptr);
			if(Character.isDigit(curr)){
				int num = 0;
				while(Character.isDigit(s.charAt(ptr))){
					num = num * 10 + s.charAt(ptr)-'0';
					ptr++;
				}
				intstack.push(num);
			}
			else if (curr == '['){
				charstack.push (res);
				res = "";
				ptr++;
			}
			else if (curr == ']'){
				StringBuilder sb = new StringBuilder (charstack.pop());
				int count = intstack.pop();
				for(int i=0; i<=count; i++)
					sb.append(res);
				
				res= sb.toString();
				ptr++;
			}
			else {
				res+=curr;
				ptr++;
			}
		}
		return res;
	}

public static void main (String [] args){
	String s = "abc";
	System.out.println(decodeString(s));
}
}