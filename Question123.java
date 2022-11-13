import java.util.*;

public class Question123{
	public static void main (String [] args){
		TreeSet <String> t1 = new TreeSet <String>();
		t1.add("Red");
		t1.add("Black");
		t1.add("Grey");
		
		Iterator<String> p = t1.iterator();
		while(p.hasNext())
		System.out.println(p.next());
		
	}
}