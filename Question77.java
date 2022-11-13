public class Question77{
	
	public static boolean onlyDigits (String str){
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch<'0' || ch>'9'){
				return false;
				
			}
			
		}
		return true;
		
	}
	
	public static void main (String [] args){
		String str = "1234";
		
		System.out.println(onlyDigits(str));
	}
}