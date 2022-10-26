class Shape{
	int length;
	int breadth;
	Shape(){
		
	}
	Shape(int l, int b){
		length=l;
		breadth=b;
	}
	void area(){
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
}
class Rectangle extends Shape{
	Rectangle(){
		
	}
	Rectangle(int l,int b){
		super(l,b);
	}
}
class Question46{
	public static void main (String [] args){
		Rectangle r1 = new Rectangle (4,5);
		r1.area();
	}
}