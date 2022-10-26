class Outer{
	int x = 200;
	void test(){
		Inner inner = new Inner();
		inner.display();
	}
	class Inner{
		int y=20;
		void display(){
			System.out.println("Display : Outer_x : "+x);
			//Inner class has got scope of outer class x but outer class has no scope for inner class y
		}
	}
	void showy(){
		//System.out.println(y); 
		//This will throw an error because y is out of scope of outer loop
	}
}

class Question28{
	public static void main (String [] args){
		Outer o1 = new Outer ();
		o1.test();
		o1.showy();
	}
}