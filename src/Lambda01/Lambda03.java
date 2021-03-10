package Lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        
        
        ciftKareMax(list);//Optional[144]
        toplamEl(list);//77
        carpimEl(list);//27648
        toplamEl2(list);//Optional[77]
        min1(list);//Optional[2]
        min2(list);//Optional[2]
        min3(list);//Optional[2]
        min4(list);//2
        ondanKucukEnBuyuk(list);//Optional[9]
        tekKupSirala(list);//729 2197 3375 
        System.out.println();
        ciftKareBuyuktenKucuge(list);//144 144 36 16 16 4 
        
	}
//List'teki cift sayi olan elemanlarin karelerini aliniz en buyuk olanini console'a yazdiriniz
	public static void ciftKareMax(List<Integer> list) {
		
		Optional<Integer> max = list.stream().filter(Lambda01::isCift).map(t->t*t).reduce(Integer::max);
		System.out.println(max);//Optional[144]
	}
	
	
	//List'teki tum elemanlarin toplamini console'a yazdiriniz
		//Lambda Expression 
	//Filter() kullanmama gerek yok cunku tum elemanlari toplayacagim. filtreleme yapmayacagim
	//Map() kullanmama gerek yok cunku degistirmemi istemiyor.
	public static void toplamEl(List<Integer> list) {
		int toplam = list.stream().reduce(0,(x,y)->x+y);
		System.out.println(toplam);
		
	}
	//List'teki cift sayi olan elemanlarin carpimini console'a yazdiriniz
	public static void carpimEl(List<Integer> list) {
		int carpim = list.stream().filter(Lambda01::isCift).reduce(1,(x,y)->x*y);
		System.out.println(carpim);//27648
	
}
	//Method Reference
		public static void toplamEl2(List<Integer> list) {
			Optional<Integer> toplam  = list.stream().reduce(Integer::sum);
			System.out.println(toplam);//Optional[77]
}
		
	//Listteki elemanlardan en kucugunu 4 farkli yol kullanarak bulalim
	//1)Method Reference methodlar Java'dan al.	
		
		public static void min1(List<Integer> list) {
			Optional<Integer> min = list.stream().reduce(Integer::min);
			System.out.println(min);//Optional[2]
			
		}
		
		//2)Method Reference methodlar Java'dan al.	
		
		public static void min2(List<Integer> list) {
			Optional<Integer> min = list.stream().reduce(Math::min);
			System.out.println(min);//Optional[2]			
		}
		//3)Mehtod reference methodlar kendimizden
		public static int minBul(int x, int y) {
			return x<y? x: y;
			//Bu method sayesinde Lambda elementleri 2ser olarak alip karsilastirir
			//Ve en son en kucugunu bulur.
			
		}
		public static void min3(List<Integer> list) {
			Optional<Integer> min = list.stream().reduce(Lambda03::minBul);
			System.out.println(min);//Optional[2]			
		}
		
		//4) Lambda Expression
		public static void min4(List<Integer> list) {
			int min = list.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y? x : y);
			System.out.println(min);//Optional[2]	
		}
			/*
			 reduce() methodu icerisindeki degerler nasil calisir?
			 1) Baslangicta x degerini Integer.MAX_VALUE, den alir. y ise stream'den alir.
			 2) Integer.MAX_VALUE degeri y den buyuk oldugu icin ternary'ye gore sart false verir ve ekrana y degerini yazdirir
			 3) Ikinci asamada x degerini result'dan alir, y ise streamden alir.
			 4) Bu sekilde ternary devam ettikce kiyaslaya kiyaslaya en kucuk sayiyi bulur.
			 Note: Minimum degeri ariyorsak Integer.MAX_VALUE, olmali
			 	   Maximum degeri ariyorsak Integer.MIN_VALUE, olmali.
			 */
			
			// Odev: Listteki elemanlardan en buyugunu 4 farkli yol kullanarak bulalim
			
			//List'teki elemanlardan 10 dan kucuk en buyuk sayiyi bulunuz
			 public static void ondanKucukEnBuyuk(List<Integer> list) {
				 Optional<Integer> max=list.stream().filter(t->t<10).reduce(Integer::max);
				 System.out.println(max);//Optional[9]
			 }
			
			//List'teki elemanlardan tek sayi olanlarin kuplerini kucukten buyuge console'a yazdiriniz
			public static void tekKupSirala(List<Integer> list) {
				list.stream().filter(t->t%2!=0).map(t-> t*t*t).sorted().forEach(Lambda01::printEl);
				//729 2197 3375 
			}
			
			//List'teki elemanlardan cift sayi olanlarin karelerini
			//  buyukten kucuge console'a yazdiriniz
				public static void ciftKareBuyuktenKucuge(List<Integer> list) {
				list.stream().filter(t->t%2==0).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lambda01::printEl);
				//144 144 36 16 16 4 
				}
			
		}
		
		
		
		
