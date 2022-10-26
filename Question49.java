class Student{
	int roll; //instance varaiable
	String name;
	static String college = "ITS";	//Static variable
	
	Student(){
		
	}
	Student(int r, String n){
		roll = r;
		name = n;
	}
	void display(){
		System.out.println("Roll No."+roll+" name "+name+" college "+college);
	}
	
}
class Question49{
	public static void main (String [] args){
		Student s1 = new Student (111, "Abhishek");
		Student s2 = new Student (222, "Aryan");
		s1.display();
		s2.display();
	}
}