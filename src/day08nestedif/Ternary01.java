package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		//Ternary, if-else 'nin daha kisa yazilmis halidir. 

//		if(5>4) {
//			System.out.println("Elma");}else {System.out.println("Armut");}//Elma
//		
		 //Ternary'a cevirmek
//		String result = 5>4 ? "Elma" : "Armut";
//		System.out.println(result);//Elma
//		
//		//Farkli bir yol 
//		System.out.println(5>4 ? "Elma" : "Armut");
		
		/*
		 * Kullanicidan sayi alin 
		 * Bu sayi 0 dan 9 a kadar ise ekrana " Rakam " yazdirin
		 * Diger durumlarda ekrana "Sayi" yazdirin
		 * Bu soruyu Ternary ile coz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		String results = sayi>=0 && sayi<=9 ? "Rakam" : "Sayi";
		System.out.println(results);
		 
		scan.close();
	}

}
