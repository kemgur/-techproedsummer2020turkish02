package day26passbyvalueinheritance;

public class Bird extends Animal{

	public static void main(String[] args) {
		//ob: object bird
		Bird ob = new Bird();
		ob.drink();
		ob.eat();
		ob.fyl();

	}

	public  void fyl() {
		System.out.println("Ucarlar");
	}
}
