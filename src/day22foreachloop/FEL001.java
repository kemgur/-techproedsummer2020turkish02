package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL001 {

	public static void main(String[] args) {
		
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(25);
		
		//for each loop = enhanced(zenginlestirilmis) loop
		//Normal for loop'larda sonsuz dongu olusma riski var.
		//for each loop'larda bu tehlike yok.
		//for each loop, list'lerde kullanilir.
		//(for each loop is used in lists.)
		//for each loop, array'lerde kullanilmaz.
		//(for each loop is not used in arrays.)
		//for each loop butun collection'lar icin kullanilir 
		//ama array icin kullailmaz, hata verir.
		
		for(Integer w : il) {
			System.out.print(w +" ");//21 22 23 
		}
		System.out.println();
		//il list'inin tum elemanlarini toplayiniz.
		int sum = 0;
		for(Integer w : il ) {
			sum = sum +w;	
		}
		System.out.println(sum);//66
		
		
		//il listenin icindeki tek sayi olan elemanlarin carpimini bulunuz.
		int product = 1;
		
		for(int w: il) {
			
			if(w%2 !=0) {
				product = product*w;
			}
			
		}
		System.out.println(product);//301875
		
		//il listinin icindeki tek sayi olan elemanlari ekrana yazdirin
		
		for(int w: il) {
			
			if(w%2!=0) {
				System.out.print(w +" ");//21 23 25 25  
			}
			
		}
		System.out.println();
		//for each loop array'lerde kullanilmaz
		/*
		 break ve continue Karsilastirmasi
		 */
		
		
		//il listinin ilk 3 elemanini yazdirin.
		int count = 0;
		for(int w : il) {
			if(count<3) {
				System.out.print(w +" ");//21 22 23 
				count++;	
			}		
		}
	System.out.println();
		//2.yol (by break)
int c =0;
for(int w: il) {
	
	System.out.print(w +" ");//21 22 23 
	c++;
	
	if(c==3) {
		break;
		//break sadece switch'leri kirmaz, for looplari, if looplari da kirabilir.
	}
}
	
System.out.println();
//il list'inde 3 ile bolunebilenleri ekrana yazdirin
//print the ones that can be divided with 3 on the screen.

for(int w : il) {
	if(w%3==0) {
		System.out.print(w +" ");//21 24 		
	}
}

System.out.println();
//2.yol
for(int w: il) {
	if(w%3!=0) {
		continue;// Islemi devam ettirir.
	}else {
		System.out.print(w+" ");//21 24 
	}
}

//3.yol => Yukaridaki kodun daha sade hali, else kaldirildi
System.out.println();
//2.yol
for(int w: il) {
	
	if(w%3!=0) {
		continue;// Islemi devam ettirir.
		// break ve continue karsilastirmasi intervievde sorulabilir
	}
		System.out.print(w+" ");//21 24 
	}
}

	}


