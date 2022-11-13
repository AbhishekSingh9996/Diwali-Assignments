public class Question74{
	
	public static boolean[] map = new boolean[26];
	
	public static void removeDuplicates (String str, int idx, String newString){
		for(int i=0; i<str.length(); i++){
			char currChar = str.charAt(i);
			if(map[currChar-'a']==true){
				newString = newString+currChar;
			}
			else
			{
				map[currChar-'a']=true;
			}
		}
		for(int i=0; i<newString.length(); i++){
			System.out.print(newString.charAt(i)+" ");
		}
	}
	
	public static void main (String [] args){
		String str = new String ("java");
		
		removeDuplicates(str, 0, "");
	}
}