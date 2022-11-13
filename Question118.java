import java.util.*;

public class Question118{
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
		
		for(int i=0; i<l1.size(); i++){
			System.out.println("Element at index "+i+" : "+l1.get(i));
		}
		
		l1.set(7,"Indigo");
		System.out.println(l1);
		
	}
}