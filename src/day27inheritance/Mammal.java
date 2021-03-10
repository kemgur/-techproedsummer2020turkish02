package day27inheritance;

public class Mammal extends Animal {

	public boolean dogum = true;
	
	public Mammal() {//parametresiz constructor
		super();
		System.out.println("Mammal guzeldir" );
	}
	
	public static void main(String[] args) {
		

	}

	public static void feed() {
		System.out.println("Yavrularini beslerler");
	}
}
