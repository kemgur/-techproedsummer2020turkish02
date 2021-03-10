package day27inheritance;

public class Bird extends Animal{
	
     public boolean kanat = true;

     public Bird() {//parametresiz constructor
    	 super();
    	 System.out.println("Bird Guzeldir");
     }
	public static void main(String[] args) {
		

	}

	public void fly() {
		System.out.println("Ucarlar");
	}
	
	public void tweet() {
		System.out.println("Oterler");
	}
	public void nest() {
		System.out.println("Yuva yaparlar");
	}
	
	
}
