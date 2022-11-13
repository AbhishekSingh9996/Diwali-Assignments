import java.util.*;

public class Question72{
	public static void main (String [] args){
		List<String> l1 = new ArrayList <String>();
		l1.add("Abhishek");
		l1.add("Ajay");
		l1.add("Singh");
		
		String[] str = new String [l1.size()];
		
		for(int i=0; i<l1.size(); i++){
			//arraylist_name.get(index)method removes only that particular element
			
			str[i]=l1.get(i);
		}
		
		/*Using.toArray() converts entire Array list to array
		String[] str=l1.toArray(new string{l1.size()});
		*/
		
		for(String s : str)
			System.out.println(s);
		
		}
}