import java.util.*;

public class Question108{
	public static void main (String [] args){
		ArrayList <String> a1 = new ArrayList <String> ();
		a1.add ("Pink");
		a1.add ("Red");
		a1.add ("Blue");
		System.out.println(a1);
		a1.add(0,"Green");
		System.out.println(a1);
		
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		Collections.sort(a1);
		System.out.println(a1);
		
	}
}