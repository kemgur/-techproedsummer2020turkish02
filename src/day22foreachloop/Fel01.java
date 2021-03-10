package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fel01 {

	public static void main(String[] args) {
		
	//Bir array'i nasil list'e cevirebiliriz?	
	//How can we convert an array to a list?	

		String s[] = {"A", "B","C"};
		List<String> sl = new ArrayList<>();
		
		//Bir array'i nasil list'e cevirebiliriz?	
		//How can we convert an array to a list?
		
		sl = Arrays.asList(s);
		//asList() methodu bir array'i list'e cevirmemizi saglar.
		//The asList () method allows us to convert an array to a list.
		System.out.println(sl);//[A, B, C]
		
		//Bir list nasil array'a cevrilir.
		//How to convert a list to an array.
		//Java'da her class'in parent'i vardir.
		//Parent'i olamayan tek class Object classtir.
		//Object class, tum claslarin parentidir.
		
		//String listtenArray[] = sl.toArray();
		Object[] listtenArray = sl.toArray();
		System.out.println(listtenArray);
		
	}

}
