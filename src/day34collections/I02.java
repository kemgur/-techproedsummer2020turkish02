package day34collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
		list.add("Z");
		System.out.println(list);//[X, Y, Z]
		
		ListIterator<String> li = list.listIterator();
		
		while(li.hasNext()) {
			Object el = li.next();//Pointer'i en saga tasidi.
				
		}
		ListIterator<String> li1 = list.listIterator();
		
		while(li1.hasPrevious()) {//En sagdaki elemanlardan baslayarak list'i update etti.
			Object el = li1.next();
			li1.set(el + "A");
			
		}
		Collections.reverse(list);//List'i ters cevirdik.
		System.out.println(list);//[Z, Y, X]
	}

}
