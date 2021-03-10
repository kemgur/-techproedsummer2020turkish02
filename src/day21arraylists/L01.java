package day21arraylists;


import java.util.ArrayList;
import java.util.List;

public class L01 {

		/*
		 Array ile List'in farki nedir?
		 1) Array'in uzunlugu bellidir. List'in uzunlugu degiskendir.
		 2) Array is fixed size. List is flexible.
		 
		 
	1) Array'in uzunlugu sabittir, Lists'in uzunlugu degiskendir
	Array'lerin uzunluklari en basta belirlenir ve bir daha degismez
	Lists(ArrayList)'lerde ise list olusturulurken uzunluk belirlemeye gerek yoktur 
	cunku list'ler eleman eklendikce kendilerini buyutur,
	eleman silindikce kendilerini kucultur.
	
    2)Listler cok kullanisli method'lara sahiptir.
	Bu yuzden array'lere tercih edilir.
	
	3) Array'lar primitive ve referance'lari eleman olarak kabul ederler.
		Ama List'ler sadece non-primitivleri eleman olaraka kabul ederler.
	4) ArrayList olustururken data type bastan belirtilir.
		 */
	
	public static void main(String[] args) {
		
		//List'ler nasil olusturulur.
		
		//1.Yol
		ArrayList<String> sl1 = new ArrayList<String>();
		//ArrayList<String> sl = new ArrayList<String>(); ==> Bazen ikinci elmasi icine de data Type yazilabilir.
		System.out.println(sl1);
		
		//2.Yol
		ArrayList<String> sl2 = new ArrayList<>();
		System.out.println(sl2);
		
		//3.yol: Yangin  olarak bunu kullanacagiz.
		List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);//[]
		
		sl3.add("A");
		System.out.println(sl3);//[A]
		
		sl3.add("B");
		System.out.println(sl3);//[A, B]
		//add() methodu yeni elemani her zaman sag tarafa ekler
		
		sl3.add("C");
		System.out.println(sl3);//[A, B, C]
		
		// Herhangi bir index'e eleman eklemek nasil yapilir
		sl3.add(1, "X");
		System.out.println(sl3);//[A, X, B, C]
		
		sl3.add(0, "Kemal");
		System.out.println(sl3);//[Kemal, A, X, B, C]
		
		//List'lerde eleman sayisini bulmak nasil yapilir.
		System.out.println(sl3.size());//5
		//Arraylerde length, List'lerde size() methoduyla bulunur.
		
		//Bir list'in bos olup-olmadigini nasil anlariz?
		//// How do we know if a list is empty?
		System.out.println(sl3.isEmpty());// Bos ise true, dolu ise false verir.
		
		//Bir list'ten istenen elemani silmek
				//1.YOL
		sl3.remove(0);// Listten eleman silmeye yarar
		System.out.println(sl3);//[A, x, B, C] Kemal silindi
		// Remove() parantezine tamsayi koyarsaniz java onu index kabul eder.
		// o indexi listte bulamazsa RTE verir.
		
		//2.YOL: Eleman secip silebilriz
				sl3.remove("x");// remove.object kullanilirak yapilir
				System.out.println(sl3);//[A, B, C] x kaldirildi.
				
		//ayni elemandan 2 tane varsa oncekini siler
				sl3.add("B");
				System.out.println(sl3);//[A, B, C, B]		
				
				sl3.remove("B");//Ayni eleman varsa ilkini siler.
				System.out.println(sl3);//[A, C, B] oldu
				
		//Olmayan bir elemani silmek istesek ne olur?
				
				sl3.remove("W");// Java elemani bulup silemedigi icin 
				//ayni elemanlarini tekrar yazdirir.
				
				System.out.println(sl3.remove("W"));//false
				//Silme talebini syso ya yazdirirsak False verir.
				//Silebildigi zaman ise True verir
				//remove methodunu index ile kullanirsaniz onun isimini return eder
				
				//remove ne return eder?
				//sl3==>[A,B];
				System.out.println(sl3.remove("A"));//true //true ya da false verir
				System.out.println(sl3.remove(1));//indexi girerseniz sildigi elemani verir //C
				//remove()	methodunun icersine sayi girerseniz onu index olarak algilar.
				//O index listte yoksa RTE verir.O index varsa onu siler ve sildigi egeri consola yazdirir.
	}

}
