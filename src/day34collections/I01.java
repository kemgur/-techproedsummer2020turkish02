package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	/*
	 1) Collection 'lari update edebilmek icin kullaniyoruz.
	
	 2) Loop ile update edemez misiniz? 
	    Hayir loop List'in yapisini degistiremez, sadece elemanlar arasinda gezebilir.
	 
	 3) ListIterator'dan sonra cogunlukla while dongusu kullanilir.Baska dongulerle de yapilir ama 
	    temel kullanim boyle.
	    
	 4) hasNext(); pointer'a "Senden sonra eleman var mi? " diye sorar. 
		 Pointerdan sonra eleman varsa true; yoksa false cevabini alir.
		 cevap ture ise loop bir kez daha calisir, cevap false ise loop kirilir.
	 
	 5) next();pointer'i bir sonraki elemanin onune tasinir ve ustunden altadigi elemani
		 return eder.
	 6) set(); list icerisindeki elemanlari degistirmeye yarar.
		 */  
	 
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
		list.add("Z");
		System.out.println(list);//[X, Y, Z]
		
		//Listi [ZA, YA, XA] SEKLINE ITERATOR KULLANARAK DONUSTURUR.
		
		ListIterator<String> li = list.listIterator();
		
		while(li.hasNext()) {
			Object el = li.next();
			li.set(el + "A");
		}
		System.out.println(list);//[XA, YA, ZA]
		
		//While dongusu bitince pointer en sondadir.
		while(li.hasPrevious()) {////pointer'a arkadanda eleman var mi? diye sorar.
			
			Object el =li.previous();// pointer i bir geri alir ve 
			//alirken gerisindeki elemani alip "el"in icine atar.
			
		System.out.println(el + " ");	//ZA YA XA 
			
		}
		System.out.print(list);//[XA, YA, ZA]

		/*
		 *  hasPrevious() ve previous() methodlarini kullanabilmek icin
		 *  oncesinde hasNext() ve has() methodlarini kullanmak zorundayiz.
		 *  Pointer'in en saga gedebilmesi icin.
		 *  
		 */
	}

}
