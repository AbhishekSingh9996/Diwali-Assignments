class Outer{
	void test_Outer(){
		System.out.println("Outer Class Method.");
	}
	static class Inner{
		void test_Inner(){
			System.out.println("Inner Class Method.");
			Outer o1 = new Outer();
			o1.test_Outer();
		}
	}
}
class Question30{
	public static void main (String [] args){
		Outer.Inner o2 = new Outer.Inner();
		o2.test_Inner();
	}
}