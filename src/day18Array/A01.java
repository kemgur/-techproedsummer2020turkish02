package day18Array;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		 /*
		  1) Array olusturken once data typeni soylemek zorundayiz.
		  2) Array'a bir isim vermek zorundayiz.Genellikle arr denir.
		  3) isimden sonra "[]" konur.
		  4) Equel sign "=" konur
		  5) Equel sign "=" dan sonra "new" kelimesi yazilir. Cunku arrayler objectir.
		  		Object uretmek icinden "new" kelimesi kullanilir.
		  6) "new" den sonra objedeki gibi clas ismi yazilmaz. Tekrar data type'i yazilir ve "[]" yazilir.	
		  7) Array'in length' i sondaki koseli parantezin icine yazilir ve sikayeti keser.	
		  8) int arr[] = new int[3];
		  9) System.out.println(Arrays.toString(arr));//[0, 0, 0]
		  10) Default deger olarak 0 atanir.
		  11) Bir array'i consola yazdirmak icin Arrays.toString() kullaniriz.
		  
		  
		  */
		
		int arr[] = new int[3];//[]'i birinci arr den once de yazabiliriz. Ama genel kullanim bu sekildedir.
		//Main method'unda parantez icersinde String array vardir.
		//Bir array'i consola yazdirmak icin Arrays.toString() kullaniriz.
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
		
		//Bir aray' e eleman ekleme==> son eleman 11 olsun. index'e dikkat edelim.
		arr[2] = 11;
		System.out.println(Arrays.toString(arr));//[0, 0, 11]
		
		//orta eleman 9 olsun
		arr[1] = 9;
		System.out.println(Arrays.toString(arr));//[0, 9, 11]
		
		//ilk eleman 8 olsun
		arr[0] = 8;
		System.out.println(Arrays.toString(arr));//[8, 9, 11]
		
		//Fazla eleman yuklemek istersek;
		//arr[3] = 3;
		//System.out.println(Arrays.toString(arr));//java.lang.ArrayIndexOutOfBoundsException: 3
												 //at day18Array.A01.main(A01.java:44)
		// Bir array'de olmayan index'i kullanmaya calisirsaniz RTE(Ran Time Error) aliriz.
		// Yani kodu calistirdiktan sonra konsolda hata mesaji gelir
		
		// Kisa yoldan array olusturup deger atama
		int arr1[] = {8,10, 12, 14};	
		System.out.println(Arrays.toString(arr1));//[8, 10, 12, 14]
		
		// Bir array'deki belli bir elemani ekrana yazdirmak.
		System.out.println(arr1[1]);//10
		System.out.println(arr1[3]);//14
		System.out.println(arr1[0]);//8 ilk eleman her zaman arrayismi[0] ile yazdirilir.
		
		//Her arraydaeki son elemani yazdiran kod ne olabilir?
		int arr3[]= {21, 22, 23, 24, 25, 26};
		System.out.println(arr3.length-1);//5 ==> Son elemanin index'ini verir
		System.out.print(arr3[arr3.length-1]);//26 ==> son elemanin degerini verir.
		// Son eleman her zaman arrayismi[length-1] ile bulunur.
		
		
		// Bir array olusturunuz. 
		//Bu array in tum elemanlarini for-loop kullanarak
		// ekrana ayni satirda aralarinda bosluk koyarak yazdiriniz
		
		
		
		int arr4[]= {1,3,5,7,9};
		for(int i =0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
			
		
			
			System.out.println();
		
			
		}
		
		   //Bir array olusturunuz bu array in indexi cift sayi
	       //olan elemanlari while loop kullanarak ekrana ayni satirda
	       //ve aralarinda bosluk koyarak yazdiriniz
		
		int arr6[]= {21,22,23,24,25,26,27,28,29,30}; 
		
		
		int i = 0;
		
		while(i<arr6.length) {
			if(i%2==0) {
				System.out.print(arr6[i]+ " ");
				
			}
			i++;
		}

		  
		
	}

}
