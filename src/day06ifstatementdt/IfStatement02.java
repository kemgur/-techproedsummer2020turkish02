package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
/*
  Kullanicidan bir gun alin
 "Cuma" girerse "muslumanlar icin kutsal"
 "Cumartesi" girerse "yahudiler icin kutsal gun"
 "Pazar" gunu girerse "hristiyanlar icin kutsal gun"
 
 */

		//String'leri karsilastirirken sakin ha"==" kullanmayin
		//String'leri karsilastirirken "equals()" kullanin.
		//equals(), boolean return eder.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		String gun =scan.nextLine();
		
		if(gun.equals("Cuma")) {
			System.out.println("muslumanlar icin kutsal");	
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");	
		}
		if(gun.equals("Pazar")) {
			System.out.println("hristiyanlar icin kutsal");	
		}
		//if'ten sonra suslu parantezleri kaldirirsak, if'ten sonraki tek satiri alistirir.
		//Suslu parantez kullanmamak risklidir.
		
			scan.close();
	}

}
