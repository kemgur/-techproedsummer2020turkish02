package day19Arrays;

import java.util.Arrays;

public class A01 {

	//Arrays.sort(); methodu sayilari kuxukten buyuge ve stringleri de a'dan z'ye siralayabilir.
	
	public static void main(String[] args) {
		
		int arr[]= {3, 7, 1, 18};
		
		//Array elemanlarini kucukten buyuge siralamak icin sort methodunu kullaniriz.
		
		System.out.println(Arrays.toString(arr));//[3, 7, 1, 18]
		
		//sort: siralamak,siniflandirmak, cesit, cins anlamlarina gelir.
		Arrays.sort(arr);//sort methodu kucukten buyuge siralar
		
		System.out.println(Arrays.toString(arr));//[1, 3, 7, 18]
		
		
		//Tast: //Bir string eleman olusturun elemanlarini alfabetik siraya gore sirayalim
		
		String arr1 []= {"Ali", "Veli", "Hasan", "Huseyin"};
		
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		//Tast:Bir integer array'daki en buyuk sayiyi ve en kucuk sayiyi ekrana yazdiran vir kod yaziniz.
		
		int arr2[]= {13,9,6,8,3,21,45,66,15};
		
		Arrays.sort(arr2);// Sayilari sort methodu ile kucukten buyge siraladiktan sonra 0 index en kucuk sayi,
		// arr2.length-1 indexi ise en buyuk sayi olacaktir.
		
		System.out.println(Arrays.toString(arr2));//[3, 6, 8, 9, 13, 15, 21, 45, 66]
		
		System.out.println("Array'in en kucuk sayisi: "+ arr2[0]);
		System.out.println("Array'in en buyuk sayisi: "+ arr2[arr2.length-1]);
		
		
		//Bir string array olusturun ve bastan ve sondan 2. elemanlari ekrana yazdirin.
		
		String arr3[]= {"Selma", "Erdal", "Ipek", "Pakize", "Kemal"};
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));//[Erdal, Ipek, Kemal, Pakize, Selma]
		
		System.out.println("Bastan ikinci index: "+ arr3[1]);
		System.out.println("Sondan ikinci index: "+ arr3[arr3.length-2]);
		
		
		// Bir elmanin array'da olup olmadigini kontrol etmek
		
		int arr4[]= {2,1,9,3,5,7};
		//Yukaridaki arrayde 7 elemanin olup olmadigini kontrol edin.
		
		//1.yol for loop
		
		int count = 0;
		
		for (int i = 0; i < arr4.length; i++) {
			if(arr4[i]==7) {
			count++;
				
			}
			
		}
		if(count!=0) {
			System.out.println("7 eleman olarak var");
			
		}else {
			System.out.println("7 eleman olarak yok");
		}
		
		
		//2.yol binarySearch() kullanmak icin;
		// Oncelikle arrayi sort edecegiz.
		
		//
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));//[1, 2, 3, 5, 7, 9]
		
		Arrays.binarySearch(arr4, 7); //arr4'in icerisinde 7 varsa bana consola indexini yazdirir.
		System.out.println(Arrays.binarySearch(arr4, 7));//4 ==> &'nin indexi 4'mus.
		
		/*
		 binarySearch(); methodu eleman array'de var oldugunda asla negatif output vermez.
		 binarySearch(); methodu array'da eleman yoksa negatif bir output verir.
		 */
		
		System.out.println(Arrays.binarySearch(arr4, 6));//-5 ==> "-" nin anlami "eleman yok" dmektir.
		// -5 ise eger bu elam olsaydi 5.sirada olurdu, demektir. Index'ten bahsetmiyor, siralamadan bahsediyor.
		
		  System.out.println(Arrays.binarySearch(arr4, 4));//-4
		    System.out.println(Arrays.binarySearch(arr4, 99));//-6
		    //note: Bir array'da tekrarli elemanlar varsa binarySearch()
		    //methodu elemanin var olup olmadigi hakkinda dogru karar
		    //verebilir ama o elemanin sirasi hakkinda bazen yanilabilir
		    
		    int mrr[]= {1, 3, 8, 3, 11};
		    Arrays.sort(mrr);//
		 System.out.println(Arrays.binarySearch(mrr, 3));// 1 veya 3 sonucunu vermesi gerekir
		 //ama sonucu 2 verdi. 
		
		
		

	}

}
