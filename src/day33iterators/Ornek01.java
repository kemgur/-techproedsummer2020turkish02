package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ornek01 {

	/*
	 String bir list olusturun.
	 Her elemanin basina "K", sonuna "L" ekleyin.
	 Yeni listi ekrana yazdirin.
	 
	 */

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<>();
		list2.add("P");
		list2.add("A");
		list2.add("K");
		list2.add("I");
		list2.add("Z");
		list2.add("E");
		System.out.println(list2);//[P, A, K, I, Z, E]
		
		ListIterator<String> li2 = list2.listIterator();
		
		while(li2.hasNext()) {
			Object element = li2.next();
			li2.set("K" +element +"L" );
			
		}
		 // loop kullanarak colleksinlari 'leri update edemeyiz.Sadece elemanlari update edebiliriz.
		System.out.println(list2);//[KPL, KAL, KKL, KIL, KZL, KEL]
		
	}

}
