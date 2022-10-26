class Person{
	double weight;
	double height;
	int age;
	Person(){
		
	}
	Person(double weight,double height,int age){
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
}
class Student extends Person{
	int roll;
	Student(){
		
	}
	Student(double weight,double height,int age, int roll){
		super(weight, height,age);
		this.roll=roll;
	}
	void printdetails(){
		System.out.println("Roll no. is " +roll+ " ,weight is "+weight+" ,height is "+height+" and age is "+age);
	}
}
class Question43{
	public static void main (String [] args){
		Student s1 = new Student (65,165,25,003);
		s1.printdetails();
		
	}
}