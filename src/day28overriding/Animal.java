package day28overriding;

public class Animal {

	/*
	 1) Bir variable'in isminden onceki kisim data type'tir.
	 Animal obj = new Animal();// Bastaki "Animal" data type'tir.
	 
	 2) Class'lar data type olabilir, data type'larda class olabilir.
	 String bir classtir ve ayni zamanda data type olabilir. O zaman benim
	 urettigim bir class ta ayni zamanda data type olabilir.
	 
	 3) P rimitive data type disinda uretilen her sey non-primitive'dir.
	 
	 4) Bir methodun return type'i "void"den farkli ise "return" dondurmek zorundayiz.
	    Yani methodun icerisine return yazmaliyiz.
	 */
	
	
	public void sound() {// sound methodu
		System.out.println("Ses cikarirlar");

}
	public void numOfFoot() {
		System.out.println("Ayak sayisi bellidir.");
	}
	
	public Animal myMethod() {
		Animal obj = new Animal();
		return null;
	}
	
}