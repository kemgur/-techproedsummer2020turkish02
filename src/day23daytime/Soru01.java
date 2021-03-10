package day23daytime;

import java.util.ArrayList;
import java.util.List;

public class Soru01 {

	/*
	İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
	For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
	Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
*/	
	public static void main(String[] args) {
	
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		List<String> l2 = new ArrayList<>();
		l2.add("A");
		l2.add("B");
		l2.add("Y");
		l2.add("D");
		
		int count=0;
		 for(String w: l1 ) {
			 
			 for(String x : l2) {
				 
				 if(w.equals(x)) {
					System.out.print(w +" ");//A B D 
					count++;
				 }
				 
			 }
			 if(count ==0) {
				System.out.println("Ortak eleman yok"); 
			 }
			 
		 }


	}

}
