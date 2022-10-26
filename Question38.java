class Question38{
	
	int a;
	int b;
	
	Question38(){
		
	}
	Question38(int a1, int b1){
		this.a=a1;
		this.b=b1;
	}
	
	void addition(){
		System.out.println("The addition of 2 numbers is "+(a+b));
	}
	
	public static void main (String [] args){
		Question38 q1 = new Question38(1,2);
		q1.addition();
	}
}