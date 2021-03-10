package day35collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TS1 {

	public static void main(String[] args) {
		/*
		 1) TreeSet'i ne zaman kullaniriz?(When do we use TreeSet?)
		    Elemanlari natural order'a gore siralamak istedigimiz zaman  kullaniriz. 
		    (We use it whenever we want to sort the elements according to natural order.)
		    HashSet kullanarak objeyi olustururum, elemanlari HashSet'e eklerim. 
		    Bu elemanlari siralamak icinde olusturdugum HashSet objesini TreeSet'e ceviririm. 	
		 2) TreeSet HashSet'den daha yavastir.
		 
		 */
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		TreeSet<String> ts01 = new TreeSet<>();//Tree kelimesi "siralama"yi, Set kelimesi "tekrarsizligi" hatirlatmali.
		ts01.add("Apple");
		ts01.add("Mango");
		ts01.add("Grape");
		ts01.add("Fig");
		ts01.add("Peach");
		System.out.println(ts01);//[Apple, Fig, Grape, Mango, Peach]
		//Elemanlari natural order a gore sizer.

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		HashSet<String> hs01 = new HashSet<>();
		hs01.add("Apple");
		hs01.add("Mango");
		hs01.add("Grape"); 
		hs01.add("Fig");
		hs01.add("Mandalin");
		hs01.add("Garlic");
		System.out.println(hs01); 
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
	
		//Sirali ve tekrarsiz elamanlarini listelemek icin hangi yontemi yontemi kullanirsin?
	    //(Which method do you use to list the ordered and non-repetitive elements?)
	
	
	HashSet<String> hs02 = new HashSet<>();
	hs02.add("Apple");
	hs02.add("Mango");
	hs02.add("Grape"); 
	hs02.add("Fig");
	hs02.add("Mandalin");
	hs02.add("Garlic");
	System.out.println(hs02);
	
	//HashSet'in eleman ekleme hizindan, TreeSet'inde siralama ozelliginden yararlanmis olduk.
	//Eleman ekleme ve cikarmada hiz gerekriginde HashSet kullaniriz.
	//Siralama gerektiginde HashSet ve TreeSet kullaniriz.
	TreeSet<String> ts02 = new TreeSet<>(hs02);
	System.out.println(ts02);
	LocalTime time3 = LocalTime.now();
	System.out.println(time3);
	
	
	
	}
	
	
	
}
