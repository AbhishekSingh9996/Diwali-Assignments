import java.util.*;

public class Question75{
	
	public static boolean anagrams(char[] ch1, char[] ch2){
		if (ch1.length!=ch2.length)
			return false;
		else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0; i<ch1.length; i++){
				if(ch1[i]!=ch2[i])
					return false;
			}
			
			return true;
			
		}
	}
	
	public static void main (String [] args){
		String str1 = new String ("spar");
		String str2 = new String ("racp");
		
		char[] ch1 = new char [str1.length()];
		char[] ch2 = new char [str2.length()];
		
		for(int i=0; i<str1.length(); i++){
			ch1[i]=str1.charAt(i);
		}
		for(int i=0; i<str2.length(); i++){
			ch2[i]=str2.charAt(i);
		}
		
		System.out.println(anagrams(ch1, ch2));
		
	}
}