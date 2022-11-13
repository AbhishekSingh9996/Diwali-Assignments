public class Question85{
	public static void main (String [] args){
		String newString = "";
		String str = "Programming";
		for(int i=0; i<str.length(); i++){
			int j=0;
			for( j=0; j<i; j++){
				if(str.charAt(i)==str.charAt(j)){
					break;
				}
			}
			if(i==j){
				newString = newString + str.charAt(i);
			}
		}
		System.out.println(newString);
	}
}