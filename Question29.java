class Outer{
	void message(){
		System.out.println("Outer class message.");
	}
	
	static class Inner{
	    void message1(){
		System.out.println("Inner class message.");
	}
	
	}
}
class Question29{
	public static void main (String [] args){
		Outer.Inner o1 = new Outer.Inner();	//Outer.Inner class object creation
		Outer o2 = new Outer();
		o2.message();	//This will throw an error as it cannot find the message method via inner class object
		o1.message1();
		//Inner o3 = new Inner();//This will thorw an error as you cannot directly access an inner class
		//o3.message1();
	}
}