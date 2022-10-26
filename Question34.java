class Cuboid{
	double length;
	double breadth;
	double height;
	double area;
	
	void areaCuboid(Cuboid c){
		this.area = length*breadth;
	}
	void volume(Cuboid c1){
		double volume = this.area*height;
		System.out.println("Voulme is "+volume);
	}
	
	Cuboid(double length, double breadth, double height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
}
class Question34{
	public static void main (String [] args){
		Cuboid c1 = new Cuboid (10,15,20);
		c1.areaCuboid(c1);
		c1.volume(c1);
	}
}