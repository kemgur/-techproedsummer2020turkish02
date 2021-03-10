package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	/*
	 1) Queue'da ilk eklenen ilk silinir.
	 2) Application'da ilk eklenenin ilk silinmesi gerekiyorsa Qeueu kullanmaliyiz.
	 3) FIFO :Firts In Firts Out
	 4) Queue'nun concere te olan iki class'i vardir.Bunlar:
	    1) PriorityQueue 
	    2) LinkedList
	 5) LenkedList'i kullanirsam elemanlar benim ekledigim siraya gore dizilirler.   
	 */
	public static void main(String[] args) {
		
		//Ilk eklenen ilk silinir. FIFO :Firts In Firts Out
		Queue<String> q01 = new LinkedList<>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Orange");
		System.out.println(q01);//[Apple, Mango, Fig, Orange]
		//Elemenleri benim girdigim siraya gore siralar.
		  //( Order the elements in the order I entered them)
		
		q01.remove();//Apple silindi
		System.out.println(q01);//[Mango, Fig, Orange]
		
		q01.element();//// Size ilk elemani verir, ama ilk elemani Queue'den silmez.
		//Ilk eleman yoksa "NosuchElementException" verir.
		System.out.println(q01.element());//Mango
		System.out.println(q01);//[Mango, Fig, Orange]
		
		q01.peek();// Ilk elemani size verir, Queue'dan silmez, element methodundan farki 
		//ilk eleman yoksa "null" return eder.

		System.out.println(q01.poll());//Mango=> Size ilk elemani verir, ama onu Queue'dan siler.
		System.out.println(q01);//[Fig, Orange]
	
        
		
		Queue<String> q02 = new PriorityQueue<>();
		
		//PriorityQueue bazen natural order'a gore elemanlari dizer,
		//bazende java arkada kendine gore bir kural olusturur ve ona gore elemanlari dizer.
		//FIFO :Firts In Firts Out gecerlidir.
		q02.add("Apple");
		q02.add("Mango");
		q02.add("Fig");
		q02.add("Peach");
		q02.add("Grape");
		System.out.println(q02);
	}

}
