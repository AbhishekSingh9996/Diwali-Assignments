public class Question83{
	
	public static void permutations(String remainingString, String permutation){
	if(remainingString.length() == 0){
		System.out.println(permutation);
		return;
	}
	for(int i=0; i<remainingString.length(); i++){
		char ch = remainingString.charAt(i);
		String permute = permutation + ch;
		String next = remainingString.substring(0,i)+remainingString.substring(i+1);
		permutations(next,permute);
	}
		
	}
	
	public static void main (String[] args){
		String str = "abc";
		permutations(str,"");
	}
}