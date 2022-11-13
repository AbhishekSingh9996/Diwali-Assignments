public class Question87{
	
	public static void main (String [] args){
		String str = "aaaaaaaaaabcccddddddd";
		
		
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i,j,min,max;
		
		//Convert string to array of characters
		char[] string = str.toCharArray();
		
		//Count each character and store in freq[] array
		for(i=0; i<string.length; i++){
			freq[i]=1;
			for(j=i+1; j<string.length; j++){
				if(string[i]==string[j]  && string[i]!=' ' && string[i]!='0'){
					freq[i]++;
					
					//Set string[j]==0 to avoid printing of visited character
					string[j]='0';
				}
			}
		}
		//Determine minimum and maximum occuring characters
		min=max=freq[0];
		for(i=0; i<freq.length; i++){
			//if min is greater than frequency of character then
			//store the frequency in min and corresponding character in minChar
			if(min>freq[i] && freq[i]!='0'){
				min = freq[i];
				minChar=string[i];
			}
			//if max is less tahn frequency of character then
			//store frequency in max and corresponding character in maxChar
		if(max<freq[i] && freq[i]!='0'){
				max = freq[i];
				maxChar=string[i];
			}
		}
		System.out.println("Minimum occurring character: " + minChar);  
        System.out.println("Maximum occurring character: " + maxChar);  
		
	}
}