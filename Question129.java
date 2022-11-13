import java.util.*;

public class Question129{
	public static void main (String [] args){
		HashMap <Integer,String> hm = new HashMap <Integer,String> ();
		hm.put(1,"Red");
		hm.put(2,"Black");
		hm.put(3,"White");
		
		String val = (String) hm.get(2);
		System.out.println("String value at index 2 :"+val);
	}
}