public class Question89{
	
	public static String[] sort(String[] str){
		for(int i=0; i<str.length; i++){
			for(int j=0; j<str.length-1-i; j++){
				String c = str[j];
				String d = str[j+1];
				if(c.length()>d.length()){
					String temp = d;
					d=c;
					c=temp;
				}
			}
		}
		return str;
	}
	
	public static void main (String [] args){
	String[] str = {"Abhi","Abhishek","Singh","Ajay"};
	sort(str);
	for(int i=0; i<str.length; i++){
		System.out.print(str[i]+" ");
	}
}
}