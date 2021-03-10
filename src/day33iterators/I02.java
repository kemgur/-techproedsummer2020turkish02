package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		// while loop'un icerisinde next() methodunu kullanmazsaniz
        //pointer hareket etmez ve sonsuz dongu olusur.
		
		ListIterator<String> li1 = list1.listIterator();
		
		while(li1.hasNext()) {
			Object element = li1.next();//Sadece "X" i sil digerleri kalsin dersek yorumdaki kod calisir.
			li1.remove();
			//if(element.equals("Y")) {
			//break;
		}
       System.out.println(list1);//[]
	}
	
	
	/*
	 Bir String list olusturun ve tum elemanlari "XXX" e donusturun
	 */

}
