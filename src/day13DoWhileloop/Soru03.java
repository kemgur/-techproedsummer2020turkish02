package day13DoWhileloop;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan uzunlugu cift sayi olan bir string alin
		 Bu stringin yarisini ekrana yazdirin
		 Ornegin Kullanici "Hollanda" girerse "Holl" yazdirin
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Cift sayili bir karacter girin");
		String s = scan.nextLine();
		
		System.out.println("ilk bolum: "+s.substring(0, s.length()/2));
		System.out.println("Ikinci bolum: "+ s.substring(s.length()/2));

		scan.close();
	}

}
