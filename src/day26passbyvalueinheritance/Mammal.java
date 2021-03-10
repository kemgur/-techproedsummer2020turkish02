package day26passbyvalueinheritance;

public class Mammal extends Animal{ //extends ile Mammal Animal'in cocugu oldu.

	public static void main(String[] args) {
		
		Mammal om = new Mammal();
		om.drink();//Su icerler
		om.feed();//Yavrularini beslerler
		om.eat();//Yemek yerler

	}

	public void feed() {
		System.out.println("Yavrularini beslerler");
	}
}
