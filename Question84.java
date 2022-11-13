public class Question84{
	public static void main (String [] args){
		String str = "Abhishek";
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			ch[i]=str.charAt(i);
		}
		int n = str.length();
		for(int i=0; i<n/2; i++){
			char temp = ch[n-1-i];
			ch [n-1-i] = ch[i];
			ch[i] = temp;
		}
		
		String str2 = String.valueOf(ch);
		System.out.println(str2);
	}
}