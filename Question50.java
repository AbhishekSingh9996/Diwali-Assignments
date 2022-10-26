public class Question50{
	
	static String s = "Static variable" ;
	
	static{
		System.out.println("First static block.");
	}
	Question50(){
		System.out.println("Constructor.");
	}
	static{
		System.out.println("Second static block and "+s);
	}
	static{
		staticMethod();
		System.out.println("third static block.");
	}
	static void staticMethod(){
		System.out.println("Static Method.");
	}	
	void nonstatic(){
		System.out.println("Non-Static Method via object.");
	}
	static void staticMethod2(){
		System.out.println("Static Method 2.");
	}
	{
		System.out.println("Non-static Method.");
	}
	
	public static void main (String [] args){
		Question50 q1 = new Question50();
		q1.nonstatic();
		staticMethod2();
		
		//Thus sequence is static block, non-static block and static method as per call.
		//if we call static method via static block than teh method will eb executed accordingly.
	}
	
}