package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ornek03 {

	public static void main(String[] args) {
		/*
		 Bir String list olusturun ve tum elemanlari "XXX" e donusturun
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("AB");
		list1.add("CD");
		list1.add("EF");
		System.out.println(list1);//[AB, CD, EF]
		
		ListIterator<String> li1 = list1.listIterator();
		
		while(li1.hasNext()) {
		
		String el = li1.next();
		
		//li1.set(el.replace(el,"" + el.length()));// Bu kod String'lerin length'ini yazdiri.
		li1.set(el.replace(el, "XXX"));
		
		}
		
		
		System.out.println(list1);//[XXX, XXX, XXX]
	}	

}
