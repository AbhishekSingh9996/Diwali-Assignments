import java.util.*;

public class Question114{
	public static void main (String [] args){
	
	LinkedList <String> l1 = new LinkedList <String> ();
		l1.add("Red");
		l1.add("Green");
		System.out.println(l1);
		l1.add("Blue");
		l1.add("Yellow");
		System.out.println(l1);
		
		l1.add(2,"Pink");
		System.out.println(l1);
		l1.add(2,"Black");
		System.out.println(l1);
		
		l1.addFirst("White");
		l1.addLast("Grey");
		System.out.println(l1);
		
	}
}