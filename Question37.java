class Question37{
	
	int a;
	int b;
	Question37(){
		
	}
	Question37(int a, int b){
		this.a=a;
		this.b=b;
	}	
	int addition(){
		int add=a+b;
		return add;
	}
	
	public static void main (String [] args){
		Question37 q1 = new Question37 (1,3);
		System.out.println("The addition of the two numbers is "+q1.addition());
	}
}