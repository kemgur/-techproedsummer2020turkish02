package day17staticblock;

public class Sb01 {

	/*Farzedinki bu class dairenin cevre ve alanini hesaplayacak.
	 * Alan = pi * r * r    Cevre = 2 * pi * r
	 Bu class'da pi sayisi her zaman kullanicaktir. Pi sayisina class uretirken
	 deger atamasini yapmak faydalidir. eger class uretilirken bazi variable'lara 
	 deger atamasi yapilmasini isterseniz static block kullanmalisiniz.
	 */
	
	/*
	 static block icinde kullanilan her sey static olmalidir.
	 Bu yuzden asagidaki ornketeki "pi" variable'ini static yapmak zorundayiz
	 Clas olusturulurken static block'ta olustururlur.
	 
	 Bir class'ta static block main method'dan once calisir.
	 Main method evdeki isleyistir. Static block ise evin banyosudur ve daha ev yapilirken once insa edilir.
	 Static block, her zaman classtaki tum methodlardan once calisir.
	 Static block, her zaman classtaki tum constructorlardan once calisir.
	 Static block class olusturulurken calisir.
	 */
	
	static double pi;
	Sb01(){
		System.out.println("Constructor");
		}
	static {
		pi= 3.14;
		System.out.println("Static Block Ali");
	}
	
	
	public static void main(String[] args) {
		
		Sb01 obj1 = new Sb01();
		
		System.out.println("Main Method");
		
		Sb01 obj2 = new Sb01();
		
	}
		
		static {
			pi= 3.14;
			System.out.println("Static Block Veli");
		}
		
		// static block her zaman once calisir
		//Sonta java main methoda girer.
		//Static block main methodun disinda classin icersinde yazilir.
		//Genel kullanim main methodun ustune yazilir.
		
// Console ciktisi		
//		Static Block Ali
//		Static Block Veli
//		Constructor
//		Main Method
//		Constructor


	

}
