import java.util.*;

public class Question125{
	public static void main (String [] args){
		PriorityQueue <String> pq1 = new PriorityQueue <String> ();
		pq1.add("Red");
		pq1.add("Black");
		pq1.add("White");
		pq1.add("Blue");
		
		System.out.println(pq1);
		
		pq1.clear();
		System.out.println(pq1);
		
	}
}