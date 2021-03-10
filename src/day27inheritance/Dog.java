package day27inheritance;

public class Dog extends Mammal {

	
	/*
	 1) Java'da bir class sadece bir class'a extend edebilir.
	    Java'da bir class'in sadece bir tane parent'i olabilir.
	    Java multiple inheritance'i onaylamaz(Birden fazla mirasi kabul etmez))
	    
	 2) protected(cocukta kullanabilir) ve public method'lar inheritance'a uygundurlar. 
	    
	    *private method'lar inheritance'a uygun degildirler.
	    
	    *default ayni package'da iseniz inheritance'a uygundur ama fakli package'da
	    iseniz uygun degildir. Kullanmak risklidir bu yuzden inheritance'da default
	    access modifier kullanilmaz.
	    
	 3) Parent Class = Super Class 
	    Child Class = Sub Class
	    
	 4) Her constructor'in ilk satirinda (aksi bir hamle yapilmadigi surece) "super()"
	    constructor call'u vardir. super() yazmak istege baglidir, yazsaniz da yazmasaniz da
	    super() otomatik olarak calisir. 
	    Object class: tum claslarin babasi     	      
	 */
	public Dog() {//parametresiz constructor
		super();
		System.out.println("Dog guzeldir");
	}
	
	public boolean loyal = true;//(sadik mi?)
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.smell();
		dog.bark();
		dog.feed(); //Mammal classindaki feed() methodunu static yapinca boyle bir uyari aliriz.
		// Bu uyari su anlama gelir:
		// feed() methodu statictir neden objeyle kullaniyorsun? 
		//Direk class ismi ile cagirabilirsin. Bu daha dogru olur.//Mammal.feed();
		Mammal.feed(); 
		dog.drink();
		dog.eat();
		System.out.println("Sadik? " + dog.loyal);
		System.out.println("Dogum? " + dog.dogum);
		System.out.println("Yas? " + dog.age);
	
		//Console:	
//		Iyi koku alirlar
//		Havlarlar
//		Yavrularini beslerler
//		Su icerler
//		Yemek yerler
//		Sadik? true
//		Dogum: true
//		Yas? 1
		
	}

	public void bark () {
		System.out.println("Havlarlar");
	}
	public void smell () {
		System.out.println("Iyi koku alirlar");
	}
}
