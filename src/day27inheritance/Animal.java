package day27inheritance;

public class Animal {//Parent classin diger adi Super classtir.
	//child classin diger adi sub classtir.

	/*
	 inhertance'in Faydalari
	 1) Kodlari tamir etmede cok kolaylik saglar. Animalda bir degisiklik tum child'i 
	 duzeltmemizi saglar.
	 2) Kod kalabagindan kurtuluruz.
	 3) Ortal methodlari parentta koymak, kod kalabaligindan kurtarir.
	 4) 
	 */
	public int age = 1;
	
	public Animal() {//parametresiz constructor
		super();
		System.out.println("Animal guzeldir");
	}
	 
	public static void main(String[] args) {
		

	}

	public void eat() {
		System.out.println("Yemek yerler");
	}
	
	public void drink() {
		System.out.println("Su icerler");
	}
}
