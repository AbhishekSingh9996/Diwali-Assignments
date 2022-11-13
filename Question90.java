import java.util.*;

public class Question90{
	public static void main (String [] args){
		String s1 = "aPpa";
		
		StringBuffer sb1 = new StringBuffer(s1.toLowerCase());
		StringBuffer sb2 = new StringBuffer(sb1);
		sb1.reverse();
		
		//System.out.println(sb1);
		
		if(String.valueOf(sb1).compareTo(String.valueOf(sb2))==0)
			System.out.println("True");
		else
			System.out.println("False");
		
		
	}
}