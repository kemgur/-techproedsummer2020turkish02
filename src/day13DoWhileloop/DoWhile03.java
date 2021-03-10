package day13DoWhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 * Kullacidan bir sayi alin
		 * Stringin icinde kucuk a varsa kazandiniz yazdrirn
		 * yoksa kaybettiniz yazdirin ve yeni string isteyin
		 * 
		 */

		/*
		 Kullanicidan bir String alin
		 String'in icinde 'a' varsa ekrana "Kazandiniz" yazdirin
		 'a' yoksa ekrana "Kaybettiniz" yazdirin ve yeni String isteyin
		 */

		Scanner scan = new Scanner(System.in);
		String s = "a";//onemli bir detay
		
		do {
			if(!s.contains("a")) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir string giriniz");
			s=scan.nextLine();
			
		}while(!s.contains("a"));
		System.out.println("Kazandiniz");
		 
		scan.close();
	}

}
