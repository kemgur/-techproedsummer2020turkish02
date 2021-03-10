package Lambda01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

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
        
        kareCiftFunctional(list);
        System.out.println();
        kupBirFazlaTekFunctional(list);	
        System.out.println();
        kareKokCiftFunctional(list);
        System.out.println();
        maxElFunctional(list);
	}
	//Cift sayi olan elemanlarin karesini ayni satirda aralarina bosluk birakarak console'a yazdiriniz
	public static void kareCiftFunctional(List<Integer> list) {
	list.stream().filter(Lambda01::isCift).map(t->t*t).forEach(Lambda01::printEl);//144 16 36 4 16 144 
	// map() methodu ile elementlar update edilir.Map() methodunun icersine lambda expression yazilir.
	//forEach() methodu ile elemanlar yazdirilir.
	}

	//Tek sayi olan elemanlarin kupunun 1 fazlasini ayni satirda aralarina bosluk birakarak console'a yazdiriniz
	public static void kupBirFazlaTekFunctional(List<Integer> list) {
	list.stream().filter(t->t%2!=0).map(t->t*t*t+1).forEach(Lambda01::printEl);//730 2198 3376 	
	}
	//Cift sayi olan elemanlarin kare kokunu console'a yazdiriniz
	public static void kareKokCiftFunctional(List<Integer> list) {
	list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
		
	}
	
	//En buyuk elemani console'a yazdirin
	public static void maxElFunctional(List<Integer> list) {
	Optional<Integer> max = list.stream().reduce(Math::max);//reduce() bir cok datayi tek bir dataya donusturmek istedigimizde kullanilir. 4 islemi de yapabiliriz.
	//Optional<Integer>  bir nevi exception gibi. Varsa max sayiyi verir, yoksa null verir.
	System.out.println(max);//Optional[15]  Data type optional oldugu icin sonucu boyle yazdirir. Bu durum sorun degil.	
	}
	
	
	
	
	
	
	
}

