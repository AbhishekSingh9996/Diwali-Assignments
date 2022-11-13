import java.util.*;

//Arrays.asList(array_name) method converts arrays to Array List

public class Question70{
	public static void main (String [] args){
		String[] a1 = {"Abhishek", "Ajay", "Singh"};
		//List l1 = Arrays.asList (a1);
		//System.out.println(l1);
		
		//If we want to add new elements in the arraylist it is always recommended to create new arraylist and pass old elements
		//It is therefore recommended to create new ArrayList and pass Arrays.asList(array reference) as an argument to it (i.e. as an constructor argument of ArrayList).
		List <String> l1 = new ArrayList <String> (Arrays.asList(a1));
		System.out.println(l1);
		
		
		l1.add ("CDAC");
		l1.add ("Sept 2022");
		System.out.println("List after adding new elements : ");
		System.out.println(l1);
	}
}