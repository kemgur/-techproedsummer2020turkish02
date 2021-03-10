package day18Array;

import java.util.Arrays;

public class A04 {

	public static void main(String[] args) {

		//Length'i farkli olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
		//ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)

	char arr1[]= {'a', 'b', 'c', 'd','e'};
	char arr2[]= {'a', 'b', 'c', 'e', 'd'};
	 
	int z =0;//flag
	
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i]==arr2[i]) {
			z++;		
		}
	} 
	if(z==arr1.length) {
		System.out.println("Ayni");
		
	}else {
		System.out.println("Farkli");//Farkli
	}

//Sonuc:
	//Ayni
	//Ayni
	//Ayni
	//Ayni
	//Ayni
//5 tane "Ayni" seklinde yazdirmamak icin flag olusturmaliyiz.	
	//	int z =0; ==> flag

System.out.println("=====================================");
//2.yol ==> Daha kisa
	
	if(Arrays.equals(arr1, arr2)) {//Arrays.equals methodunu kullandik.
		System.out.println("Ayni");
		
	}else {
		System.out.println("Farkli");
	}
	
	
	
	
	
	
	
	}

}
