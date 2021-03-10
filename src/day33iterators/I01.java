package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	// iterator: Bir isi tekrar tekrar yapmak demektir. Loop gibi ama ondan daha fonksiyoneldir.
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		
		//list1 icindeki her elemanin sonuna "A" harfini ekleyin.
		
		for(String w: list1) {
			
			w = w+ "A";	
			
			
			
		}
		System.out.print(list1);//[X, Y, Z]
		
		//list1 icindeki her elemanin sonuna "A" harfini ekleyin.
				// Loop kullanarak list'leri degistiremezsiniz, elemanlari degistirebilir siniz
				//ama list'i update edemezsiniz.
		
		
		// Bir list'i update etmek isterseniz iterator(loop gibidir.) kullanmak zorundasiniz.
		//1.Adim: ListIterator (li1) objesi olusturun
		
		ListIterator<String> li1 = list1.listIterator() ;
		
		//2.Adim? while loop kullanin.
				/*
				 3 tane method kullandik.
				 
				 1) hasNext(); pointer'a "Senden sonra eleman var mi? " diye sorar. 
				 Pointerdan sonra eleman varsa true; yoksa false cevabini alir.
				 cevap true ise loop bir kez daha calisir, cevap false ise loop kirilir.
				 
				 2) next();pointer'i bir sonraki elemanin onune tasinir ve ustunden altadigi elemani
				 return eder.
				
				 3) set(); list icerisindeki elemanlari degistirmeye yarar.
				 */
		while (li1.hasNext()) {///hasnext==> senden sonra eleman var mi?
			
			Object element = li1.next();////pointeri alip bir sonraki elemanin onune koyar.
			// ustunden atladigi elemani alip element'in icine koyar.
			
			
			li1.set(element + "A");//// set methodu(degistir) next'in getirdigi elemanin yanina "A" ekler.
		}
			System.out.println(list1);// [XA, YA, ZA]
			//list'in listiterator'dan farki elemanlarin basina pointer koymasidir.
			
			
			/*
			 String bir list olusturun.
			 Her elemanin basina "k", sonuna "L" ekleyin.
			 Yeni listi ekrana yazdirin.
			 
			 */
	}

}
