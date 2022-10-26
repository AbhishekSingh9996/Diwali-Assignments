class Shape{
	double r;
	double l;
	double b;
	Circle c;
	Rectangle re;
	void area(Circle c){
		System.out.println("The area of circle is "+(3*r*r));
	}
	void area1(Rectangle re){
		System.out.println("The area of circle is "+(l*b));
	}
	
}

class Circle{
	int r;
	Circle c1;
	void setDetails(int r){
		this.r=r;
		printDetails();
	}
	void printDetails(){
			System.out.println("The radius of circle is : "+r);
			Shape s1 = new Shape();
			s1.area(c1);
		}	
}

class Rectangle{
	int l;
	int b;
	Rectangle r1;
	void setDetails(int l, int b){
		this.l=l;
		this.b=b;
		printtDetails();			
	}
	void printtDetails(){
			System.out.println("The length and breadth of rectangle are : "+l+" & "+b);
			Shape s2 = new Shape();
			s2.area1(r1);
		}
	
}
	
	
class Question32{
	public static void main (String [] args){
		Circle c1 = new Circle();
		c1.setDetails(2);
		Rectangle r1 = new Rectangle();
		r1.setDetails(5,4);
	}
}
