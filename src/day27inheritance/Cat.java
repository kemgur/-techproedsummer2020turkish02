package day27inheritance;

public class Cat extends Mammal{

	public boolean biyik = true;
	
	public Cat() {
		super();
		System.out.println("Cat guzeldir");//parametresiz constructor
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void meow() {
		System.out.println("Miyavlarlar");
	}
	
	public void clean() {
		System.out.println("Kendilerini temizlerler");
		
	}
}
