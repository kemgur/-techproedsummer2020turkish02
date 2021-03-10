package Lambda01;

import java.util.ArrayList;
import java.util.List;

public class LambdaReview1 {

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

        //Print all odd numbers from the list [12,9,13,4,6,2,12,15] by Functional Programming
        list.stream().filter(t->t%2!=0).forEach(Lambda01::printEl);//9 13 15 
        
        System.out.println();
        
      //Listteki 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
        list.stream().filter(t->t>6 && t<14).map(t->t*t).forEach(Lambda01::printEl);
        //map() methodu matematiksel islemler yaparak elemanlari degistirir.
	
        System.out.println();
        
        //Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
        //1.Yol
        System.out.println(list.stream().filter(t->t%2!=0).map(Math::sqrt).reduce(Double::sum));
        //reduce() methodu sonucu verir ama yazdirmaz o yuzden syso icerisinde yazdiriyoruz.	
	
        //2.yol
        System.out.println(list.stream().filter(t->t%2!=0).mapToDouble(Math::sqrt).sum());//10.478534621671406
        //mapToDouble() methodunu kullanirsak onun ardindan sum methodunu kullabiliriz.
	
	
	
	
	}

}
