abstract class Demo{
	abstract void demo1();
}
class Demo1 extends Demo{
		void demo1(){
			System.out.println("Abstract method extended.");
		}
}
class Question26{
	public static void main (String [] args){
		Demo1 d1 = new Demo1();
		d1.demo1();
	}
}
