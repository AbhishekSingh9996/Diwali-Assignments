public class Question82{
	
	public static void replace(String str, int length){
		char[] chars = str.toCharArray();
		int spacecount = 0;
		for(int i=0; i<str.length(); i++){
			if(chars[i]==' '){
				spacecount++;
			}
		}
		int newlength = length+2*spacecount;
		char[] charsNew = new char [newlength];
		for(int i=length-1; i>=0; i--){
			if(chars[i]==' '){
				charsNew [newlength-1]='0';
				charsNew [newlength-2]='2';
				charsNew [newlength-3]='%';
				newlength = newlength-3;
			}
			else{
				System.out.println(chars[i]);
				charsNew[newlength-1]=chars[i];
				newlength= newlength-1;
			}
		}
		System.out.print("Output String : " + String.valueOf(charsNew));
	}
	
	public static void main (String[] args){
		
		String str = "Java is a good language";
		int trueLength = str.length();
		System.out.println("Input String : "+str);
		replace(str,trueLength);
	}
}