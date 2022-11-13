import java.util.*;

public class Question119{
	public static void main (String [] args){
		HashSet <String> h_set = new HashSet <String> ();
		h_set.add ("Red");
		h_set.add ("Blue");
		h_set.add ("White");
		h_set.add ("Black");
		
		Iterator <String> p = h_set.iterator();
		
		while(p.hasNext())
		System.out.println(p.next());
		
	}
}