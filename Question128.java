import java.util.*;

public class Question128{
	public static void main (String [] args){
		HashMap <Integer,String> hm = new HashMap <Integer,String> ();
		hm.put(1,"Red");
		hm.put(2,"Black");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());
	}
}