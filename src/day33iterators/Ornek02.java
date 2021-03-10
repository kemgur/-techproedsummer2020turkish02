package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ornek02 {

	public static void main(String[] args) {
		/*
		 String bir list olusturun.
		 Her elemanin basina "P", sonuna "E" ekleyin.
		 Yeni listi ekrana yazdirin.
		 
		 */

		 List<String> list = new ArrayList<>();
		 list.add("K");
		 list.add("E");
		 list.add("M");
		 list.add("A");
		 list.add("L");
		 System.out.println(list);//[K, E, M, A, L]
		 
		 ListIterator<String> li = list.listIterator();
		 
		 while(li.hasNext()) {
			 Object element  = li.next();
			 li.set("P" +element +"E");
		 }
		 
		 System.out.println(list);//[PKE, PEE, PME, PAE, PLE]
		 

	}

}
