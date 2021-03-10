 package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan cinsiyetini ve yasini aliniz
		 * Erkek ve 18 yasinda kucuk ise "Erkek Cocuk" yazdirin
		 * Diger durumlarda bay yazdirin
		 * Kadin  ve 18 yasinda kucuk ise "Kiz Cocuk" yazdirin
		 * Diger durumlarda bayan yazdirin
		 * Diger durumlarda "Tanimlanamadi" yazin
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz: Erkek/Kadin");
		String cinsiyet = scan.nextLine();
		System.out.println("Yasinizi  giriniz");
		int yas = scan.nextInt();
		
		if(cinsiyet.equals("Erkek")) {
			if(yas<18) {
				System.out.println("Erkek cocuk");
				
			}else {
				System.out.println("Bay");
			}
			
		}else if(cinsiyet.equals("Kadin")) {
			
			if(yas<18) {
				System.out.println("Kiz cocuk");
				
			}else {
				System.out.println("Bayan");
			}
		}else {
			System.out.println("Tanimlanamadi");
		}
		scan.close();
		
		
	}

}
