import java.util.*;

public class Question127{
	public static void main (String [] args){
		PriorityQueue <String> queue = new PriorityQueue <String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("White");
		
		System.out.println(queue);
		
		Object [] arr = queue.toArray();
		
		System.out.println("The Array is : ");
		for(Object j : arr)
			System.out.println(j);
	}
}