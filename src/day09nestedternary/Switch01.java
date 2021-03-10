package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir harf alin.
		 * Harf 'a' veya 'A' ise ekrana ilk harf yazdirin
		 * Harf 'b' veya 'B' ise ekrana ikinci harf yazdirin
		 * Harf 'c' veya 'C' ise ekrana iucuncu harf yazdirin
		 * Diger drumlarda ekrana "Tanimlanamadi" yazdirin.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanicidan bir harf alin");
		char ch = scan.next().charAt(0);
		
		if(ch=='a' || ch=='A') {
			System.out.println("ilk harf");
			
		}else if(ch=='b' || ch=='B') {
			System.out.println("ikinci harf");
		
	    }else if(ch=='c' || ch=='C') {
			System.out.println("ikinci harf");
		
	    }else {
	    	System.out.println("Tanimlanamadi" );
	    }
		
		//Ikinci yol
		switch(ch) {
		
		case 'a': // case => durum demektir
			System.out.println("ilk harf");
			break; 
		case 'A':
			System.out.println("ilkharf");
			break;
		case 'b':
			System.out.println("ikinci harf");
			break;
		case 'B':
			System.out.println("ikinci harf");
			break;
		case 'c':
			System.out.println("ucuncu harf");
			break;
		case 'C':
			System.out.println("ucuncu harf");
			break;
		default:
			System.out.println("Tanimlanamadi");
		}
		scan.close();
		
		
	}

}
