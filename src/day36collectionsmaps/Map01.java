package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	
	/*
	 	1) Maps'ler Collections degildir.
	 	
		2) HashMap'ler her zaman rasgele siralama yapar.
		
		3) Map'lerde "key" degerleri "unique" olmak zorundadir,
		  "value" kismi tekrarli olabilir.
		  
		4) HashMap tum elemenleri "{}"(curly braces) icerisinde gosterir. 
		   Ama  keySet() ve values() methodlari kullanildiginda "[]"(brackets) icerisinde kullanilir. (Collection'lar gibi)  
		  
	 	4) Map interfase'nin altinda 3 tane concrete class vardir.
	 	   1) HashMap
	 	   		a) Siralama yapmaz , rastgele siralar. Az is yaptigi icin hizli calisiyor.
	 	   		b) en hizlilari HashMap'tir.
	 	   		c) HashMap not-synchronized ve not-thread safe dirler.
	 	   		d) HashMap sencorize calisamaz. Ayni anda birden cok is yapamaz. 
	 	   		e) HashMap bir tane null key ve multiple null value kullanabilir.
	 	   		f) HashMap'te key icin birden cok "null" kullanirsaniz oncekileri siler en sonuncusunu kullanir.
	 	   		g) HashMap'te value icin bir den cok "null" kullanirsaniz hepsini kabul eder.
	 	   		
	 	   2) HashTable
	 	        a) HashMap synchronized ve thread safe dirler. 
	 	        b) HashMap senkorize calisabilir. Ayni anda birden cok is yapabilir. 
	 	        c) HashTable key ve value icin kullanilmaz.
	 	        d) HashMap yavastir. 
	 	        e) Elemanlarini rasgele siralar.
	 	        
	 	   3) TreeMap
	 	       a) "Tree" kelimesini gorunce aklimiza siralama gelmeli.
	 	       b) TreeMap siralama yapar.(TreeSet gibi)
	 	       c) Siralama ile ugrastigi icin zaman kaybediyor ve yavas calisiyor.
	 	       d) TreeMap not-synchronized ve not-thread safe dirler.
	 	       e) TreeMap nullkey kullanamaz ama nullvalues kullanabilir.
	 	       f)TreeMap elemanlarini natural order yapar.
	 	       
	 	    4) Thread Safe: Ayni anda bir den cok is yapmaktir.
               Ornegin annenizle goruntulu gorusurken ayni anda goruntu ve sesinizin 
               karsi tarafa gitmesi ve annenizin goruntu ve sesini duymaniz.
               Ayni anda mesaj yazmaniz ve ya resim gondermeniz. Binlarin her biri birer thread'tir.
             
                  
	 */
	public static void main(String[] args) {
		// Elmas'in icerisine iki tane data type yazmaliyiz.
		//Bir tanesi "key" digeri "value" icin olmali.
		//Tum data type'larin non-primitive olma si gerekir.
		//Primitive data type yerine Wrapper data type kullanmaliyiz.
		HashMap<Integer, String> hm01 = new HashMap<>();
		//add() methodu Collection'larda kullanilirdi.
		//Map'lerde element eklemek icin put() methodu kullanilir.
		hm01.put(100, "Ali");
		hm01.put(101, "Emine");
		hm01.put(102, "Veli");
		hm01.put(103, "Ayse");
		hm01.put(108, "Kemal");
		System.out.println(hm01);//{100=Ali, 101=Emine, 102=Veli, 103=Ayse, 108=Kemal}
		
		//Ayni key degeri ile ikinci defa "put()" kullanirsaniz ustune yazar.
		hm01.put(102, "XXXX");
		System.out.println(hm01);//{100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 108=Kemal}

		//Ayni value ama key farkli.
		hm01.put(104, "XXXX");
		System.out.println(hm01);//{100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 104=XXXX, 108=Kemal}
		
		//"key" null kabul eder mi? 
		// Cevap: Kabul eder ama sadece 1 tane null kabul eder, 
		//ikinci defa null "key" yazarsaniz ustune yazar.  
		hm01.put(null, "YYYY");// 2. null'i kabul etmez.

		System.out.println(hm01);//{null=YYYY, 100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 104=XXXX, 108=Kemal}
		
		//HasMap value olarak "null" kabul eder mi? 
		//Cevap: HasMap value olarak 1'den fazla "null" kabul eder.
		
		hm01.put(105, null);
		hm01.put(106, null);
		hm01.put(107, null);
		System.out.println(hm01);
		//{null=YYYY, 100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 104=XXXX, 105=null, 106=null, 107=null, 108=Kemal}

		System.out.println(hm01.containsKey(102));//true
		System.out.println(hm01.containsKey(12));//false
		
		System.out.println(hm01.containsValue("Ayse"));//true
		System.out.println(hm01.containsValue("Ramazan"));//false
		
		// Map'lerde herhangi bir elemanin value'sunu 
		//almak icin "get()" methodu "key" parametresi ile alinir.
		System.out.println(hm01.get(101));//Emine
		
		// "key" varsa o "key"e ait value'yu return eder, "key" yok ise ikinci parametrede
		//ne yaziyorsa ("Oyle bir isim yok") onu return eder.
		System.out.println(hm01.getOrDefault(11, "Oyle bir isim yok"));//Oyle bir isim yok
		
		//Tum "value"lari bir arada gormek isterseniz keySet() methodunu kullaniriz.
		System.out.println(hm01.keySet());//[null, 100, 101, 102, 103, 104, 105, 106, 107]==>Coolection'lardaki "Set" tipi
		//Set, demek tekrarsiz demektir.
		 
		////Tum "value"lari bir arada gormek isterseniz values() methodunu kullaniriz.
		System.out.println(hm01.values());//[YYYY, Ali, Emine, XXXX, Ayse, XXXX, null, null, null]

		//putIfAbsent(108, "Kemal") methodu map'e bakar; map'de key olarak 108 yoksa 
		//"kemal"i ekler.
		hm01.putIfAbsent(108, "Kemal");
		System.out.println(hm01);
		
		hm01.putIfAbsent(108, "Muharrem");
		System.out.println(hm01);
		
		//Asagidaki kod "key"si null olan elemani remove eder(siler).
		hm01.remove(null);
		System.out.println(hm01);
		
		//Iki sarta gore silme yapar, key: 103 ve value : ayse ise siler.
		hm01.remove(103, "Ayse");//103'te Ayse varsa siler.
		System.out.println(hm01);
		
		//102' de value "Valid" ise silmez ve hata da vermez.
		hm01.remove(102, "Valid");
		System.out.println(hm01);
		
		//replace(102, "Mustafa") ile put(102, "Mustafa") ayni seyi yapar.
		hm01.replace(102, "Mustafa");
		System.out.println(hm01);
		
		hm01.replace(105, null, "Jockson");
		System.out.println(hm01);
		
		System.out.println(hm01.size());//8
		
	
	}

}
