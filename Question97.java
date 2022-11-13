public class Question97{
	
	public static String append(String larger, String shorter){
		
		int m = shorter.length();
		int n = larger.length();
		String s = "";
		
		String subString = larger.substring(m,n);
		
		for(int i=0; i<m; i++){
			s=s+larger.charAt(i)+shorter.charAt(i);
		}
		
		s=s+subString;
		
		return s;	
	}
	
	public static void main (String [] args){
		String s1 = "abc";
		String s2 = "defg";
		
		if(s1.length()>s2.length()){
			System.out.println(append(s1,s2));
		}
		else {
			System.out.println(append(s2,s1));
		}
	}
}