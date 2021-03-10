package day09nestedternary;

import java.util.Scanner;

public class switch04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanici ay ismini girince o ayin mevsimini ekrana yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay ismi alin");
		String ay = scan.next();
		
		// switch ' lerde boolean' float' double' long kullanilmaz
		// char, byte, short, int ve String kullanilir.
		
		switch(ay) {
		
		  case "aralik": 
		  case "ocak": 
		  case "subat": 
			  System.out.println("kis");
		  case "mart": 
		  case "nisan": 
		  case "mayis": 
			  System.out.println("ilkbahar");
		  case "haziran": 
		  case "temmuz": 
		  case "agustos": 
			  System.out.println("yaz");
		  case "eylul": 
		  case "ekim": 
		  case "kasim": 
			  System.out.println("sonbahar");;
			 break; 
		default:
			System.out.println("gecerli ay ismi giriniz");
			  scan.close();
			  scan.close();

	}

	}

}
