class Question48{
	int x=10;
	public static void main (String [] args){
		//System.out.println(x); Error: Non-static variable x cannot be referred from static context
		//Instance variable can be called only after making objects
		Question48 ob = new Question48 ();
		System.out.println(ob.x);
	}
}