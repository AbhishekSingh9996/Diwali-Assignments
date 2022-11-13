import java.util.*;

public class Question95{
	public static void main (String [] args){
		String[] str = {"Abhi","Abhis","Abhishek"};
			//Sorting the arrays
			Arrays.sort(str);
			
			int min = str[0].length();
			
			for(int i=0; i<str.length-1; i++){
				if(str[i].length()>str[i+1].length())
				min=str[i+1].length();
			}
			System.out.println(min);
			
			int i=0;
			while(i<min && str[i].charAt(i)==str[min-1].charAt(i))
				i++;
			
			String pre = str[0].substring(0,i);
			System.out.println(pre);
	}
}