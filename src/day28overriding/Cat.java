package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();//Miyavlarlar
		

	}
	
	public void sound() {
		System.out.println("Miyavlarlar");
	}

	@Override //Annotation(ek aciklama)
	//Bir method eclipse ile override edildiyse boyle bir not duser. Bu nota annotation denir.
	public void numOfFoot() {
		System.out.println("4 ayagi vardir.");
		//Annotation:(enIteyshin) Bu asagidaki methodun override kurallarina uygun
        //            olarak override edilip edilmedigini kontrol eder.	
		// Ayni methodu farkli body'lerle kullanmaya overridding denir
	}

	@Override
	public Cat myMethod() { //return type Animal olan method. bunu degistirip Cat yapabiliriz.
		Animal obj1 = new Animal();
		return null;
		//Animal'dan Override edilen methodun return type'i "Animal" iken onu "Cat" yapabiliriz.
		//Ve java bundan sikayet etmez. Ama baska bir child'in ismini yazarsak java sikayet eder.
	}
	
 
}
