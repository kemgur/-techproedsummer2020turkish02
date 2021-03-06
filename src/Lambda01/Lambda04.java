package Lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Jackson");
        list.add("Jackson");
        list.add("Tucker");
        list.add("Christ");
        

        buyukHarfSiraliTekrarsiz1(list);
        System.out.println("=====================");
        buyukHarfSiraliTekrarsiz2(list);
        System.out.println();
        charSayisiTersSiraliTekrarsiz(list); //7 6 4 3 
        System.out.println("=======================");
        charSayisinaGoreSirala(list);
        
        
        
        
	}

	//List elemanlarinin tamamini buyuk harfli olarak, alfabetik sirada ve tekrarli elemanlari sadece bir kere console'a yaz
	//Lambda Expression
	public static void buyukHarfSiraliTekrarsiz1(List<String> list) {
	list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);	
	//sorted()'un icerisindeki distinct() methodu tekrarli elemalari bir kez yazdirir.
	}
	
	//Method Reference
	public static void buyukHarfSiraliTekrarsiz2(List<String> list) {
		list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);	
		//String() class'inin icerisinde toUpperCase methodu oldugu icin lambda yerine onu yazabiliriz.	
	}
	
	
	//List elemanlarinin tamaminin character sayisini,
	//ters sirali olarak tekrarli elemanlari 
	//sadece bir kere olacak sekilde console'a yaz
	public static void charSayisiTersSiraliTekrarsiz(List<String> list) {
		list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);//7 6 4 3 
	}
	
	//List elemanlarinin tamamini character sayisina gore
	//kucukten buyuge console'a yazdiriniz
	public static void charSayisinaGoreSirala(List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(System.out::println);
		//sorted() methodunun icersindeki Comparator methodunun icerisindeki comparing methodunu kullandim.
		
	}
	//List elemanlarinin tamamini son harflerine gore 
	//reverse order olarak console'a yazdiriniz
	public static void sonHarfReverse(List<String> list) {
		list.
		   stream().
		   sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		   forEach(System.out::println);
	}
	
	
	
	
}
