public class Question80{
	
	public static void count(String str, char ch){
		int count =0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main (String [] args){
		String str = "Programming";
		char ch = 'r';
		count(str,ch);
	}
}