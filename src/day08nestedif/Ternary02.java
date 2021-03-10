package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
	
		/*
		 Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın
		 eğer üç kenar uzunluğu birbirine eşit ise ekrana
		 “Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana 
		 “Eşkenar değil” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("üçgenin  üç kenar uzunluğunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2 && k2==k3? "Eskenar Ucgen" :"Eskenar Ucgen Degil"	;
		System.out.println(result);
		
		scan.close();

	}

}
