import java.util.Scanner;

class Figure{
	final int length = 5;
	final int breadth =4;
	
	final void area(){
		int a = length*breadth;
		System.out.println("Area : "+a);
	}
	
}
class Rectangle extends Figure{
	final void rect(){
		System.out.println("This is a rectangle.");
	}
}
final public class Question41 extends Rectangle{
	public static void main (String [] args){
		Question41 obj = new Question41();
		obj.rect();
		obj.area();
	}
}