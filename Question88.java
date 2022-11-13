public class Question88{
	public static void main (String [] args){
		String str = "Programming";
		char ch = 'r';
		int count=0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==ch)
				count++;
		}
		
		int n = str.length()-count;
		char[] str1 = new char[n];
		int k=0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)!=ch){
				str1[k] = str.charAt(i);
				k++;
			}
		}
		
		for(int i =0; i<n; i++){
			System.out.print(str1[i]);
		}
		
	}	
}