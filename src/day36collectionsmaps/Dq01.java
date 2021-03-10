package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
		
		/*
		 1) Deque: Double Ended Queue
		 2) Double Ended: Iki uclu demektir.
		    Yani; Deque'de sona ekle bastan sil(FIFO) ve basa ekle sondan sil
		    (LIFO: Last In First Out) kuralarinin ikiside calisir.
		 3) Deque'ler resizable'dir.(yeniden boyutlandırılabilir)
		 4) Deque'ler LinkedList'lerden hizlidirlar.(Deques are faster than LinkedLists.)
		 5) Deque'ler eleman olarak "null"  kabul etmezler. (Deques do not accept "null" as an element. ) 
		 */

		Deque<String> dq01 = new LinkedList<>();//Ekleme ve cikarma konusunda zengin methodlari var. 
		dq01.add("Ali");
		dq01.addFirst("Veli");
		dq01.addLast("Can");//Her zaman spesific method daha hizlidir.(The specific method is always faster.)
		dq01.add("Ayse"); 
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan"); 
		
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		dq01.element();//ilk elemani silmeden bize gosterir.
		System.out.println(dq01.element());//Emine
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		dq01.peek();// ilk elemani silmeden size gosterir.
		System.out.println(dq01.peek());//Emine
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		dq01.peekLast();
		System.out.println(dq01.peekLast());//Reyhan
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
	
	
		System.out.println(dq01.poll());//Emine Ilk elemani kesp getirir ve siler.
		System.out.println(dq01);//[Veli, Ali, Can, Ayse, Reyhan]
		
		// Thread safe: Ayni anda birden cok is yapmak.
		
		System.out.println(dq01.pollLast());//Reyhan 'i kesti consolda yazdirdi  ve sildi.
		System.out.println(dq01);//[Veli, Ali, Can, Ayse]

	}

}
