package day16constructors;

public class Student {

	int number;//instance variable
	String name;// instance variable
	static String college ="ITS"; //static variable
	
	Student (int r, String n, String college){
		this.number = r;
		this.name = n;
		this.college=college;
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(111,"Karan","MIT");
		Student s2 = new Student (222,"Aryan","Harvard");// static variable'larda son deger neyse
		//objede o vardir
		
		System.out.println(s1.number);//111
		System.out.println(s2.number);//222
		
		System.out.println(s1.name); //Karan
		System.out.println(s2.name); // Aryan
		
		System.out.println(s1.college);// Harvard
		System.out.println(s2.college);// Harvard

	}

}
