package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		

		
		List<String> sl = new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		//Bir elemani degistirme nasil yapilir?
		sl.set(0, "Aliye");//set() methodu bir elemani degistirmeye yarar. Ali, Aliye ile yer degistirdi.
		System.out.println(sl);//[Aliye, Kemal, Ayse]
		
		//bir elemanin varligini ve yoklugunu kontrol etmek
		System.out.println(sl.contains("Kemal"));//true
		System.out.println(sl.contains("www"));//false
		
		//Elemanlari natural order a gore dizmek
		//Sayilari, harf ve kelimeleri (kucukten buyuge +alfabetik siralama) denir
		Collections.sort(sl);// tester alaninda cok kullanilir.
		System.out.println(sl);//[Aliye, Ayse, Kemal]
		
		// elemanlari natural ordera gore tersten siralama nasil yapilir
		Collections.reverse(sl);//reserve 
		System.out.println(sl);//[Kemal, Ayse, Aliye]
		
		// Sebze meyve ve oyuncak sayfalarinda 10 dan fazla urun olmamali
		//List<String> ls=new ArrayList<>();
		//if(list.size<=10) {
		
		sl.clear();//Listteki urunlerin tamamini siler
		System.out.println(sl);//[]
		
		//List'ler asla primitive'ler ile calismazlar. CTE hatasi verir
		//List'ler non-primitive'ler ile calisirlar
		//Array'laer de prtimitive ler ile calisir.
		
		/*
		 * Her primitive data typenin bir WRAPPER CLASS'i vardir.
		 Primitive == Wrapper Class
		 * boolean  ==>Boolean(non-primitive)
		 * char==>Character
		 * byte==>Byte
		 * short==>Short
		 * int==>Integer
		 * long==>Long
		 * float==>Float
		 * double==>Double
		 */
		//Iki list'in birbirine esit olup olmadigini nasil anlariz
		List<Integer> il1=new ArrayList<>();
		il1.add(12);
		il1.add(13);
		il1.add(14);
		il1.add(15);
		
		List<Integer> il2=new ArrayList<>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		il2.add(15);
		
		System.out.println(il1.equals(il2));//true  //Esitse true degilse false verir.
		//Hem elemanlari hem de elemanlarin yerlerini kontrol eder.
		//Elemanlarin yerleri farkli ise false verir.

}
}