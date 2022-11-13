import java.util.*;

public class Question124{
	public static void main (String [] args){
		TreeSet <Integer> t1 = new TreeSet <Integer> ();
		TreeSet <Integer> t2 = new TreeSet <Integer> ();
		
		t1.add(1);
		t2.add(8);
		t1.add(3);
		t1.add(9);
		t1.add(6);
		t1.add(5);
		
		t2 = (TreeSet)t1.headSet(7);
		
		Iterator iterator;
		iterator = t2.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}
}