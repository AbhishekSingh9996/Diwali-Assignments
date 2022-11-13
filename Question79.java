public class Question79{
	
	public static void main (String [] args){
		String str = "Programming";
		
		for(int i=str.length()-1; i>=0; i--){
			int count = 1;
			for (int j=i-1; j>=0; j--){
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			if(count>1)
				System.out.println(str.charAt(i)+" : "+count);
		}
	}
}