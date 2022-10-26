class Question40{
	
	int a;
	
	Question40(){
		
	}
	
	boolean equals(Question40 q){
		if (this.a==q.a)
			return true;
		else 
			return false;
	}
	
	public static void main (String [] args){
		Question40 q1 = new Question40();
		Question40 q2 = new Question40();
		
		System.out.println(q1.hashCode());
		System.out.println(q2.hashCode());
		
		System.out.println(q1==q2);
		System.out.println(q1.equals(q2));
	}
}