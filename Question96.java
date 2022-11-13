public class Question96{
	
	public static boolean validPalindrome (String s){
		int left = 0;
		int right = s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);
			}
			left++;
			right--;
		}
		return true;
	}
	public static boolean isPalindrome(String s, int start, int end){
		while(start<=end){
		if(s.charAt(start)!=s.charAt(end)){
			return false;
		}
		start++;
		end--;
		}
		return true;
	}
	
	public static void main (String [] args){
		String str = "abcbdfa";
		System.out.println(validPalindrome(str));
	}
}