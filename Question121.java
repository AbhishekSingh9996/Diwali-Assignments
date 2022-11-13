import java.util.*;

public class Question121{
	public static void main (String [] args){
		HashSet <String> h_set = new HashSet <String> ();
		h_set.add ("Red");
		h_set.add ("Blue");
		h_set.add ("White");
		h_set.add ("Black");
		
		String[] newarray = new String[h_set.size()];
		h_set.toArray(newarray);
		h_set.toArray(newarray);
		
		for(String s : newarray)
			System.out.println(s);
		
}
}