class Question36{
	
	int a;
	int b;
	static int c=3;
	static int d=4;
	
	Question36(int a, int b){
		this.a=a;
		this.b=b;
	}
	int add(){
		int add= a+b;
		return add;
	}
	static int prod(){
		int prod =c*d;
		return prod;
		
	}	
	
	public static void main (String [] args){
		Question36 q1 = new Question36(4,5);
		System.out.println("The addition is "+q1.add());
		System.out.println("The addition is "+prod());
	}
}