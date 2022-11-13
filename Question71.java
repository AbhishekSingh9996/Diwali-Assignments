import java.util.*;

//Converting arrays to Treeset best method is to first convert array to arraylist and then to treeset

public class Question71{
	public static void main (String [] args){
		Integer[] arr = {1,2,3,4,5};
		List <Integer> l1 = new ArrayList <Integer> (Arrays.asList(arr));
		Set <Integer> s1 = new TreeSet <Integer> (l1);
		
		for(Integer var : s1){
			System.out.println(var);
		}
	}
}