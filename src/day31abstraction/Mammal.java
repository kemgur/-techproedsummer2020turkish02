package day31abstraction;

public abstract class Mammal extends Animal {

	/*
	 Gordugunuz gibi Mammal, Animal'in child class'i ve asi() methodu ile
	 drink() methodunu override etmedi ama herhangi bir Comile time Error yok.
	  Cunku; abstract child'larin parent'taki method'lari override etme zorunlulugu yoktur
	  
	 */
	
	
   public abstract void feed();//abstract method
	
	public void move() {//concrete mehtod 
		System.out.println("Hareket ederler");
	}

	

	
}