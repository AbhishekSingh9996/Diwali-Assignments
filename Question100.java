import java.util.*;

public class Question100{
	
	public static void longestSubString (String s){
		//Create two hashups
		HashMap <String,Integer> indexes = new HashMap<>();
		HashMap <String,Integer> chars = new HashMap<>(){{
			put('a',0);
			put('e',1);
			put('1',2);
			put('o',3);
			put('u',4);
		}};
		
	String evenOdd="00000";
		indexes.put(evenOdd,-1);
		
		int length = 0;
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			boolean it = chars.contains(c);
			
			if(it != false){
				if(evenOdd.charAt(chars.get(c))=='0'){
					evenOdd = evenOdd.substring(0,chars.get(c)) + '1' + evenOdd.substring(chars.get(c)+1);
				}
				else{
                evenOdd = evenOdd.substring(0,chars.get(c)) + '0' + evenOdd.substring(chars.get(c)+1);
            }
			boolean lastIndex = indexes.containsKey(evenOdd);
 
        if (lastIndex == false) {
            indexes.put(evenOdd, i);
        }
 
        // Update the maximum length
        else {
            length = Math.max(length, i - indexes.get(evenOdd));
        }
    }
 
    // Print the maximum length
    System.out.println(length);
}
     
		}
	
	public static void main (String [] args){
		String s = "bcbcb";
		longestSubstring (s);
		
	}
}