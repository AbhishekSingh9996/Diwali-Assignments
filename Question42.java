public class Question42{
	
	double height;
	double width;
	double length;
	
	Question42(){
		System.out.println("Zero-argument constructor.");
		width=10;
		height=10;
		length=10;
	}
	Question42(double h, double w, double l){
		System.out.println("Constructor with parameter.");
		height=h;
		width=w;
		length=l;
	}
	double volume(){
		return length*width*height;
	}
	
	public static void main (String [] args){
		Question42 q1 = new Question42();
		double vol;
		vol=q1.volume();
		System.out.println("Volume is "+vol);
		Question42 q2 = new Question42(20,20,20);
		vol=q2.volume();
		System.out.println("Volume is "+vol);
		
	}
}