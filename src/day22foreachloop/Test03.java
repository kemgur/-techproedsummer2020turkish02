package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(8);
		list.add(9);
		list.remove(9);
		System.out.println(list);//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 9, Size: 3
	
		/*
		 1) Data type'i Integer olan List'lerde remove()methodu kullanip paranteze sayi girerseniz
		 java bunu index degeri olarak algilar. Bu indexte bir eleman yoksa TRE verir.
		 
		 2)  Data type'i Integer olan List'lerde remove()methodu kullanilacaksa index dikkate alinarak kullanilmali.
		 index dikkate alinarak eleman silinmelidir.		
		  */
		

	}

}
