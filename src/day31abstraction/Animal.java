package day31abstraction;

public abstract class Animal {
/*INTERVIEW DE CIKABILIR.
1) "abstract" soyut demektir, zit anlamlisi "concrete" dir. Concrete(beton, anlamida vardir.)
"concrete" somut demektir.

2) "abstract" classlardan obje uretulmez. Cunku object concrete(somut)'tir
ama "abstract" class abstract(soyut)'tur.

3) abstract class olusturarak child class'lari
 bazi seyleri yapmaya mecbur kilariz.
 abstrack class icerisinde olusturdugumuz abstract methodlar child class;lar
 tarafindan uygulanmak zorundadir. concrete class icine abstrav method yazamayiz.
 
 4) "abstract" class icerisinde olusturdugunuz abstract methodlar'
 child classlar tarafindan uygulanmak zorundadir.
 concrete class'in icerisine abstract method yazamayiz.
 Bu methodlar  child class'lar tarafindan istege bagli olarak kullanilabilirler

5) "abstract" classlarin icerisine abstract olmayan(concrete) method'lar yazabiliriz.
Bu method'lar child class'lar tarafindan istege bagli olarak kullanilabilir

6) abstract methodlarin body'si olmaz ==> abstract eat();
   concrete methodlarin body'si vardir. ==> eat (){}// methodun basina concrete yazilmaz.
   
7) abstract method, herhangi bir child class tarafindan  bir kez override edildiginde
    baska claslar(child) tarafindan override edilme zorunlulugu kalkar.  
    
8) abstract child class'in, parenttaki abstrac methodu override etme zorunlulugu yok ama
   o methodu override ederse diger concrete classlarin override etme zorunlulugu kalkar.
   
         


*/

	public abstract void asi();//abstract method

	public abstract void drink ();
	
	public void yemek () { //concrete method
		System.out.println("Yemek yerler");
	//Hem body'si var hemde return type'dan once abstract yazmiyor.
	}

	
	
}
