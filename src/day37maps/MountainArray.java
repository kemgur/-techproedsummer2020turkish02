package day37maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
  1) List'ler Array'lere gore daha gelismistir.
  Bu yuzden interview'lerde List yerine Array'lerdan daha cok soru sorarlar.
  List'te hazir methodlar var onlari kullanmayalim diye.Boylece java bilip bilmedigimizi olcmus oluyorlar.
  
  
  
 */
public class MountainArray {

	
	/*
	    Bu Mountain Array'dir ==> [0, 2, 5, 3, 1]
	    Maximum degere kadar surekli artiyor, maximum degerden sonra surekli azaliyor.
	    Bu tip array'lere mountain array dersek; verilen bir array'in mountain array olup olmadigina
	    karar veren bir program yaziniz
	    
	    Bu Mountain Array degildir ==> [5, 2, 7, 1, 4]
    */
	
	public static void main(String[] args) {
		
		int arr[]= {0,2,5,3,1}; //Bu array'i List'e cevirecegiz.
		List<Integer> l1 = new ArrayList<>(); 
		//arr'deki elemanlari l1'in icine doldurmak icin fooreach loop kullabiliriz.
		for(Integer w: arr) {
			l1.add(w);	
		}
		System.out.println(l1);//[0, 2, 5, 3, 1]
		
		
		//List'in ortasindaki degerin en yuksek deger olup olmadigini bulmam ferekiyor.
		Arrays.sort(arr);//sort() methodu ile elemanlari kucukten buyuge siraladik
		int maxEl = arr[arr.length-1];//son elemanin indexini alip ekrana yazdiriyoruz.
		System.out.println(maxEl);//5
		
		/*
		 Bundan sonra ne yapacagiz?
	 1)  Array'deki elemenleri maxEl'e kadar olan kismini alacagiz ve sort() yapacagiz
	     Ilk siralama ile sort()'dan sonraki siralama ayniysa mountain'in ilk kismi dogru demektir	 
		
	 2) Array elemanlarinin maxEl'den spnraki kismi alacagim.
	    Onu sort() methoduna gore siralayacagim
	    Sonra reverse() methoduna gore ters cevirecegim.
	    Sonra ilk alinan siralama  ile reverse()'den sonraki siralama ayni ise
	    mountain'in sag tarafida tamam demektir. Bu array Mountain Array'dir, diyebiliriz.
		 */
		 
		//ilk kismi al bir liste yerlestir.
		List<Integer> l11 = new ArrayList<>();
		for(int i =0 ; i<=l1.indexOf(maxEl); i++) {
			l11.add(l1.get(i));
		}
		System.out.println(l11);//[0, 2, 5]
		
		//Ilk kismi baska bir list'in icerisine koy ve sort() methodunu uygula.
		//sort() methodu orjinal list'i bozabilir. Ilk ve son halini karsilastirabilmem icin
		//sort yapacagim list icin ayri bir list olusturyorum.
		List<Integer> l11Sorted = new ArrayList<>();
		for(Integer w: l11) {
		l11Sorted.add(w);	
		}
		System.out.println(l11Sorted);//[0, 2, 5]
		//List'leri sort() etmek icin Coolections'a gidilir ve sort() edoilir.
		 Collections.sort(l11Sorted);
		 System.out.println(l11Sorted);
		
		 //sort() ekmeden once ve sort() ettikten sonra list'ler esit ise "tamam" yaz, degilse "tamam degil" yaz.
		if(l11.equals(l11Sorted)) {
			System.out.println("Birinci sart tamam");
		}else {
			System.out.println("Birinci sart tamam degil");
		}
		
		//ikinci kismi al ve bir listin icine yerlestir.
		List<Integer> l12 = new ArrayList<>();
		for(int i =l1.indexOf(maxEl); i<=l1.size()-1; i++) {
		l12.add(l1.get(i));
		}
		System.out.println(l12);//[5, 3, 1]
		
		
		//Ikinci kismi baska bir list'in icine koy ve reverse sort et.
		List<Integer> l12ReverseSorted = new ArrayList<>();
		for(Integer w: l12) {
			l12ReverseSorted.add(w);
		}
		Collections.sort(l12ReverseSorted);
		Collections.reverse(l12ReverseSorted);
		System.out.println(l12ReverseSorted);//[5, 3, 1]
		
		 //Reverse sort() ekmeden once ve sort() ettikten sonra list'ler esit ise "tamam" yaz, degilse "tamam degil" yaz.
		if(l12.equals(l12ReverseSorted)) {
			System.out.println("Ikinci sart tamam");
		}else {
			System.out.println("Ikinci sart tamam degil");
		}
		
		//Son karar
		if(l11.equals(l11Sorted) && l12.equals(l12ReverseSorted)) {
			System.out.println("Bu array Mountain Array'dir");
		}else {
			System.out.println("Bu array Mountain Array'dir");
		}
		
		 
	}

}
