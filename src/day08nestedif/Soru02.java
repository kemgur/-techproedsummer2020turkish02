package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		 Eğer urun miktarı 1000 den fazla ise 
	     Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
	     Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim 
	     yapmadan ekrana yazdırın.
	     */
		Scanner scan =new Scanner(System.in);
		System.out.println("Urun adetini giriniz");
		int adet = scan.nextInt();
		System.out.println("Urunun birim fiyatini giriniz");
		int fiyat = scan.nextInt();
		
		if(adet>1000) {
			System.out.println((adet*fiyat)-(adet*fiyat*0.10));
			
		}else {System.out.println((adet*fiyat));
			
		}
scan.close();
	}

}
