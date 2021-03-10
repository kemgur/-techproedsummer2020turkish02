package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	/*
	 1) LinkedList, elemanlari giris sirasina gore siralar.(insertion order)
	 2) LinkedList'te eleman bulmak zordur. Eleman bulmamiz gerektiginde LinkedList kullanmayabiliriz.
	 3) LinkedList Cons(eksileri): eleman bulmak zordur. Eleman bulmamiz gerektiginde LinkedList kullanmayabiliriz.
	 4) List: eleman bulma konusunda daha basarilidir.
	 5) LinkedList pros(pozitif yonleri): Eleman eklemek ve cikarmak cok kolaydir.
	 6) LinkedList'in Ozellikleri
	 	1) Head'de sadece adress vardir ve bir parcadan olusur.
	 	2) Son eleman Null'i point eder.
	 	3) Her elemanin icerisinde "data ve "adress"  kismi olmak uzere iki kisim vardir.
	 	4) Tum elemanlar "pointerlar" ve  "adresler" kullanilarak birbirine baglanir.
	 	5) Her eleman "node" olarak adlandirilir.
	 	6) Her node iki bolumden olusur.
	 	   a) Data/ Value
	 	   b) Pointer / Address / Reference
	 	7) Array'lerden daha dynamic'dirler insert ve delete islemlerinde basarilidirlar
	 	8) Bir elemana ulasmada yavastirlar. cunku index kullanmazlar.
	 	
	*/
	public static void main(String[] args) {
	
		//LinkedList, elemanlari giris sirasina gore siralar.(insertion order)
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Ali");//LinkedList ve ArrayList ikisi de eleman eklerken, add() methodunu kullanir.
		linkedList.add("Veli");
		linkedList.add("Burhan");
		linkedList.add("Kemal");
		linkedList.add("Kerim");
		linkedList.add("Kenan");
		System.out.println(linkedList);//[Ali, Veli, Burhan, Kemal, Kerim, Kenan]
		//Benim siralamama gore siralar.
		
		
		linkedList.add(1, "Cemal");//[Ali, Cemal, Veli, Burhan, Kemal, Kerim, Kenan]
		System.out.println(linkedList);
		
		linkedList.addFirst("Kayahan");//En basa ekleyecek.
		System.out.println(linkedList);//[Kayahan, Ali, Cemal, Veli, Burhan, Kemal, Kerim, Kenan]
		
		linkedList.addLast("Ayse");
		System.out.println(linkedList);//[Kayahan, Ali, Cemal, Veli, Burhan, Kemal, Kerim, Kenan, Ayse]
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);//[XXXX, YYYY, ZZZZ]
		
		//addAll() kullandigimizda ilk list degisir, parantezin icindeki list degismez.
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);//[Kayahan, Ali, Cemal, Veli, Burhan, Kemal, Kerim, Kenan, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);//[Kayahan, Ali, Cemal, Veli, Burhan, XXXX, YYYY, ZZZZ, Kemal, Kerim, Kenan, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.remove();// ilk elemani siler
		System.out.println(linkedList);
		
		linkedList.remove(1);//indexi 1 olani siler
		System.out.println(linkedList);//Cemal silindi
		
		linkedList.remove("Canan");
		System.out.println(linkedList);
		
		linkedList.remove("Saz");//Olmayan elemani silmez. Hata da vermez.
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");
		System.out.println(linkedList);//Ayni elemanlardan ilkini siler
		
		 linkedList.removeFirstOccurrence("ZZZZ");
		 System.out.println(linkedList);//ilk ZZZZ yi siler. 
		 
		 linkedList.removeLastOccurrence("XXXX");//
		 System.out.println(linkedList);//Son XXX leri siler.
		 
		linkedList.removeAll(linkedList2);//linkedList2 'nin tum elemanlarini siler.
		System.out.println(linkedList);//[Ali, Veli, Burhan, Kemal, Kerim, Kenan, Ayse]
		
		linkedList.removeFirst();//ilk eleman olan Ali'yi siler.
		System.out.println(linkedList);//[Veli, Burhan, Kemal, Kerim, Kenan, Ayse]
		
		linkedList.removeLast();//Son eleman olan Ayse'yi siler.
		System.out.println(linkedList);//[Veli, Burhan, Kemal, Kerim, Kenan]
		
		//Product'larin arasinda ayakkabi disinda urun olmasin.
		linkedList.removeIf(t->t.contains("a"));// Sil eger icinde "a" varsa;(Lambda kullandik)
		System.out.println(linkedList);//[Veli, Kerim]

		
		
		
		
		
		
		
	}

}
