public class Question86{
	public static void main (String [] args){
		String str1 = "abcf";
		String str2 = "def";
		String str3 = "adbecf";
		
		for(int i=0; i<str1.length()-2; i++){
			for(int j=0; j<str3.length(); j++){
				int a1 = str3.indexOf(str1.charAt(i));
				int a2 = str3.indexOf(str1.charAt(i+1));
				if(a1>a2){
					System.out.println("False");
					break;
				}
			}
			 
				System.out.println("True");
		}
		
	}
}