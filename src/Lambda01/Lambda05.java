package Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambda05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        ciftLengthSqrTekrarsizReverse(list);
        System.out.println("==========================");
        harfSayisi7denFazla(list);//false
        System.out.println("==========================");
        ilkHarfX(list);
        System.out.println("==========================");
        enAz1r(list);
        System.out.println("==========================");
        harfSayisiReverseIlk(list);//Optional[Jackson]
        System.out.println("==========================");
        harfSayisiReverseIlk2(list);//[Jackson]
        System.out.println("==========================");
        sonHarfSortSonEleman(list);//Optional[Christ]
        System.out.println("==========================");
        sonHarfSortIlkHaricEl(list);
;
	}

	//Character sayilari cift sayili olan elemanlarin character sayilarinin karelerini hesaplayan, 
	//tekrarli olanlari sadece bir kere buyukten kucuge dogru yazdiran bir program yaziniz.
	public static void ciftLengthSqrTekrarsizReverse(List<String> list) {
	
		list.
		stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).
		distinct().sorted(Comparator.reverseOrder()).
		forEach(Lambda01::printEl);	
		//Kod'lar daha okunakli olmasi icin noktadan sonra alt satira gonderilir.
	}
	
	//Tum isimlerin 7 veya 7'den az harf icerdigini gosteren programi yaziniz
	public static void harfSayisi7denFazla(List<String> list) {
		
		boolean result = list.stream().allMatch(t->t.length()<=7);
		
		if(result) {
			System.out.println("Tum elemanlar 7 ve 7'den az harf icerir");
			
		}else {
			System.out.println("En az 1 eleman 7 veya 7'den az haerf icermiyor.");
			}
		}

		//Hicbir elemanin "X" ile baslamadigini gosteren programi yaziniz.
		public static void ilkHarfX(List<String> list) {
			boolean result = list.stream().noneMatch(t->t.startsWith("X"));
			//noneMatch() methodu boolean return eder.Bu method allMatch() methodunun tam tersidir.
			if(result) {
				System.out.println("Hicbir eleman 'X' ile baslamiyor");
			}else {
				System.out.println("En az bir eleman 'X' ile basliyor");
			}//Hicbir eleman 'X' ile baslamiyor
		
		}
		
		//En az 1 elemanin "r" ile bittigini gosteren programi yaziniz
		public static void enAz1r(List<String> list) {
		
			boolean result =list.stream().anyMatch(t->t.endsWith("r"));
			
			if(result) {
				System.out.println("En az bir eleman 'r' ile bitiyor");
			}else {
				System.out.println("Hicbirisi 'r' ile bitmiyor");
			}//anyMatch()(herhangi biri) methodu, verecegem sart bir tanesi bile uyuyorsa bana "true" return edecektir.
				
		}
		//Isimleri character sayilarina gore buyukten kucuge dizdikten sonra ilk ismi ekrana yazdiriniz
		public static void harfSayisiReverseIlk(List<String> list) {
			Optional<String> ilkIsim = list.
					stream().
					sorted(Comparator.comparing(t->t.toString().length()).reversed()).
					findFirst();
			System.out.println(ilkIsim);//Optional[Jackson]
		
		}
		public static void harfSayisiReverseIlk2(List<String> list) {
			Stream<String> ilkIsim = list.
					stream().
					sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
			System.out.println(ilkIsim);//java.util.stream.SliceOps$1@15aeb7ab
			System.out.println(Arrays.toString(ilkIsim.toArray()));//[Jackson]
			/*
			 limit() methoduna yazilan rakam kac ise ilk o kadarki elemanlari alir.
			 methodunu kullanmak isteyince return type'i Stream<String>'e cevirdi. 
			 Stream'ler direkt yazdirilamazlar.Array'a cevip o sekilde yazdirabiliriz.
			 */
		}
		
		
		//Isimleri son harflerine gore siraladiktan sonra son ismi ekrana yazdiriniz
		public static void sonHarfSortSonEleman(List<String> list) {
			Optional<String> sonIsim = list.
					stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).
							reversed()).
							findFirst();
			System.out.println(sonIsim);//Optional[Christ]
		}
		
		//Isimleri son harflerine gore siraladiktan sonra ilk isim haric digerlerini ekrana yazdiriniz
		public static void sonHarfSortIlkHaricEl(List<String> list) {
			list.
			stream().
			sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).
			skip(1).//skip(1) methodla birinci string pass gecilmis olur.Sayet 2 veya 3 yazilsadi 3.elementten sonra yazdirmaya baslardi.
			//skip(list.size()-1).allMatch( // list'in son elemamnini yazdirir)
			forEach(System.out::println);
			
			
			
		}
		
}










