import java.util.*;

public class Question122{
	public static void main (String [] args){
		
		HashSet <String> h_set1 = new HashSet <String> ();
		h_set1.add("Red");
		h_set1.add("Black");
		h_set1.add("White");
		h_set1.add("Blue");
		System.out.println("First hashset contains : "+h_set1);
		
		
		HashSet<String> h_set2 = new HashSet <String> ();
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Indigo");
		System.out.println("Second hashset contains : "+h_set2);
		
		h_set1.retainAll(h_set2);
		System.out.println("HashSet content:");
        System.out.println(h_set1);
		
		
	}
}